package com.example.administrator.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.designpattern.observer.BoyA;
import com.example.administrator.designpattern.observer.BoyB;
import com.example.administrator.designpattern.observer.BoyC;
import com.example.administrator.designpattern.observer.GirlXiaoHong;
import com.example.administrator.designpattern.observer.Boy;

/**
 * 观察者设计模式
 * 程序入口
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建主题对象
        GirlXiaoHong xiaoHong = new GirlXiaoHong();
        //创建观察者对象
        Boy boyA = new BoyA();
        Boy boyB = new BoyB();
        Boy boyC = new BoyC();
        //将观察者对象登记到主题对象上
        xiaoHong.attach(boyA);
        xiaoHong.attach(boyB);
        xiaoHong.attach(boyC);
        //改变主题对象的状态  小红：我饿了
        xiaoHong.change("我饿了");
    }
}
