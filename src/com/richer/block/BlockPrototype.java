package com.richer.block;

public class BlockPrototype {
	private Block[] blocks;
	public BlockPrototype() {
		blocks = new Block[6];
		blocks[0] = new MoneyBlock();
		blocks[1] = new TripBlock();
		blocks[2] = new BarBlock();
		blocks[3] = new SlideBlock();
		blocks[4] = new EBlock();
		blocks[5] = new FBlock();
	}
	public Block cloneBlock(int blockId) {
		return blocks[blockId].clone();
	}

}
