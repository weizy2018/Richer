package com.richer.player;

import com.richer.card.Tools;
import com.richer.map.MapMgr;
import com.richer.menu.MenuMgr;

public class BeautifulPlayer extends HumanPlayer {
	
	public BeautifulPlayer(int x, int y, String playerName) {
		super(x, y, playerName);
		
	}

	@Override
	public void execute() {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln(this.playerName + " play ...");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MapMgr.getMapMgr().getCurMap().showMap();
		
	}
	
	@Override
	public void accept(Tools card) {
		card.visitedBeautifulPlayer(this);
	}

}
