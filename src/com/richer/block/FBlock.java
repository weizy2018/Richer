package com.richer.block;

public class FBlock extends Block {
	
	public FBlock() {
		this.money = 1;
	}
	
	public FBlock(int row, int col, int left, int right, int up, int down) {
		super(row,col,left,right,up,down);
		this.money = 1;
	}

	@Override
	public void showBlock() {
		System.out.print("F ");
		
	}

	@Override
	public Block clone() {
		return (FBlock)super.clone();
	}

	@Override
	public char getName() {
		return 'F';
	}
	

}
