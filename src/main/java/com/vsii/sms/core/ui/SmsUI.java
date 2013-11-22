package com.vsii.sms.core.ui;

import com.vaadin.annotations.Title;
import com.vaadin.ui.Component;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.VerticalLayout;

@Title("Servey System")
public class SmsUI extends BaseUI {
	private static final long serialVersionUID = 9148621939177316667L;
	private MenuBar menubar = new MenuBar();

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
	@Override
	protected Component getCustomizeContent() {
		VerticalLayout verticalLayout = new VerticalLayout();

		// Save reference to individual items so we can add sub-menu items to
		// them
		final MenuBar.MenuItem file = menubar.addItem("File", null);
		final MenuBar.MenuItem newItem = file.addItem("New", null);
		file.addItem("Open file...", menuCommand);
		file.addSeparator();

		newItem.addItem("File", menuCommand);
		newItem.addItem("Folder", menuCommand);
		newItem.addItem("Project...", menuCommand);

		file.addItem("Close", menuCommand);
		file.addItem("Close All", menuCommand);
		file.addSeparator();

		file.addItem("Save", menuCommand);
		file.addItem("Save As...", menuCommand);
		file.addItem("Save All", menuCommand);

		final MenuBar.MenuItem edit = menubar.addItem("Edit", null);
		edit.addItem("Undo", menuCommand);
		edit.addItem("Redo", menuCommand).setEnabled(false);
		edit.addSeparator();

		edit.addItem("Cut", menuCommand);
		edit.addItem("Copy", menuCommand);
		edit.addItem("Paste", menuCommand);
		edit.addSeparator();

		final MenuBar.MenuItem find = edit.addItem("Find/Replace", menuCommand);

		// Actions can be added inline as well, of course
		find.addItem("Google Search", new Command() {
			private static final long serialVersionUID = -7723967139972250713L;
			public void menuSelected(MenuItem selectedItem) {
				
			}
		});
		find.addSeparator();
		find.addItem("Find/Replace...", menuCommand);
		find.addItem("Find Next", menuCommand);
		find.addItem("Find Previous", menuCommand);

		final MenuBar.MenuItem view = menubar.addItem("View", null);
		view.addItem("Show/Hide Status Bar", menuCommand);
		view.addItem("Customize Toolbar...", menuCommand);
		view.addSeparator();

		view.addItem("Actual Size", menuCommand);
		view.addItem("Zoom In", menuCommand);
		view.addItem("Zoom Out", menuCommand);

		verticalLayout.addComponent(menubar);
		
		return verticalLayout;
	}

	private Command menuCommand = new Command() {
		private static final long serialVersionUID = 492449983753064442L;

		public void menuSelected(MenuItem selectedItem) {
			
		}
	};
}
