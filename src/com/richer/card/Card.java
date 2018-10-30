package com.richer.card;

import com.richer.player.BeautifulPlayer;
import com.richer.player.HandsomePlayer;
import com.richer.player.Player;

public abstract class Card implements Tools {
	
	public abstract void visitedHandsomePlayer(HandsomePlayer handsomePlayer);
	public abstract void visitedBeautifulPlayer(BeautifulPlayer beautifulPlayer);
	public abstract void visitedNormalPlayer(Player player);

}
