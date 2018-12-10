package com.aust.narddevs.knowyourhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Button next,skip;
    TextView head;
    TextView foot;
    int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

    }

    public void nxt(View v){
        flag++;
        LinearLayout layout=(LinearLayout)findViewById(R.id.activity_main);
        head=(TextView)findViewById(R.id.header);
        foot=(TextView)findViewById(R.id.footer);
        if(flag==1){
            layout.setBackgroundResource(R.drawable.screen2);
            head.setText("Hospitals Near You");
            String a = getString(R.string.hospital);
            foot.setText(a);
        }
        else if(flag==2){
            layout.setBackgroundResource(R.drawable.screen3);
            head.setText("Prevention is always better");
            String a = getString(R.string.question);
            foot.setText(a);
        }
        else if(flag==3){
            Intent i=new Intent(getApplicationContext(),OptionsActivity.class);
            startActivity(i);
        }
    }

    public void skp(View v){
        Intent i=new Intent(MainActivity.this,OptionsActivity.class);
        startActivity(i);
    }

}
