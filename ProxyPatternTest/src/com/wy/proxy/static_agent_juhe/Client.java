package com.wy.proxy.static_agent_juhe;

public class Client {

	/**
	 * 测试类
	 */
	public static void main(String[] args) {
		Car car = new Car();
		CarTimeProxy ctp = new CarTimeProxy(car);
		CarLogProxy clp = new CarLogProxy(ctp);
		clp.move();
	}

}
