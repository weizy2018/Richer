package com.richer.card;

import com.richer.player.BeautifulPlayer;
import com.richer.player.HandsomePlayer;
import com.richer.player.Player;

public interface Tools {
	
	public void visitedHandsomePlayer(HandsomePlayer handsomePlayer);
	public void visitedBeautifulPlayer(BeautifulPlayer beautifulPlayer);
	public void visitedNormalPlayer(Player player);
}
