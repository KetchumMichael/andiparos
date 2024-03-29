/*
 *
 * Paros and its related class files.
 * 
 * Paros is an HTTP/HTTPS proxy for assessing web application security.
 * Copyright (C) 2003-2004 Chinotec Technologies Company
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the Clarified Artistic License
 * as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Clarified Artistic License for more details.
 * 
 * You should have received a copy of the Clarified Artistic License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.parosproxy.paros.view;

import java.awt.Component;
import java.util.List;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import org.parosproxy.paros.extension.ExtensionHookMenu;
import org.parosproxy.paros.extension.ExtensionPopupMenu;

/**
 * 
 * To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Generation - Code and Comments
 */
public class MainPopupMenu extends JPopupMenu {

	private static final long serialVersionUID = -6459165340543015220L;
	
	private List<ExtensionPopupMenu> itemList = null;
	private PopupDeleteMenu popupDeleteMenu = null;
	private PopupPurgeMenu popupPurgeMenu = null;
	//private PopupExpandCollapseAllMenu popupExpandCollapseAllMenu = null;
	private PopupCopyUrlToClipboardMenu popupCopyUrlToClipboardMenu = null;

	/**
     * 
     */
	public MainPopupMenu() {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public MainPopupMenu(String arg0) {
		super(arg0);
	}

	public MainPopupMenu(List<ExtensionPopupMenu> itemList) {
		this();
		this.itemList = itemList;
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.add(getPopupDeleteMenu());
		this.add(getPopupPurgeMenu());
		//this.add(getPopupExpandCollapseAllMenu());
		this.add(getPopupCopyUrlToClipboardMenu());
	}

	public synchronized void show(Component invoker, int x, int y) {
		ExtensionPopupMenu menu = null;

		for (int i = 0; i < getComponentCount(); i++) {
			try {
				if (getComponent(i) != null
						&& getComponent(i) instanceof ExtensionPopupMenu) {
					menu = (ExtensionPopupMenu) getComponent(i);
					menu.setVisible(menu.isEnableForComponent(invoker) && menu.isEnabled());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < itemList.size(); i++) {
			menu =  itemList.get(i);
			try {
				if (menu == ExtensionHookMenu.POPUP_MENU_SEPARATOR) {
					this.addSeparator();
					continue;
				}

				if (menu.isEnableForComponent(invoker)) { 
					this.add(menu);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		super.show(invoker, x, y);
	}

	/**
	 * This method initializes popupDeleteMenu
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getPopupDeleteMenu() {
		if (popupDeleteMenu == null) {
			popupDeleteMenu = new PopupDeleteMenu();
		}
		return popupDeleteMenu;
	}

	/**
	 * This method initializes popupPurgeMenu
	 * 
	 * @return org.parosproxy.paros.view.PopupPurgeMenu
	 */
	private PopupPurgeMenu getPopupPurgeMenu() {
		if (popupPurgeMenu == null) {
			popupPurgeMenu = new PopupPurgeMenu();
		}
		return popupPurgeMenu;
	}
	
	/*private PopupExpandCollapseAllMenu getPopupExpandCollapseAllMenu() {
		if (popupExpandCollapseAllMenu == null) {
			popupExpandCollapseAllMenu = new PopupExpandCollapseAllMenu();
		}
		return popupExpandCollapseAllMenu;
	}*/
	
	private JMenuItem getPopupCopyUrlToClipboardMenu() {
		if (popupCopyUrlToClipboardMenu == null) {
			popupCopyUrlToClipboardMenu = new PopupCopyUrlToClipboardMenu();
		}
		return popupCopyUrlToClipboardMenu;
	}
}
