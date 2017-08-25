package com.wy.observer.common;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * 
 * @author wy521angel
 */
public class ConcreteObserver implements Observer {
	// 观察者的状态
	private String observerState;

	/**
	 * 获取目标类的状态同步到观察者的状态中
	 *
	 * @param subject
	 *            传入目标对象，方便获取相应的目标对象的状态
	 */
	@Override
	public void update(Subject subject) {
		observerState = ((ConcreteSubject) subject).getSubjectState();

	}

}
