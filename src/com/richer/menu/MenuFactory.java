package com.richer.menu;

public class MenuFactory extends AbsMenuFactory {
	public Menu createMenu(int menuId) {
		switch(menuId) {
		case MenuId.MAIN_MENU:return new MainMenu();
		case MenuId.LOAD_MENU:return new LoadMenu();
		case MenuId.OPTION_MENU:return new OptionMenu();
		case MenuId.PLAYERS_MENU:return new PlayersMenu();
		case MenuId.RESOLUTION_MENU:return new ResolutionMenu();
		case MenuId.VOLUME_MENU:return new VolumeMenu();
		case MenuId.SAVE_MENU:return new SaveMenu();
		default: return new MainMenu();
		}
	}
}
