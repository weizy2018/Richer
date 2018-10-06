package com.richer.map.builder;

import com.richer.block.Block;
import com.richer.block.BlockFactory;

public class MapBuilder {

	public Block buildBlock(int blockId) {
		BlockFactory blockFactory = new BlockFactory();
		return blockFactory.createBlock(blockId);
	}
	public Block buildBlock(int blockId,int row,int col,int left,int right,int up,int down) {
		BlockFactory blockFactory = new BlockFactory();
		return blockFactory.createBlock(blockId, row, col, left, right, up, down);
	}
}
