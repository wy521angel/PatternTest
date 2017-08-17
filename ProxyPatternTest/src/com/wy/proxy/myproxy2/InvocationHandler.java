package com.wy.proxy.myproxy2;

import java.lang.reflect.Method;

public interface InvocationHandler {

	public void invoke(Object o,Method m);
}
