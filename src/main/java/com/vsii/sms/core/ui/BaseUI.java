package com.vsii.sms.core.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public abstract class BaseUI extends UI {
	private static final long serialVersionUID = 8208880542928342967L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vaadin.ui.UI#init(com.vaadin.server.VaadinRequest)
	 */
	@Override
	protected void init(VaadinRequest request) {
		AbsoluteLayout mainLayout = new AbsoluteLayout();
		// add a border to the layout with CSS to indicate its boundaries
		mainLayout.addStyleName("border");
		// allow border to show (100% would clip the right side border)
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		setContent(mainLayout);

		mainLayout.addComponent(initHeader(), "top:5px; left:10px; height: 20%");
		mainLayout.addComponent(initContent(), "top:30px; right:10px; height: 80%");
		mainLayout.addComponent(initFooter(), "bottom:0px; right:10px;");
	}

	private Component initHeader() {
		Component component = getCustomizeHeader();
		if (null == component) {
			component = getDefaultHeader();
		}
		return component;
	}

	protected abstract Component getCustomizeHeader();

	private Component getDefaultHeader() {
		VerticalLayout headerLayout = new VerticalLayout();
		Label topright = new Label("Header");
		headerLayout.addComponent(topright);
		return headerLayout;
	}

	private Component initContent() {
		Component component = getCustomizeContent();
		if (null == component) {
			component = getDefaultContent();
		}
		return component;
	}

	protected abstract Component getCustomizeContent();

	private Component getDefaultContent() {
		VerticalLayout headerLayout = new VerticalLayout();
		Label topright = new Label("Content");
		headerLayout.addComponent(topright);
		return headerLayout;
	}

	private Component initFooter() {
		Component component = getCustomizeFooter();
		if (null == component) {
			component = getDefaultFooter();
		}
		return component;
	}

	protected abstract Component getCustomizeFooter();

	private Component getDefaultFooter() {
		VerticalLayout headerLayout = new VerticalLayout();
		Label topright = new Label("Footer");
		headerLayout.addComponent(topright);
		return headerLayout;
	}
}
