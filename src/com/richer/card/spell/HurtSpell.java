package com.richer.card.spell;

import com.richer.menu.MenuMgr;
import com.richer.player.BeautifulPlayer;
import com.richer.player.HandsomePlayer;
import com.richer.player.Player;
import com.richer.player.state.State;

public class HurtSpell extends Spell {

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
		player.setAddedMoney(-5);
		player.setLoop(2);
		player.setState(State.HURTSPELL_STATE);
		
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Apply success !");
		
	}

}
