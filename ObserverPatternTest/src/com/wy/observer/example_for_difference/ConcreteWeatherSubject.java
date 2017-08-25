package com.wy.observer.example_for_difference;

/**
 * Created by wy521angel on 2017/4/17.
 */

public class ConcreteWeatherSubject extends WeatherSubject {

    //“晴天”“下雨”“下雪”
    //目标对象的状态
    private String weatherContent;

    @Override
    protected void notifyObservers() {

        //循环所有注册的观察者
        for (Observer observer:observers) {

            //规则：
            //女朋友需要“下雨”的条件通知，其它的条件不通知
            //母亲需要“下雨”或者“下雪”的条件通知，其它的条件不通知

            //晴天
            //do nothing……

            //如果下雨
            if("下雨".equals(getWeatherContent())){
                if("黄明的女朋友".equals(observer.getObserverName())){
                    observer.update(this);
                }
                if("黄明的母亲".equals(observer.getObserverName())){
                    observer.update(this);
                }
            }

            //如果下雪
            if("下雪".equals(getWeatherContent())){
                if("黄明的母亲".equals(observer.getObserverName())){
                    observer.update(this);
                }
            }
        }
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        notifyObservers();
    }
}
