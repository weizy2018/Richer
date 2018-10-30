package com.richer.card.spell;

import com.richer.menu.MenuMgr;
import com.richer.player.BeautifulPlayer;
import com.richer.player.HandsomePlayer;
import com.richer.player.Player;
import com.richer.player.state.State;

public class FreezeSpell extends Spell {

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
		player.setLoop(3);
		player.setStepSize(1);
		player.setState(State.FREEZESPELL_STATE);
		
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Apply success !");
		
	}

}
