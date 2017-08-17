package com.example.segundoauqui.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by segundoauqui on 8/16/17.
 */

public class MyDynamicReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "I am Dynamic", Toast.LENGTH_SHORT).show();
    }
}
