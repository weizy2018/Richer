package com.richer.menu;

public class MenuFactory extends AbsMenuFactory {
	public Menu createMenu(int menuId) {
		Menu menu = null;
		switch(menuId) {
		case MenuId.MAIN_MENU: menu = new MainMenu();break;
		case MenuId.LOAD_MENU: menu = new LoadMenu();break;
		case MenuId.OPTION_MENU: menu = new OptionMenu();break;
		case MenuId.PLAYERS_MENU: menu = new PlayersMenu();break;
		case MenuId.RESOLUTION_MENU: menu = new ResolutionMenu();break;
		case MenuId.VOLUME_MENU: menu = new VolumeMenu();break;
		case MenuId.SAVE_MENU: menu = new SaveMenu();break;
		case MenuId.PLAY_MENU: menu = new PlayMenu();break;
		default: menu = new MainMenu();
		}
		
		return menu;
	}
}
