package com.richer.menu;

import com.richer.main.Game;

public class SaveMenu extends Menu {

	@Override
	public void show() {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("\tSelect the Record to save(1-5):");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("1. 1");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("2. 2");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("3. 3");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("4. 4");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("5. 5");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("0. Back");
		MenuMgr.getMenuMgr().getDeviceDecorator().draw("Your selected: ");
		
	}

	@Override
	public boolean doChoice(int choice) {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("You Choice = " + choice);
		if(choice!=0) {
			MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Record " + choice + " was saved");
		}
		
		Game.getInstance().setCurMenu(MenuId.PLAY_MENU);
		return true;
	}

	@Override
	public boolean process() {
		show();
		int choice = getChoice();
		return doChoice(choice);
	}

}
