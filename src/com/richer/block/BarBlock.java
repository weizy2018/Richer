package com.richer.block;

public class BarBlock extends Block {
	public BarBlock() {
		
	}
	public BarBlock(int row, int col, int left, int right, int up, int down) {
		super(row,col,left,right,up,down);
	}
	
	@Override
	public void showBlock() {
		System.out.print("C ");
		
	}

	@Override
	public Block clone() {
		return (BarBlock) super.clone();
	}

	@Override
	public char getName() {
		return 'C';
	}


}
