package com.richer.player.state;

import com.richer.card.SuperCard;
import com.richer.player.Player;

public class ApplySuperCardState extends State {

	private Player player;
	
	public ApplySuperCardState(Player player) {
		this.player = player;
	}

	@Override
	public void handle() {
//		player.setLoop(1);
//		player.setStepSize(6);
//		player.setAddedMoney(200);
//		player.setState(State.SUPERCARD_STATE);
//		
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Apply success !");
		player.accept(new SuperCard());
	}

}
