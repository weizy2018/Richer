package com.richer.player.state;

import com.richer.card.spell.HurtSpell;
import com.richer.player.Player;

public class ApplyHurtSpellState extends State {
	
	private Player player;
	
	public ApplyHurtSpellState(Player player) {
		this.player = player;
	}

	@Override
	public void handle() {
//		player.setAddedMoney(-5);
//		player.setLoop(2);
//		player.setState(State.HURTSPELL_STATE);
//		
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Apply success !");
		player.accept(new HurtSpell());
	}

}
