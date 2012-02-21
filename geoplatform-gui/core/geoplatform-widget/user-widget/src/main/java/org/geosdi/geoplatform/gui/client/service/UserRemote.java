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
package org.geosdi.geoplatform.gui.client.service;

import com.extjs.gxt.ui.client.data.PagingLoadConfig;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import java.util.ArrayList;
import java.util.HashMap;
import org.geosdi.geoplatform.gui.client.model.GPUserManageDetail;
import org.geosdi.geoplatform.gui.global.GeoPlatformException;
import org.geosdi.geoplatform.gui.global.security.IGPUserManageDetail;

/**
 *
 * @author Vincenzo Monteverde
 * @email vincenzo.monteverde@geosdi.org - OpenPGP key ID 0xB25F4B38
 */
@RemoteServiceRelativePath("UserRemote")
public interface UserRemote extends RemoteService {

    public static class Util {

        private static UserRemoteAsync instance = (UserRemoteAsync) GWT.create(UserRemote.class);

        public static UserRemoteAsync getInstance() {
            return instance;
        }
    }

    /**
     * 
     * @param request
     * @return 
     */
    PagingLoadResult<GPUserManageDetail> searchUsers(PagingLoadConfig config,
                                                     String searchText)
            throws GeoPlatformException;

    /**
     * 
     * @param userDetail
     * @return
     * @throws GeoPlatformException 
     */
    Long insertUser(IGPUserManageDetail userDetail) throws GeoPlatformException;

    /**
     * 
     * @param userDetail
     * @return
     * @throws GeoPlatformException 
     */
    Long updateUser(IGPUserManageDetail userDetail) throws GeoPlatformException;

    /**
     * 
     * @param userDetail
     * @param currentPlainPassword
     * @return
     * @throws GeoPlatformException 
     */
    Long updateOwnUser(IGPUserManageDetail userDetail,
                       String currentPlainPassword, String newPlainPassword)
            throws GeoPlatformException;

    /**
     * 
     * @param request
     * @return
     * @throws GeoPlatformException 
     */
    boolean deleteUser(Long userID) throws GeoPlatformException;

    /**
     * 
     * @return 
     */
    IGPUserManageDetail getOwnUser();

    /**
     * 
     * @return List of roles
     */
    ArrayList<String> getAllRoles();

    /**
     * 
     * @return List of GuiComponet IDs
     */
    ArrayList<String> getAllGuiComponentIDs();

    /**
     * 
     * @param role
     * @return
     * @throws GeoPlatformException 
     */
    HashMap<String, Boolean> getRolePermission(String role)
            throws GeoPlatformException;

    /**
     * 
     * @param role
     * @param permissionMap
     * @return
     * @throws GeoPlatformException 
     */
    boolean updateRolePermission(String role, HashMap<String, Boolean> permissionMap)
            throws GeoPlatformException;

    /**
     * 
     * @param role
     * @return
     * @throws GeoPlatformException 
     */
    boolean saveRole(String role) throws GeoPlatformException;
}
