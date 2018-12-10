package com.aust.narddevs.knowyourhealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.aust.narddevs.knowyourhealth.Database.DBFunctions;

public class HospitalInfoShowActivity extends AppCompatActivity {

    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital__info_show);

        Bundle extra=getIntent().getExtras();
        String division=extra.getString("DIV");
        String district=extra.getString("DIS");
        String area=extra.getString("AREA");
        String hosName=extra.getString("HosName");

        TextView t=(TextView) findViewById(R.id.hosLocShow);
        e=(EditText) findViewById(R.id.hosNumShow);

        DBFunctions db=new DBFunctions(getApplicationContext());

        t.setText(db.fetch_Hospital_location(division,district,area,hosName));
        e.setText(db.fetch_Hospital_Num(division,district,area,hosName));



    }

    public void copyNum(View v){

        e.setEnabled(true);

    }
}
