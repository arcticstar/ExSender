package com.auxgroup.exsender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/**
 * 发送广播
 * */
    public void click(View view) {
        Intent intent=new Intent();
        intent.setAction("com.auxgroup.exsender.haha");
        sendBroadcast(intent);

    }
/**
 * 发送无序广播
 * */
    public void sendUnOrder(View view) {
        Intent intent=new Intent();
        intent.setAction("com.auxgroup.exsender.unorder");
        //无序广播，不可被拦截，不可终止
        sendBroadcast(intent);

    }
/**
 * 发送有序广播
 * */
    public void sendOrder(View view) {

        Intent intent = new Intent();
        intent.setAction("com.auxgroup.exsender.order");
        //有序广播，可被拦截，可终止
        sendOrderedBroadcast(intent,null,null,null,0,"给农民兄弟送10000元",null);

    }
}
