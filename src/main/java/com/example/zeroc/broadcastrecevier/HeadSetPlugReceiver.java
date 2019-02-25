package com.example.zeroc.broadcastrecevier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class HeadSetPlugReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
       //tai day se nhan tat ca cac ban tin ma no dang ky
        //dua vao trong action cua intent de biet
        String action = intent.getAction();
        if(action.equals(Intent.ACTION_HEADSET_PLUG)){
            Toast.makeText(context,"HEADSET PLUG",Toast.LENGTH_SHORT).show();
            Log.e("TAG_HEAD","HEADSET PLUG");
        }
    }
}
