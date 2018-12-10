package com.aust.narddevs.knowyourhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.aust.narddevs.knowyourhealth.Database.DBFunctions;

public class HospitalNameShowActivity extends AppCompatActivity {

    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_name_show);

        Toast.makeText(getApplicationContext(),"Click on The Names to see More Info",Toast.LENGTH_LONG).show();

        Bundle extra=getIntent().getExtras();
        final String division=extra.getString("DIV");
        final String district=extra.getString("DIS");
        final String area=extra.getString("AREA");

        DBFunctions db=new DBFunctions(getApplicationContext());

        String[] hospitals=db.fetch_Hospital_Name(division,district,area);

        l=(ListView)findViewById(R.id.hosList);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.hospital_listview_layout,R.id.LTView,hospitals);

        l.setAdapter(adapter);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent x=new Intent(HospitalNameShowActivity.this,HospitalInfoShowActivity.class);

                //Toast.makeText(getBaseContext(),(CharSequence) adapterView.getItemAtPosition(i),Toast.LENGTH_SHORT).show();

                Bundle extra=new Bundle();
                extra.putString("DIV",division);
                extra.putString("DIS",district);
                extra.putString("AREA",area);
                extra.putString("HosName",adapterView.getItemAtPosition(i).toString());
                x.putExtras(extra);

                startActivity(x);

            }
        });

    }
}
