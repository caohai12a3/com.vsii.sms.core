package com.vsii.sms.core.resource;

import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * <p>
 * Util class get message from message properties.
 * </p>
 * 
 * @since 1.0
 * @author cao.van.hai
 **/
public final class Messages
{
	public static final String BUNDLE_NAME = "com.vsii.sms.core.resources.messages"; //$NON-NLS-1$

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);

    private Messages()
    {
    }

    /**
     * <p>
     * Get a message from message properties.
     * </p>
     * 
     * @param key
     *            the message to look up
     * @param arguments
     *            optional message arguments
     * @return string message
     **/
    public static String get(final String key, final Object... arguments)
    {
        String value = resourceBundle.getString(key);
        if (arguments == null || arguments.length == 0)
        	return value;
        
        return MessageFormat.format(value, arguments);
    }
}
