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

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

@Entity
@Table(name = "sms_role_permission")
public class RolePermission extends BaseEntity
{
    private static final long serialVersionUID = -8681510592514263120L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Permission permission;

    /**
     * <p>
     * Setting value for role.
     * </p>
     * 
     * @param role
     *            the role to set
     */
    public void setRole(Role role)
    {
        this.role = role;
    }

    /**
     * <p>
     * Setting value for permission.
     * </p>
     * 
     * @param permission
     *            the permission to set
     */
    public void setPermission(Permission permission)
    {
        this.permission = permission;
    }
}
