package com.richer.player.state;

import com.richer.card.spell.FreezeSpell;
import com.richer.player.Player;

public class ApplyFreezeSpellState extends State {
	
	private Player player;
	
	public ApplyFreezeSpellState(Player player) {
		this.player = player;
	}

	@Override
	public void handle() {
//		player.setLoop(3);
//		player.setStepSize(1);
//		player.setState(State.FREEZESPELL_STATE);
//		
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Apply success !");
		player.accept(new FreezeSpell());
	}

}
