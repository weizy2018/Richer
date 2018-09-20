package com.richer.main;

import com.richer.map.Map;
import com.richer.menu.*;
import com.richer.player.Player;

public class Game {
	private Menu curMenu;
	private Map map = null;
	private Player player = null;
	
	private static Game game = null;
	
	private Game() {
		
	}
	public static Game getInstance() {
		if(game==null) {
			game = new Game();
		}
		return game;
	}
	
	public void init() {
		setCurMenu(MenuId.MAIN_MENU);
	}
	public void run() {
		boolean running = true;
		while(running) {
			running = curMenu.process();
		}
	}
	public void term() {
		System.out.println("游戏结束");
	}
	public void setCurMenu(int menuId) {
		switch(menuId) {
		case MenuId.MAIN_MENU: curMenu = MenuMgr.getMainMenu(); break;
		case MenuId.LOAD_MENU: curMenu = MenuMgr.getLoadMenu(); break;
		case MenuId.SAVE_MENU: curMenu = MenuMgr.getSaveMenu(); break;
		case MenuId.PLAYERS_MENU: curMenu = MenuMgr.getPlayersMenu(); break;
		case MenuId.OPTION_MENU: curMenu = MenuMgr.getOptionMenu();break;
		case MenuId.VOLUME_MENU: curMenu = MenuMgr.getVolumeMenu();break;
		case MenuId.RESOLUTION_MENU: curMenu = MenuMgr.getResolutionMenu();break;
		}
	}
	public void play() {
		if(map==null) {
			map = new Map();
//			map.createMapByBuilder();
			map.createMapByPrototype();
		}
		map.showMap();
	}
	public void changeMap() {
		if(map==null) {
			map = new Map();
			map.createMapByPrototype();
		}
		map.DynamicChangeMap();
	}


}



