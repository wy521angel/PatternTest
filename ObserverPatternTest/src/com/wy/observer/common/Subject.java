package com.wy.observer.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供注册（添加）和删除观察者的接口
 * 
 * @author wy521angel
 */

public class Subject {

	//用来保存注册的观察者对象
	private List<Observer> observers = new ArrayList<Observer>();

	public void attach(Observer observer) {
		observers.add(observer);
	}

	/**
     * 删除集合中的指定观察者
     *
     * @param observer
     */
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	//该方法只有子类可以使用，所以定义为受保护的
	
	/**
     * 通知所有注册的观察者对象
     */
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
