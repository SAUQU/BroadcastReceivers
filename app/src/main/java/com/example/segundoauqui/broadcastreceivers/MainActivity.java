package com.example.segundoauqui.broadcastreceivers;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    //MyRecieverBroadcast recieverBroadcast = new MyRecieverBroadcast();

    MyDynamicReceiver myDynamicReceiver = new MyDynamicReceiver();
    IntentFilter intentFilter;


    EditText etType;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etType = (EditText) findViewById(R.id.etType);

    }

    public void sendBroadcast(View view) {

        switch(view.getId()){


            case R.id.btnStaticBroadcast:
                Intent intent = new Intent();
                intent.setAction("myaction");
                sendBroadcast(intent);
                break;



            case R.id.btnStaticBroadcast2:
                Intent intent1 = new Intent();
                intent1.setAction("myAction2");
                sendBroadcast(intent1);
                break;

            case R.id.btnDynamicBroadcast:
                Intent intent2 = new Intent();
                intent2.setAction("doSomething");
                sendBroadcast(intent2);
                break;

            case R.id.btnDynamicBroadcast2:
                Intent intent3 = new Intent();
                intent3.setAction("doNewThing");
                intent3.putExtra("data", etType.getText().toString());
                sendBroadcast(intent3);
                break;



        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        intentFilter = new IntentFilter("doSomething");
        intentFilter.addAction("doSomething");
        intentFilter.addAction("doNewThing");

        registerReceiver(myDynamicReceiver, intentFilter);

    }

    @Override
    protected void onStop() {
        super.onStop();
        //unregisterReceiver(myDynamicReceiver);
    }


}
