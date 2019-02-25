package com.example.zeroc.broadcastrecevier;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private HeadSetPlugReceiver receiver;
    private IntentFilter filter; // bo loc cac ban tin
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        receiver = new HeadSetPlugReceiver();
        filter= new IntentFilter();
        filter.addAction(Intent.ACTION_HEADSET_PLUG);
        //ve sau muon ung dung tu gui ban tin broadcast
        // dinh nghia 1 intent--> sau do gui di
        Intent intent = new Intent("ThongBao.CoTinNhanToi");
        sendBroadcast(intent);
    }
    protected void onResume(){
        super.onResume();
        //tai day thuong dang ky boardcast reciever
        registerReceiver(receiver,filter);
    }

    protected void onDestroy(){
        super.onDestroy();
        //huy dang ky nhan ban tin broadcast
        unregisterReceiver(receiver);
    }
}
