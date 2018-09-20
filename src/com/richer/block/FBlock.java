package com.richer.block;

public class FBlock implements Block,Cloneable {

	@Override
	public void showBlock() {
		System.out.print("F ");
		
	}

	@Override
	public Block clone() {
		try {
			return (FBlock)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
