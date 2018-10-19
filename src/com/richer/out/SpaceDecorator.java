package com.richer.out;

public class SpaceDecorator extends OutDeviceDecorator {

	public SpaceDecorator(OutDevice device) {
		super(device);
	}
	
	@Override
	public void draw(String str) {
		drawSpace();
		drawSpace();
		drawSpace();
		drawSpace();
		super.draw(str);
	}
	
	@Override
	public void drawln(String str) {
		drawSpace();
		drawSpace();
		drawSpace();
		drawSpace();
		super.drawln(str);
	}
	
	private void drawSpace() {
		System.out.print(" ");
	}

}
