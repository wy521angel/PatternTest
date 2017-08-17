package com.wy.proxy.myproxy;

public class Client {

	/**
	 * 测试类
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class);
		m.move();
	}

}
