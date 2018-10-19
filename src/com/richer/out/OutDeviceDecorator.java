package com.richer.out;

public class OutDeviceDecorator extends OutDevice {
	private OutDevice device;
	
	public OutDeviceDecorator(OutDevice device) {
		this.device = device;
	}

	@Override
	public void draw(String str) {
		device.draw(str);
		
	}

	@Override
	public void drawln(String str) {
		device.drawln(str);
		
	}

}
