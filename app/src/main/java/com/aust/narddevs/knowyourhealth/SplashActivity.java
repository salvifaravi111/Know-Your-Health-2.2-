package com.aust.narddevs.knowyourhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aust.narddevs.knowyourhealth.Database.AddData;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        //DBFunctions db=new DBFunctions(getApplicationContext());
        AddData ad=new AddData(getApplicationContext());

        Thread spl=new Thread(){


            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent i=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        spl.start();
    }
}
