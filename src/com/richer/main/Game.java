package com.richer.main;

import com.richer.block.BlocksId;
import com.richer.map.MapMgr;
import com.richer.menu.*;
import com.richer.out.*;
import com.richer.player.Player;
import com.richer.prototype.BlockMgr;
import com.richer.block.EBlock;
import com.richer.block.FBlock;

public class Game {
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
		MenuMgr.getMenuMgr().setMenuFactory(new MenuFactory());
		setCurMenu(MenuId.MAIN_MENU);
		MapMgr.getMapMgr().createMap();
		
		OutDevice device = new StreamDevice();
		OutDeviceDecorator deviceDecorator = new TabDecorator(device);
		MenuMgr.getMenuMgr().setDeviceDecorator(deviceDecorator);
		MenuMgr.getMenuMgr().setDevice(device);
	}
	public void run() {
		boolean running = true;
		while(running) {
			running = MenuMgr.getMenuMgr().getCurMenu().process();
		}
	}
	public void term() {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("游戏结束");
	}
	public void setCurMenu(int menuId) {
//		curMenu = MenuMgr.getMenuMgr().getMenu(menuId);
		MenuMgr.getMenuMgr().setCurMenu(menuId);
		
	}
	public void play() {
		MapMgr.getMapMgr().getCurMap().showMap();
	}
	
	public void changeMap() {
		BlockMgr.getBlockMgr().setBlockPrototype(BlocksId.MONEY_BLOCK, new EBlock());
		BlockMgr.getBlockMgr().setBlockPrototype(BlocksId.BAR_BLOCK, new FBlock());
//		createMap();
		MapMgr.getMapMgr().createMap();
	}


}



