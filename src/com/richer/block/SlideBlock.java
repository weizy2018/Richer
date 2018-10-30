package com.richer.block;

public class SlideBlock extends Block {
	public SlideBlock() {
		this.money = 1;
	}
	public SlideBlock(int row, int col, int left, int right, int up, int down) {
		super(row,col,left,right,up,down);
		this.money = 1;
	}

	@Override
	public void showBlock() {
		
		System.out.print("D ");
		
	}
	@Override
	public Block clone() {
		return (SlideBlock) super.clone();
	}
	@Override
	public char getName() {
		return 'D';
	}

}
