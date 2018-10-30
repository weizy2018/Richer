package com.richer.card;

import com.richer.menu.MenuMgr;
import com.richer.player.BeautifulPlayer;
import com.richer.player.HandsomePlayer;
import com.richer.player.Player;
import com.richer.player.state.State;

public class ExFlyCard extends Card {

	@Override
	public void visitedHandsomePlayer(HandsomePlayer handsomePlayer) {
		visitedNormalPlayer(handsomePlayer);
		
	}

	@Override
	public void visitedBeautifulPlayer(BeautifulPlayer beautifulPlayer) {
		visitedNormalPlayer(beautifulPlayer);
		
	}

	@Override
	public void visitedNormalPlayer(Player player) {
		player.setLoop(2);
		player.setStepSize(6);
		player.setState(State.EXFLYCARD_STATE);
		
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("EXFlyCard apply success to " + player.getPlayerName() +" !");
		
	}

}
