package com.richer.block.factory;

import com.richer.block.BarBlock;
import com.richer.block.Block;

public class BarBlockFactory implements BlockFactory {

	@Override
	public Block createBlock() {
		
		return new BarBlock();
	}

}
