package com.jagdishchoudhary.bijnistask1part2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnFragmentInteractionListener, FragmentTwo.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(String msg) {

        Intent intent = new Intent("custom-send-message-event");
        intent.putExtra("message", msg);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
