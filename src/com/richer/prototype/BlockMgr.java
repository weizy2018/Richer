package com.richer.prototype;

import com.richer.block.*;

public class BlockMgr {
	public static BlockMgr blockMgr = null;
	private Block[] blocks;
	
	private BlockMgr() {
		blocks = new Block[BlocksId.BLOCK_COUNT];
		blocks[0] = null;
		blocks[BlocksId.MONEY_BLOCK] = new MoneyBlock();
		blocks[BlocksId.TRIP_BLOCK] = new TripBlock();
		blocks[BlocksId.BAR_BLOCK] = new BarBlock();
		blocks[BlocksId.SLIDE_BLOCK] = new SlideBlock();
		
		
	}
	public static BlockMgr getBlockMgr() {
		if(blockMgr==null) {
			blockMgr = new BlockMgr();
		}
		return blockMgr;
	}
	public void setBlockPrototype(int blockId, Block block) {
		blocks[blockId] = block;
	}
	public Block cloneBlock(int  blockId) {
		if(blockId>BlocksId.NULL_BLOCK && blockId<BlocksId.BLOCK_COUNT)
			return blocks[blockId].clone();
		else
			return null;
	}
	

}
