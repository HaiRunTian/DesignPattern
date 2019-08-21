package com.example.administrator.designpattern.observer;

import android.util.Log;

//具体观察者
public class BoyB implements Boy {
    // 观察者的状态
    private String observerState;
    //更新的状态
    @Override
    public void update(String state) {
        //更新观察者的状态，使其与目标的状态保持一致
        observerState = state;
        Log.i("观察者模式", "小红：" + state + "__________BoyB:别走，我给你买好吃的带到楼下!");
    }
}
