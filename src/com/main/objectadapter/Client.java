package com.main.objectadapter;

import com.main.Usb;
import com.main.UsbImpl;

public class Client {
	
	public static void main(String[] args) {
		Usb usb = new UsbImpl();
		Adapter adapter = new Adapter(usb);
		adapter.isPs2();
	}

}
