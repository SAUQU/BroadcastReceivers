package com.example.segundoauqui.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyStaticReceiver extends BroadcastReceiver {
    private static final String TAG = "BroadCast";


    @Override
    public void onReceive(Context context, Intent intent) {

        switch (intent.getAction()){
            case "myaction":
                Log.d(TAG, "onReceive: " + "myaction");
                break;

            case "myAction2":
                Log.d(TAG, "onReceive: " + "myAction2");
                break;
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Log.d(TAG, "onReceive: " + "AirplaneMode");
                break;
        }

        //Log.d(TAG, "onReceive: ");
        Toast.makeText(context, "onReceive", Toast.LENGTH_SHORT).show();}
    }

