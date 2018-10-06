package com.richer.block;

public class EBlock extends Block {
	public EBlock() {
		
	}
	public EBlock(int row, int col, int left, int right, int up, int down) {
		super(row,col,left,right,up,down);
	}

	@Override
	public void showBlock() {
		System.out.print("E ");
		
	}

	@Override
	public Block clone() {
		return (EBlock)super.clone();
	}

	@Override
	public char getName() {
		return 'E';
	}

}
