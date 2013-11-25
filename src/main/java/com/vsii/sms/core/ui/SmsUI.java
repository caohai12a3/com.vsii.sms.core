package com.vsii.sms.core.ui;

import com.vaadin.annotations.Title;
import com.vaadin.ui.Component;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.VerticalLayout;
import com.vsii.sms.core.resource.Messages;

@Title("Survey System")
public class SmsUI extends BaseUI {
	private static final long serialVersionUID = 9148621939177316667L;
	private MenuBar menubar = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vsii.sms.core.ui.BaseUI#getCustomizeHeader()
	 */
	@Override
	protected Component getCustomizeHeader() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vsii.sms.core.ui.BaseUI#getCustomizeFooter()
	 */
	@Override
	protected Component getCustomizeFooter() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vsii.sms.core.ui.BaseUI#getCustomizeContent()
	 */
	@SuppressWarnings("unused")
	@Override
	protected Component getCustomizeContent() {
		VerticalLayout verticalLayout = new VerticalLayout();

		// Save reference to individual items so we can add sub-menu items to
		// them
		menubar = new MenuBar();
		final MenuBar.MenuItem menuSystemmanagement = menubar.addItem(
				Messages.get("Sms.Menu.Systemmanagement"), null);

		final MenuBar.MenuItem menuSurvey = menubar.addItem(
				Messages.get("Sms.Menu.Survey"), null);
		menuSurvey.addItem(Messages.get("Sms.Menu.Survey.Member"), menuCommand);
		menuSurvey.addItem(Messages.get("Sms.Menu.Survey.CreateSurvey"),
				menuCommand);
		menuSurvey.addItem(Messages.get("Sms.Menu.Survey.SurveyInquiry"),
				menuCommand);
		menuSurvey.addItem(Messages.get("Sms.Menu.Survey.SurveyAnswer"),
				menuCommand);
		menuSurvey.addItem(Messages.get("Sms.Menu.Survey.SurveyResult"),
				menuCommand);

		final MenuBar.MenuItem menuApproval = menubar.addItem(
				Messages.get("Sms.Menu.Approval"), null);
		final MenuBar.MenuItem menuReports = menubar.addItem(
				Messages.get("Sms.Menu.Report"), null);

		menubar.setSizeFull();
		
		verticalLayout.addComponent(menubar);

		return verticalLayout;
	}

	private Command menuCommand = new Command() {
		private static final long serialVersionUID = 492449983753064442L;

		public void menuSelected(MenuItem selectedItem) {

		}
	};
}
