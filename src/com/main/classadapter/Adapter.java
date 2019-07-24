package com.main.classadapter;

import com.main.Ps2;
import com.main.UsbImpl;

public class Adapter extends UsbImpl implements Ps2 {

	public void isPs2() {
		this.isUsb();
	}
}
