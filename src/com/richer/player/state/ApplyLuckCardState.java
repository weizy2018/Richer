package com.richer.player.state;

import com.richer.card.LuckCard;
import com.richer.player.Player;

public class ApplyLuckCardState extends State {
	
	private Player player;
	
	public ApplyLuckCardState(Player player) {
		this.player = player;
	}

	@Override
	public void handle() {
//		player.setAddedMoney(200);
//		player.setLoop(3);
//		player.setState(State.LUCKCARD_STATE);
//		
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
//		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Apply success !");
		player.accept(new LuckCard());
	}
}
