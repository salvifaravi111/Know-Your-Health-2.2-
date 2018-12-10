package com.aust.narddevs.knowyourhealth;

import android.os.PersistableBundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.aust.narddevs.knowyourhealth.Fragments.BpFrag;
import com.aust.narddevs.knowyourhealth.Fragments.DiabetesFrag;
import com.aust.narddevs.knowyourhealth.Fragments.FeverFrag;
import com.aust.narddevs.knowyourhealth.Fragments.Homefrag;
import com.aust.narddevs.knowyourhealth.Fragments.TBFrag;

public class ArticlesActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


    private DrawerLayout drawerLayout;
    public ListView navList;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        drawerLayout=(DrawerLayout)findViewById(R.id.activity_articles);
        navList=(ListView)findViewById(R.id.navlist);
        navList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.Diseases,android.R.layout.simple_list_item_activated_1);
        navList.setAdapter(adapter);
        navList.setOnItemClickListener(this);
        fragmentManager=getSupportFragmentManager();
        navList.setItemChecked(0,true);
        Homefrag hf=new Homefrag();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fholder,hf);
        fragmentTransaction.commit();
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        navList.setItemChecked(i,true);

        switch (i){

            case 0:
                Homefrag hf=new Homefrag();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fholder,hf);
                fragmentTransaction.commit();
                break;

            case 1:
                TBFrag tb=new TBFrag();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fholder,tb);
                fragmentTransaction.commit();
                break;

            case 2:
                BpFrag bp=new BpFrag();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fholder,bp);
                fragmentTransaction.commit();
                break;

            case 3:
                DiabetesFrag db=new DiabetesFrag();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fholder,db);
                fragmentTransaction.commit();
                break;

            case 4:
                FeverFrag fv=new FeverFrag();
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fholder,fv);
                fragmentTransaction.commit();
                break;

        }
        drawerLayout.closeDrawer(navList);
    }
}
