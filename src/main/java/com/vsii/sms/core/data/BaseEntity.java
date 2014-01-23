/*
 * FILENAME
 *     BaseEntity.java
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

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//
@MappedSuperclass
public abstract class BaseEntity implements Serializable
{
    private static final long serialVersionUID = 870801569357453836L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private long version;

    /**
     * <p>
     * Getter for id.
     * </p>
     * 
     * @return the id
     */
    public final Long getId()
    {
        return id;
    }

    /**
     * <p>
     * Getter for version.
     * </p>
     * 
     * @return the version
     */
    public long getVersion()
    {
        return version;
    }
}
