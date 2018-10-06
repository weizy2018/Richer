package com.richer.map.builder;

import com.richer.block.Block;
import com.richer.prototype.BlockMgr;

public class EFMapBuilder extends MapBuilder {
	public Block buildBlock(int blockId) {
		return BlockMgr.getBlockMgr().cloneBlock(blockId);
	}
	public Block buildBlock(int blockId,int row,int col,int left,int right,int up,int down) {
		Block block = BlockMgr.getBlockMgr().cloneBlock(blockId);
		block.setRow(row);
		block.setCol(col);
		block.setLeft(left);
		block.setRight(right);
		block.setUp(up);
		block.setDown(down);
		
		return block;
	}
}
