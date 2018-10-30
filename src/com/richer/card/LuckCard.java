package com.richer.card;

import com.richer.menu.MenuMgr;
import com.richer.player.BeautifulPlayer;
import com.richer.player.HandsomePlayer;
import com.richer.player.Player;
import com.richer.player.state.State;

public class LuckCard extends Card {
	
	@Override
	public void visitedHandsomePlayer(HandsomePlayer handsomePlayer) {
		handsomePlayer.setAddedMoney(200);
		handsomePlayer.setLoop(3);
		handsomePlayer.setState(State.LUCKCARD_STATE);
		
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("LuckCard apply success to " + handsomePlayer.getPlayerName() + " !");
	}
	
	@Override
	public void visitedBeautifulPlayer(BeautifulPlayer beautifulPlayer) {
		beautifulPlayer.setAddedMoney(200);
		beautifulPlayer.setLoop(4);
		beautifulPlayer.setState(State.LUCKCARD_STATE);
		
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("LuckCard apply success to " + beautifulPlayer.getPlayerName() + " !");
	} 
	
	@Override
	public void visitedNormalPlayer(Player player) {
		player.setAddedMoney(200);
		player.setLoop(3);
		player.setState(State.LUCKCARD_STATE);
		
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("LuckCard apply success to " + player.getPlayerName() + " !");
	}

}
