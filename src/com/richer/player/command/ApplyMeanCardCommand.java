package com.richer.player.command;

import com.richer.player.Player;

public class ApplyMeanCardCommand extends Command {
private Player player;
	
	public ApplyMeanCardCommand(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		
		player.applyMeanCard();
		
	}
}
