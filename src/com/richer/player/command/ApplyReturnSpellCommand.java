package com.richer.player.command;

import com.richer.player.Player;

public class ApplyReturnSpellCommand extends Command {
	
	private Player player;
	
	public ApplyReturnSpellCommand(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		
		player.applyReturnSpell(player);
		
	}
}
