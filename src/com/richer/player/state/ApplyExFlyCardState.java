package com.richer.player.state;

import com.richer.card.ExFlyCard;
import com.richer.player.Player;

public class ApplyExFlyCardState extends State{

	private Player player;
	
	public ApplyExFlyCardState(Player player) {
		this.player = player;
	}

	@Override
	public void handle() {
//		player.setLoop(2);
//		player.setStepSize(6);
//		player.setState(State.EXFLYCARD_STATE);
//		
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Apply success !");
		player.accept(new ExFlyCard());
	}
}
