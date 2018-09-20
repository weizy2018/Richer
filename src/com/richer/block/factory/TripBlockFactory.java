package com.richer.block.factory;

import com.richer.block.Block;
import com.richer.block.TripBlock;

public class TripBlockFactory implements BlockFactory {

	@Override
	public Block createBlock() {

		return new TripBlock();
	}

}
