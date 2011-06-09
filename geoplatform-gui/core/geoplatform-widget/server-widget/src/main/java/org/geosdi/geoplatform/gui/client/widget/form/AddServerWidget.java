/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-plartform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2011 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
package org.geosdi.geoplatform.gui.client.widget.form;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.ComponentEvent;
import com.extjs.gxt.ui.client.event.KeyListener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.FieldSet;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.FormLayout;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.user.client.rpc.AsyncCallback;
import org.geosdi.geoplatform.gui.client.BasicWidgetResources;
import org.geosdi.geoplatform.gui.client.ServerWidgetResources;
import org.geosdi.geoplatform.gui.client.model.GPServerBeanModel;
import org.geosdi.geoplatform.gui.client.service.GeoPlatformOGCRemote;
import org.geosdi.geoplatform.gui.client.service.GeoPlatformOGCRemoteAsync;
import org.geosdi.geoplatform.gui.client.widget.DisplayServerWidget;
import org.geosdi.geoplatform.gui.client.widget.SaveStatus;
import org.geosdi.geoplatform.gui.client.widget.SaveStatus.EnumSaveStatus;
import org.geosdi.geoplatform.gui.client.widget.SearchStatus.EnumSearchStatus;
import org.geosdi.geoplatform.gui.impl.view.LayoutManager;

/**
 *
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email  giuseppe.lascaleia@geosdi.org
 */
public class AddServerWidget extends GeoPlatformFormWidget<GPServerBeanModel> {

    private DisplayServerWidget displayServerWidget;
    private TextField<String> serverTextField;
    private Button save;
    private Button cancel;

    public AddServerWidget(DisplayServerWidget theWidget) {
        super(true);
        this.displayServerWidget = theWidget;
    }

    @Override
    public void addComponentToForm() {
        this.fieldSet = new FieldSet();
        this.fieldSet.setHeading("Server Url");

        FormLayout layout = new FormLayout();
        layout.setLabelWidth(40);
        fieldSet.setLayout(layout);

        this.serverTextField = new TextField<String>();
        this.serverTextField.setFieldLabel("Server");

        this.serverTextField.addKeyListener(new KeyListener() {

            @Override
            public void componentKeyUp(ComponentEvent event) {
                if (serverTextField.getValue() == null) {
                    if ((event.getKeyCode() == KeyCodes.KEY_BACKSPACE)
                            || (event.getKeyCode() == KeyCodes.KEY_DELETE)) {
                        reset();
                    }
                } else {
                    if (serverTextField.getValue().length() > 13) {
                        save.enable();
                    } else {
                        save.disable();
                    }
                }
            }

            @Override
            public void componentKeyPress(ComponentEvent event) {
                if ((event.getKeyCode() == 13) && (serverTextField.getValue() != null)
                        && (serverTextField.getValue().length() > 13)) {
                    execute();
                }
            }
        });

        this.fieldSet.add(this.serverTextField);

        this.formPanel.add(this.fieldSet);

        this.saveStatus = new SaveStatus();
        this.saveStatus.setAutoWidth(true);

        this.formPanel.getButtonBar().add(this.saveStatus);

        formPanel.setButtonAlign(HorizontalAlignment.RIGHT);

        save = new Button("Save", ServerWidgetResources.ICONS.addServer(),
                new SelectionListener<ButtonEvent>() {

                    @Override
                    public void componentSelected(ButtonEvent ce) {
                        execute();
                    }
                });

        save.setEnabled(false);

        this.formPanel.addButton(save);

        this.cancel = new Button("Cancel", BasicWidgetResources.ICONS.cancel(),
                new SelectionListener<ButtonEvent>() {

                    @Override
                    public void componentSelected(ButtonEvent ce) {
                        clearComponents();
                    }
                });

        this.formPanel.addButton(cancel);
    }

    @Override
    public void initSize() {
        setHeading("Add Server");
        setSize(330, 170);
    }

    @Override
    public void initSizeFormPanel() {
        this.formPanel.setHeaderVisible(false);
        this.formPanel.setSize(280, 120);
    }

    @Override
    public void execute() {
        this.saveStatus.setBusy("Adding Server");

        LayoutManager.get().getStatusMap().setBusy("Saving Server");

        GeoPlatformOGCRemote.Util.getInstance().insertServer(
                this.serverTextField.getValue(),
                new AsyncCallback<GPServerBeanModel>() {

                    @Override
                    public void onFailure(Throwable caught) {
                        setSaveStatus(EnumSaveStatus.STATUS_NO_SAVE,
                                EnumSaveStatus.STATUS_MESSAGE_NOT_SAVE);
                        LayoutManager.get().getStatusMap().setStatus(
                                "Save Server Error. " + caught.getMessage(),
                                EnumSearchStatus.STATUS_SEARCH_ERROR.toString());
                    }

                    @Override
                    public void onSuccess(GPServerBeanModel result) {
                    }
                });

    }

    @Override
    public void reset() {
        this.save.disable();
        this.serverTextField.clear();
        this.saveStatus.clearStatus("");
    }

    public void showForm() {
        if (!isInitialized()) {
            super.init();
        }
        super.show();
    }

    private void clearComponents() {
        super.hide();
    }
}