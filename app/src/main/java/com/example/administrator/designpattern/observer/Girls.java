package com.example.administrator.designpattern.observer;

import java.util.ArrayList;
import java.util.List;


// 抽象主题 女生
public abstract class Girls {
    //用来保存三个男生的集合
    private List<Boy> list = new ArrayList<Boy>();
    //注册观察者对象  当场在场的男生
    public void attach(Boy observer) {
        list.add(observer);
    }
    //删除观察者对象  不在场的男生
    public void detach(Boy observer) {
        list.remove(observer);
    }
    //通知所有注册的观察者对象  通知所有在场的男生 肚子饿了
    public void nodifyObservers(String newState) {
        for (Boy observer : list) {
            observer.update(newState);
        }
    }
}
