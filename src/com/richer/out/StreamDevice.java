package com.richer.out;

public class StreamDevice extends OutDevice {

	@Override
	public void draw(String str) {
		System.out.print(str);

	}

	@Override
	public void drawln(String str) {
		System.out.println(str);

	}

}
