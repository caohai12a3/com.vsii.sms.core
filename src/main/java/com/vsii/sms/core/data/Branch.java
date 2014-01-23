package com.vsii.sms.core.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//
// IMPORTS
// NOTE: Import specific classes without using wildcards.
//
@Entity
@Table(name = "sms_branch")
public class Branch extends BaseEntity
{
    private static final long serialVersionUID = 6550254491178707972L;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", nullable = true, length = 300)
    private String description;

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

}
