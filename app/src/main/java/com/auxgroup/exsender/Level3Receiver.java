package com.auxgroup.exsender;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Level3Receiver extends BroadcastReceiver {
    public Level3Receiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String message = getResultData();
        System.out.println("乡级部门得到市级的消息"+message);
        setResultData("给农民兄弟发200块");
    }
}
