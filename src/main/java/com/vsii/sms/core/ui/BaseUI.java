package com.vsii.sms.core.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public abstract class BaseUI extends UI 
{
	private static final long serialVersionUID = 8208880542928342967L;

	@Override
	protected void init(VaadinRequest request)
	{
		VerticalLayout mainLayout = new VerticalLayout();
		setContent(mainLayout);
		
		Component header = initHeader();
		header.setHeight("200px");
		mainLayout.addComponent(header);
		mainLayout.addComponent(initContent());
		mainLayout.addComponent(initFooter());
	}
	
	protected abstract Component initHeader();
	protected abstract Component initContent();
	protected abstract Component initFooter();
	
}
