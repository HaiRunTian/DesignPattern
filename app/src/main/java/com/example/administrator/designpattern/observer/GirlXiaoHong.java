package com.example.administrator.designpattern.observer;

import android.util.Log;


//具体主题角色类  小红
public class GirlXiaoHong extends Girls {
    //当前状态
    private String state;
    //获取状态
    public String getState() {
        return state;
    }
    //状态改变
    public void change(String newState) {
        state = newState;
        //打印出小红状态
        Log.i("观察者模式",  "小红：" + newState);
        //状态发生改变，通知各个观察者 在场男生
        this.nodifyObservers(state);
    }
}
