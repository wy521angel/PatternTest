package com.wy.observer.example_for_difference;

/**
 * Created by wy521angel on 2017/4/17.
 */

public class Client {

    public static void main(String[] args) {
        //1 创建目标
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();

        //2 创建观察者
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("黄明的女朋友");
        observerGirl.setRemindThing("下雨了，安静待在家里吧");

        ConcreteObserver observerMum = new ConcreteObserver();
        observerMum.setObserverName("黄明的母亲");
        observerMum.setRemindThing("不管下雨下雪，我都不出门");

        //3 注册观察者
        weather.attach(observerGirl);
        weather.attach(observerMum);

        //4目标发布天气
        //weather.setWeatherContent("下雨");
        weather.setWeatherContent("下雪");
    }
}
