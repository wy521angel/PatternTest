package com.wy.observer.example_by_java;

import java.util.Observable;

//天气目标的具体实现类
public class ConcreteWeatherSubject extends Observable {

    //天气情况的内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //天气情况有了，通知所有的观察者
        //注意在通知前，在用Java中的Observer模式的时候，下面这句话不可少
        setChanged();
        //然后主动通知，推模型
        notifyObservers(content);
        //拉模型
//        notifyObservers();

    }
}
