package com.main.objectadapter;

import com.main.Ps2;
import com.main.Usb;

public class Adapter implements Ps2 {
	
	private Usb usb;
	
	public Adapter(Usb usb){
		this.usb = usb;
	}

	public void isPs2() {
		usb.isUsb();
		
	}

}
