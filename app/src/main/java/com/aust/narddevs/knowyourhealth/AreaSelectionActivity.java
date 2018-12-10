package com.aust.narddevs.knowyourhealth;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AreaSelectionActivity extends AppCompatActivity {


    Spinner div,dis,area;
    ArrayAdapter<CharSequence> div2,dis2,area2;
    String div3,dis3,area3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_selection);
        getSupportActionBar().hide();
        div=(Spinner)findViewById(R.id.divspin);
        div2=ArrayAdapter.createFromResource(this,R.array.divisions,android.R.layout.simple_spinner_item);
        div2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        div.setAdapter(div2);
        div.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.BLACK);
                ((TextView) adapterView.getChildAt(0)).setTextSize(25);

                //Toast.makeText(getBaseContext(),(CharSequence) adapterView.getItemAtPosition(i)+"  "+i,Toast.LENGTH_SHORT).show();
                div3=adapterView.getItemAtPosition(i).toString();
                getDis(i);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void getDis(int z){


        dis=(Spinner)findViewById(R.id.disspin);

        if(z==0)
            dis2=ArrayAdapter.createFromResource(this,R.array.BarisalDiv,android.R.layout.simple_spinner_item);
        else if(z==1)
            dis2=ArrayAdapter.createFromResource(this,R.array.ChittagongDiv,android.R.layout.simple_spinner_item);
        else if(z==2)
            dis2=ArrayAdapter.createFromResource(this,R.array.DhakaDiv,android.R.layout.simple_spinner_item);
        else if(z==3)
            dis2=ArrayAdapter.createFromResource(this,R.array.KhulnaDiv,android.R.layout.simple_spinner_item);
        else if(z==4)
            dis2=ArrayAdapter.createFromResource(this,R.array.MymensinghDiv,android.R.layout.simple_spinner_item);
        else if(z==5)
            dis2=ArrayAdapter.createFromResource(this,R.array.RajshahiDiv,android.R.layout.simple_spinner_item);
        else if(z==6)
            dis2=ArrayAdapter.createFromResource(this,R.array.RangpurDiv,android.R.layout.simple_spinner_item);
        else if(z==7)
            dis2=ArrayAdapter.createFromResource(this,R.array.SylhetDiv,android.R.layout.simple_spinner_item);

        dis2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dis.setAdapter(dis2);
        dis.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.BLACK);
                ((TextView) adapterView.getChildAt(0)).setTextSize(25);

                //Toast.makeText(getBaseContext(),(CharSequence) adapterView.getItemAtPosition(i),Toast.LENGTH_SHORT).show();
                dis3=adapterView.getItemAtPosition(i).toString();
                getArea(dis3);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    public void getArea(String z){

        area=(Spinner)findViewById(R.id.areaspin);
        if(z.equals("Dhaka"))
            area2=ArrayAdapter.createFromResource(this,R.array.DhakaDis,android.R.layout.simple_spinner_item);

        area.setAdapter(area2);
        area.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.BLACK);
                ((TextView) adapterView.getChildAt(0)).setTextSize(25);

                //Toast.makeText(getBaseContext(),(CharSequence) adapterView.getItemAtPosition(i),Toast.LENGTH_SHORT).show();
                area3=adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void search(View v){
        Intent i=new Intent(getApplicationContext(),HospitalNameShowActivity.class);
        Bundle extra=new Bundle();
        extra.putString("DIV",div3);
        extra.putString("DIS",dis3);
        extra.putString("AREA",area3);
        i.putExtras(extra);

        startActivity(i);
    }

}
