package com.richer.player;

import com.richer.card.Tools;
import com.richer.map.MapMgr;
import com.richer.menu.MenuMgr;

public class HumanPlayer extends Player {
	
	public HumanPlayer(int x, int y, String playerName) {
		this.x = x;
		this.y = y;
		this.playerName = playerName;
		this.leftSign = '[';
		this.rightSign = ']';
		this.stepSize = 3;
		this.defaultLoop = 1;
		this.defaultStepSize = 3;
		
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
		card.visitedNormalPlayer(this);
		
	}

}
