package com.richer.block;

public class SlideBlock implements Block,Cloneable {

	@Override
	public void showBlock() {
		
		System.out.print("D ");
		
	}
	@Override
	public Block clone() {
		try {
			return (SlideBlock) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
