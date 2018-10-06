package com.richer.main;

import com.richer.block.BlocksId;
import com.richer.map.MapMgr;
import com.richer.menu.*;
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
//		createMap();
		MapMgr.getMapMgr().createMap();
	}
	public void run() {
		boolean running = true;
		while(running) {
			running = MenuMgr.getMenuMgr().getCurMenu().process();
		}
	}
	public void term() {
		System.out.println("游戏结束");
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



