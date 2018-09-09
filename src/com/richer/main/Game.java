package com.richer.main;

import com.richer.map.Map;
import com.richer.menu.*;
import com.richer.player.Player;

public class Game {
	private Menu curMenu;
	private Map map;
	private Player player;
	
	public void init() {
		setCurMenu(MenuId.MAIN_MENU);
	}
	public void run() {
		boolean running = true;
		while(running) {
			running = curMenu.process(this);
		}
	}
	public void term() {
		System.out.println("游戏结束");
	}
	public void setCurMenu(int menuId) {
		switch(menuId) {
		case MenuId.MAIN_MENU: curMenu = new MainMenu(); break;
		case MenuId.LOAD_MENU: curMenu = new LoadMenu(); break;
		case MenuId.SAVE_MENU: curMenu = new SaveMenu(); break;
		case MenuId.PLAYERS_MENU: curMenu = new PlayersMenu(); break;
		case MenuId.MENU_COUNT: curMenu = new MenuCount(); break;
		case MenuId.OPTION_MENU: curMenu = new OptionMenu();break;
		case MenuId.VOLUME_MENU: curMenu = new VolumeMenu();break;
		case MenuId.RESOLUTION_MENU: curMenu = new ResolutionMenu();break;
		}
	}

}



