package com.main.interfaceadapter;

public class Client {
	
	public static void main(String[] args) {
		AdapterImpl adapter = new AdapterImpl();
		adapter.isPs2();
		adapter.isUsb();
	}
}
