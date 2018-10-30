package com.richer.menu;

import com.richer.main.Game;
import com.richer.map.MapMgr;

public class MainMenu extends Menu {

	@Override
	public void show() {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("\t 主菜单");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("1. New");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("2. Load");
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("3. Save");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("4. Option");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("5. Play");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("6. Change Map");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("0. Exit");
		MenuMgr.getMenuMgr().getDeviceDecorator().draw("Your selected:");
	}

	@Override
	public boolean doChoice(int choice) {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Your selectd " + choice);
		
		switch(choice) {
		case 1: Game.getInstance().setCurMenu(MenuId.PLAYERS_MENU);return true;
		case 2: Game.getInstance().setCurMenu(MenuId.LOAD_MENU);return true;
//		case 3: Game.getInstance().setCurMenu(MenuId.SAVE_MENU);return true;
		case 4: Game.getInstance().setCurMenu(MenuId.OPTION_MENU);return true;
		case 5: MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Now is playing ...");
				MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Current Menu :\n");
				MapMgr.getMapMgr().getCurMap().showMap();
				Game.getInstance().setCurMenu(MenuId.PLAY_MENU);
				return true;
//				Game.getInstance().play();
		case 6: MenuMgr.getMenuMgr().getDeviceDecorator().drawln("After change ...");
				Game.getInstance().changeMap();
				Game.getInstance().play();return true;
		default: return false;
		}
	}

	@Override
	public boolean process() {
		show();
		int choice = getChoice();
		return doChoice(choice);
	}


}
