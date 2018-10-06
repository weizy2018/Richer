package com.richer.prototype;

import com.richer.block.BarBlock;
import com.richer.block.Block;
import com.richer.block.BlocksId;
import com.richer.block.EBlock;
import com.richer.block.FBlock;
import com.richer.block.MoneyBlock;
import com.richer.block.SlideBlock;
import com.richer.block.TripBlock;

public class BlockPrototype {
	private Block[] blocks;
	public BlockPrototype() {
		blocks = new Block[BlocksId.BLOCK_COUNT];
		blocks[0] = null;
		blocks[1] = new MoneyBlock();
		blocks[2] = new TripBlock();
		blocks[3] = new BarBlock();
		blocks[4] = new SlideBlock();
		blocks[5] = new EBlock();
		blocks[6] = new FBlock();
	}
	public Block cloneBlock(int blockId) {
		if(blocks[blockId]!=null)
			return blocks[blockId].clone();
		else
			return null;
	}

}
