package com.wy.observer.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察它的观察者，并提供注册（添加）和删除观察者的接口
 * Created by wy521angel on 2017/4/12.
 */

public class WeatherSubject {

    //用来保存注册的观察者对象（订阅者列表）
    private List<Observer> observers = new ArrayList<>();

    //把订阅天气的人添加到订阅者列表中
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除集合中的指定订阅天气的人
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //该方法只有子类可以使用，所以定义为受保护的

    /**
     * 通知所有已经订阅了天气的人
     */
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    /**
     * 通知所有已经订阅了天气的人
     */
    protected void notifyObservers(String content) {
        for (Observer observer : observers) {
            observer.update(content);
        }
    }

}
