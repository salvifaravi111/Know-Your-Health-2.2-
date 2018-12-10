package com.aust.narddevs.knowyourhealth;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        getSupportActionBar().hide();
    }

    public static boolean hasPermission(Context context, String permission) {

        int res = context.checkCallingOrSelfPermission(permission);
        return res == PackageManager.PERMISSION_GRANTED;

    }


    public void emerInput(View v){
        Intent i=new Intent(OptionsActivity.this,EmergencyinputActivity.class);
        startActivity(i);
    }

    public void hosInfo(View v){
        Intent i=new Intent(OptionsActivity.this,AreaSelectionActivity.class);
        startActivity(i);
    }

    public void knwMore(View v){
        Intent i=new Intent(OptionsActivity.this,InputActivity.class);
        startActivity(i);
    }
    public void emgCall(View v){

        SharedPreferences sharedPreferences=getBaseContext().getSharedPreferences( getString(R.string.PrefKey),Context.MODE_PRIVATE);
        String num=sharedPreferences.getString(getString(R.string.Number),"Nothing to show");
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+num));
        if(hasPermission(getBaseContext(),Manifest.permission.CALL_PHONE))
        startActivity(intent);
    }



}
