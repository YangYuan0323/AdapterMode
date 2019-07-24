package com.main.classadapter;

import com.main.Ps2;

public class Client {
	public static void main(String[] args) {
		Ps2 ps2 = new Adapter();
		ps2.isPs2();
	}
}
