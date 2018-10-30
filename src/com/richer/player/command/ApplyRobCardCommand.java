package com.richer.player.command;

import com.richer.player.Player;

public class ApplyRobCardCommand extends Command {
	
	private Player player;
	
	public ApplyRobCardCommand(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		
		player.applyRobCard(player);
		
	}

}
