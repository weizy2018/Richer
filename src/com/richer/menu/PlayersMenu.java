package com.richer.menu;

import com.richer.main.Game;

public class PlayersMenu extends Menu {

	@Override
	public void show() {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("\t Set number of players(2-8):");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("2. 2");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("3. 3");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("4. 4");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("5. 5");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("6. 6");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("7. 7");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("8. 8");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("0. Back");
		MenuMgr.getMenuMgr().getDeviceDecorator().draw("Your selected:");
	}

	@Override
	public boolean doChoice(int choice) {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Choice = " + choice);
		if(choice!=0) {
			MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Set number of players = " + choice);
		}
		Game.getInstance().setCurMenu(MenuId.MAIN_MENU);
		return true;
	}

	@Override
	public boolean process() {
		show();
		int choice = getChoice();
		return doChoice(choice);
	}

}
