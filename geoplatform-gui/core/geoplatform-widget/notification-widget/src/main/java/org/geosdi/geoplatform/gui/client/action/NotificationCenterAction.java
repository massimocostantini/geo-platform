/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2012 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details. You should have received a copy of the GNU General
 * Public License along with this program. If not, see http://www.gnu.org/licenses/
 *
 * ====================================================================
 *
 * Linking this library statically or dynamically with other modules is
 * making a combined work based on this library. Thus, the terms and
 * conditions of the GNU General Public License cover the whole combination.
 *
 * As a special exception, the copyright holders of this library give you permission
 * to link this library with independent modules to produce an executable, regardless
 * of the license terms of these independent modules, and to copy and distribute
 * the resulting executable under terms of your choice, provided that you also meet,
 * for each linked independent module, the terms and conditions of the license of
 * that module. An independent module is a module which is not derived from or
 * based on this library. If you modify this library, you may extend this exception
 * to your version of the library, but you are not obligated to do so. If you do not
 * wish to do so, delete this exception statement from your version.
 *
 */
package org.geosdi.geoplatform.gui.client.action;

import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.google.gwt.user.client.rpc.AsyncCallback;
import java.util.List;
import org.geosdi.geoplatform.gui.action.ToolbarMapAction;
import org.geosdi.geoplatform.gui.client.BasicWidgetResources;
import org.geosdi.geoplatform.gui.client.service.NotificationRemote;
import org.geosdi.geoplatform.gui.client.widget.NotificationPopupPanel;
import org.geosdi.geoplatform.gui.client.widget.SearchStatus;
import org.geosdi.geoplatform.gui.configuration.message.GeoPlatformMessage;
import org.geosdi.geoplatform.gui.configuration.users.options.member.UserSessionEnum;
import org.geosdi.geoplatform.gui.global.security.IGPAccountDetail;
import org.geosdi.geoplatform.gui.impl.map.event.GPLoginEvent;
import org.geosdi.geoplatform.gui.impl.view.LayoutManager;
import org.geosdi.geoplatform.gui.model.message.IGPClientMessage;
import org.geosdi.geoplatform.gui.puregwt.GPHandlerManager;
import org.geosdi.geoplatform.gui.utility.GPSessionTimeout;

/**
 * @author Nazzareno Sileno - CNR IMAA geoSDI Group
 * @email nazzareno.sileno@geosdi.org
 */
public class NotificationCenterAction extends ToolbarMapAction {

    private NotificationPopupPanel notificationPopupPanel;

    public NotificationCenterAction(NotificationPopupPanel notificationPopupPanel) {
        super(BasicWidgetResources.ICONS.info(), "Notification Center");
        this.notificationPopupPanel = notificationPopupPanel;
    }

    @Override
    public void componentSelected(ButtonEvent e) {
//        RootLayoutPanel.get().add(new BinderDeckLayout());
//        this.binderDeckLayout.setVisible(Boolean.TRUE);
//        notificationPopupPanel.setStyleName(style.notifypopup());
        notificationPopupPanel.setPopupPosition(e.getTarget().getAbsoluteLeft() - (170),
                e.getTarget().getAbsoluteTop() + (20));
        notificationPopupPanel.show();
        IGPAccountDetail accountDetail = Registry.get(UserSessionEnum.ACCOUNT_DETAIL_IN_SESSION.name());
        List<IGPClientMessage> messageList = accountDetail.getUnreadMessages();
        if (messageList != null && !messageList.isEmpty()) {
            NotificationRemote.Util.getInstance().markMessagesAsRead(new AsyncCallback<Boolean>() {
                @Override
                public void onFailure(Throwable caught) {
                    if (caught.getCause() instanceof GPSessionTimeout) {
                        GPHandlerManager.fireEvent(new GPLoginEvent(null));
                    } else {
                        GeoPlatformMessage.errorMessage("Error Saving the read messages",
                                "An error occurred while making the requested connection.\n"
                                + "Verify network connections and try again."
                                + "\nIf the problem persists contact your system administrator.");
                        LayoutManager.getInstance().getStatusMap().setStatus(
                                "Error Saving the read messages",
                                SearchStatus.EnumSearchStatus.STATUS_NO_SEARCH.toString());
                        System.out.println("Error Saving the read messages: " + caught.toString()
                                + " data: " + caught.getMessage());
                    }
                }

                @Override
                public void onSuccess(Boolean result) {
                }
            });
        }
    }
}
