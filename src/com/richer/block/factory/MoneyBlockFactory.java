package com.richer.block.factory;

import com.richer.block.Block;
import com.richer.block.MoneyBlock;

public class MoneyBlockFactory implements BlockFactory {

	@Override
	public Block createBlock() {
		
		return new MoneyBlock();
	}

}
