package com.richer.menu;

import com.richer.main.Game;

public class OptionMenu extends Menu {

	@Override
	public void show() {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("\t Set options :");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("1.Set the value of Volume(0-100)");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("2.Set the resolution");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("0. Back");
		MenuMgr.getMenuMgr().getDeviceDecorator().draw("Your selected: ");
	}

	@Override
	public boolean doChoice(int choice) {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Choice = " + choice);
		if(choice==1) {
			Game.getInstance().setCurMenu(MenuId.VOLUME_MENU);
		}else if(choice==2) {
			Game.getInstance().setCurMenu(MenuId.RESOLUTION_MENU);
		}else {
			Game.getInstance().setCurMenu(MenuId.MAIN_MENU);
		}
		return true;
	}

	@Override
	public boolean process() {
		show();
		int choice = getChoice();
		return doChoice(choice);
	}

}
