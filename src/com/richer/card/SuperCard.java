package com.richer.card;

import com.richer.menu.MenuMgr;
import com.richer.player.BeautifulPlayer;
import com.richer.player.HandsomePlayer;
import com.richer.player.Player;
import com.richer.player.state.State;

public class SuperCard extends Card {

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
		player.setLoop(1);
		player.setStepSize(6);
		player.setAddedMoney(200);
		player.setState(State.SUPERCARD_STATE);
		
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("SuperCard apply success to " + player.getPlayerName() + " !");
		
	}

}
