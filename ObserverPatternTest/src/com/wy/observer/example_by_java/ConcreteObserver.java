package com.wy.observer.example_by_java;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wy521angel on 2017/4/16.
 */

//具体的观察者对象
public class ConcreteObserver implements Observer {

    //观察者名称的变量
    private String observerName;

    /**
     * 第一个参数传递的目标应用，采用的是拉的方式
     * 第二个参数推送的内容，采用的是推送的方式
     */
    @Override
    public void update(Observable observable, Object o) {
        //推的方式
        System.out.println(observerName + "收到了消息，目标推送过来的是" + o);
        //拉的方式
        System.out.println(observerName + "收到了消息，主动到目标对象中去拉，拉的内容是" + ((ConcreteWeatherSubject) observable).getContent());
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
}
