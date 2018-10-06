package com.richer.menu;

public class MenuMgr {
	private static MenuMgr menuMgr = null;
	private AbsMenuFactory menuFactory = null;
	private Menu menus[];
	
	private Menu curMenu = null;

	private MenuMgr() {
		menus = new Menu[MenuId.MENU_COUNT];
	}

	public static MenuMgr getMenuMgr() {
		if (menuMgr == null) {
			menuMgr = new MenuMgr();
		}
		return menuMgr;
	}
	public void setMenuFactory(AbsMenuFactory menuFactory) {
		this.menuFactory = menuFactory;
	}
	public Menu getMenu(int menuId) {
		if(menuId<0 || menuId>=MenuId.MENU_COUNT) {
			menuId = MenuId.MAIN_MENU;
		}
		if(menus[menuId]==null) {
			menus[menuId] = this.menuFactory.createMenu(menuId);
		}
		return menus[menuId];
	}
	public void setCurMenu(int menuId) {
		this.curMenu = getMenu(menuId);
	}
	public Menu getCurMenu() {
		return this.curMenu;
	}

}








