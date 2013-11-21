package com.vsii.sms.core.ui;

import com.vaadin.annotations.Title;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vsii.sms.core.resource.Messages;

@Title("Servey System")
public class SmsUI extends BaseUI
{
	private static final long serialVersionUID = 9148621939177316667L;

	@Override
	protected Component initHeader()
	{
		return new Label(Messages.get("SmsUI.Header"));
	}

	@Override
	protected Component initContent()
	{
		return new Label(Messages.get("SmsUI.Content"));
	}

	@Override
	protected Component initFooter()
	{
		return new Label(Messages.get("SmsUI.Footer"));
	}
}
