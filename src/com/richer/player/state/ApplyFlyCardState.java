package com.richer.player.state;

import com.richer.card.FlyCard;
import com.richer.player.Player;

public class ApplyFlyCardState extends State {
	
	private Player player;
	
	public ApplyFlyCardState(Player player) {
		this.player = player;
	}

	@Override
	public void handle() {
//		player.setLoop(2);
//		player.setStepSize(6);
//		player.setState(State.FLYCARD_STATE);
//		
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Apply success !");
		player.accept(new FlyCard());
	}

}
