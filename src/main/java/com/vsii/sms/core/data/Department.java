/*
 * FILENAME
 *     Department.java
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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//

@Entity
@Table(name = "sms_department")
public class Department extends BaseEntity
{
    private static final long serialVersionUID = -2894122523884288848L;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", nullable = true, length = 300)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Branch branch;

    /**
     * <p>
     * Getter for name.
     * </p>
     * 
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * <p>
     * Setting value for name.
     * </p>
     * 
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * <p>
     * Getter for description.
     * </p>
     * 
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * <p>
     * Setting value for description.
     * </p>
     * 
     * @param description
     *            the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * <p>
     * Setting value for branch.
     * </p>
     * 
     * @param branch
     *            the branch to set
     */
    public void setBranch(Branch branch)
    {
        this.branch = branch;
    }

}
