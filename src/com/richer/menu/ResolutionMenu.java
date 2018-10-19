package com.richer.menu;

import com.richer.main.Game;

public class ResolutionMenu extends Menu {

	@Override
	public void show() {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("\tSet Resolution");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("1. 640 x 320");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("2. 800 x 600");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("3. 1024 x 768");
		MenuMgr.getMenuMgr().getDeviceDecorator().draw("Your selected:");
	}

	@Override
	public boolean doChoice(int choice) {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Choice = " + choice);
		switch(choice) {
		case 1: MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Set Resolution to 640 x 320");break;
		case 2: MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Set Resolution to 800 x 600");break;
		case 3: MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Set Resoluton to 1024 x 768");break;
		}
		Game.getInstance().setCurMenu(MenuId.OPTION_MENU);
		return true;
	}

	@Override
	public boolean process() {
		show();
		int choice = getChoice();
		return doChoice(choice);
	}

}
