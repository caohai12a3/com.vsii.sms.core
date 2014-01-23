/*
 * FILENAME
 *     RolePermission.java
 *
 * FILE LOCATION
 *     $Source$
 *
 * VERSION
 *     $Id$
 *         @version       $Revision$
 *         Check-Out Tag: $Name$
 *         Locked By:     $Lockers$
 *
 * FORMATTING NOTES
 *     * Lines should be limited to 78 characters.
 *     * Files should contain no tabs.
 *     * Indent code using four-character increments.
 *
 * COPYRIGHT
 *     Copyright (C) 2007 Genix Ventures Pty. Ltd. All rights reserved.
 *     This software is the confidential and proprietary information of
 *     Genix Ventures ("Confidential Information"). You shall not
 *     disclose such Confidential Information and shall use it only in
 *     accordance with the terms of the license agreement you entered into
 *     with Genix Ventures.
 */

package com.vsii.sms.core.data;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

public class RolePermission
{
    private String permissionId;
    private String roleId;
    
    public String getPermissionId()
    {
        return permissionId;
    }
    public void setPermissionId(String permissionId)
    {
        this.permissionId = permissionId;
    }
    public String getRoleId()
    {
        return roleId;
    }
    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }
}
