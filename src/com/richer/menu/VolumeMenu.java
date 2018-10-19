package com.richer.menu;

import com.richer.main.Game;

public class VolumeMenu extends Menu {

	@Override
	public void show() {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("\tSet Volume");
		MenuMgr.getMenuMgr().getDeviceDecorator().draw("Input value(0-100):");
	}

	@Override
	public boolean doChoice(int choice) {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Choice = " + choice);
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Set Volume to " + choice);
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
