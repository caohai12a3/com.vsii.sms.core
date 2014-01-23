package com.vsii.sms.core.data;

import javax.persistence.Column;

public class Survey extends BaseEntity
{
    private static final long serialVersionUID = -7008138204895997425L;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", nullable = true, length = 300)
    private String desciption;

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
     * Getter for desciption.
     * </p>
     * 
     * @return the desciption
     */
    public String getDesciption()
    {
        return desciption;
    }

    /**
     * <p>
     * Setting value for desciption.
     * </p>
     * 
     * @param desciption
     *            the desciption to set
     */
    public void setDesciption(String desciption)
    {
        this.desciption = desciption;
    }

}
