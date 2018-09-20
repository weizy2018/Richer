package com.richer.block;

public class EBlock implements Block,Cloneable {

	@Override
	public void showBlock() {
		System.out.print("E ");
		
	}

	@Override
	public Block clone() {
		try {
			return (EBlock)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
