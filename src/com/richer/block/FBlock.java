package com.richer.block;

public class FBlock extends Block {

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
