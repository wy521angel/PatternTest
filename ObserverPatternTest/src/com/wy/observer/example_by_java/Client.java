package com.wy.observer.example_by_java;

/**
 * Created by wy521angel on 2017/4/15.
 */
//测试类
public class Client {

    public static void main(String[] args) {
        // 创建天气作为一个目标，也可以说是被观察者
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();

        // 创建黄明的女朋友作为观察者
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("黄明的女朋友");

        // 创建黄明的母亲作为观察者
        ConcreteObserver observerMum = new ConcreteObserver();
        observerMum.setObserverName("黄明的母亲");

        // 注册观察者
        weather.addObserver(observerGirl);
        weather.addObserver(observerMum);

        // 目标发布天气
        weather.setContent("明天天气晴朗，蓝天白云，气温28度");
    }
}
