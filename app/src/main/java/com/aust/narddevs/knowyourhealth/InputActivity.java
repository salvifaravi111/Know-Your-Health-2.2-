package com.aust.narddevs.knowyourhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ageinput);
    }



    public void abv18(View v){

            Intent i=new Intent(InputActivity.this,ArticlesActivity.class);
            startActivity(i);

    }

}
