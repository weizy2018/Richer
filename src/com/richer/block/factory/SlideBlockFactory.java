package com.richer.block.factory;

import com.richer.block.Block;
import com.richer.block.SlideBlock;

public class SlideBlockFactory implements BlockFactory {

	@Override
	public Block createBlock() {
		
		return new SlideBlock();
	}

}
