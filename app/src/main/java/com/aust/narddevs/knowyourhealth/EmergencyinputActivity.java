package com.aust.narddevs.knowyourhealth;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmergencyinputActivity extends AppCompatActivity {


    Button b;

    EditText e;


    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencyinput);

        getSupportActionBar().hide();

        b=(Button)findViewById(R.id.savenum);

        e=(EditText)findViewById(R.id.numEmrg);

        sharedPreferences= getBaseContext().getSharedPreferences( getString(R.string.PrefKey),Context.MODE_PRIVATE);

        String num=sharedPreferences.getString(getString(R.string.Number),"Nothing to show");

        e.setText(num);

    }

    public void chngNum(View v){

        e.setEnabled(true);

        b.setEnabled(true);

        b.setVisibility(View.VISIBLE);

    }

    public void savNum(View v){

        e.setEnabled(false);

        b.setEnabled(false);

        b.setVisibility(View.INVISIBLE);

        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(getString(R.string.Number),e.getText().toString());
        editor.apply();
    }

}
