package com.aust.narddevs.knowyourhealth.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by EZIO on 1/24/2017.
 */

public class DBFunctions extends SQLiteOpenHelper{


    private static final String DB_NAME="HospitalDB";
    private static final String TB_NAME="HospitalTB";

    private static final String TB_ID="id";
    private static final String TB_DIV="division";
    private static final String TB_DIS="district";
    private static final String TB_AREA="area";
    private static final String TB_HOSNAME="name";
    private static final String TB_LOC="location";
    private static final String TB_NUM="number";


    public DBFunctions(Context c){
        super(c,DB_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String s="CREATE TABLE "+TB_NAME+" ("+TB_ID+" INTEGER PRIMARY KEY, "+TB_DIV+" TEXT, "+TB_DIS+" TEXT, "+TB_AREA+" TEXT, "+TB_HOSNAME+" TEXT, "+TB_LOC+" TEXT, "+TB_NUM+" TEXT)" ;
        sqLiteDatabase.execSQL(s);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    //-----ADDING DATA-----//

    void addData(GetSet gs){

        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(TB_ID,gs.getId());
        cv.put(TB_DIV,gs.getDivision());
        cv.put(TB_DIS,gs.getDistrict());
        cv.put(TB_AREA,gs.getArea());
        cv.put(TB_HOSNAME,gs.getName());
        cv.put(TB_LOC,gs.getLocation());
        cv.put(TB_NUM,gs.getNumber());

        sqLiteDatabase.insert(TB_NAME,null,cv);
        sqLiteDatabase.close();

    }

    //----SHOWING DATA----//


    public String[] fetch_Hospital_Name(String div,String dis,String area){

        SQLiteDatabase sq=this.getReadableDatabase();

        Cursor c = sq.rawQuery("select "+ TB_HOSNAME +" from " + TB_NAME +
                " where " + TB_DIV + " = ? AND  " + TB_DIS + " = ? AND  " + TB_AREA + " = ?", new String[] { div, dis, area });

        String[] received=new String[c.getCount()];

        c.moveToFirst();

        if(c.moveToFirst()){
            int count=0;
            do{
                received[count]=c.getString(c.getColumnIndex(TB_HOSNAME+""));
                count=count+1;
            }while (c.moveToNext());

        }
        return received;

    }

    public String fetch_Hospital_location(String div,String dis,String area,String hosname){

        SQLiteDatabase sq=this.getReadableDatabase();

        Cursor c = sq.rawQuery("select "+ TB_LOC +" from " + TB_NAME +
                " where " + TB_DIV + " = ? AND  " + TB_DIS + " = ? AND  " + TB_AREA + " = ? AND " + TB_HOSNAME + " = ?", new String[] { div, dis, area, hosname });

        String hosloc="";

        c.moveToFirst();

        if(c.moveToFirst()){

            hosloc=c.getString(c.getColumnIndex(TB_LOC+""));
        }
        return hosloc;

    }

    public String fetch_Hospital_Num(String div,String dis,String area,String hosname){

        SQLiteDatabase sq=this.getReadableDatabase();

        Cursor c = sq.rawQuery("select "+ TB_NUM +" from " + TB_NAME +
                " where " + TB_DIV + " = ? AND  " + TB_DIS + " = ? AND  " + TB_AREA + " = ? AND " + TB_HOSNAME + " = ?", new String[] { div, dis, area, hosname });

        String hosnum="";

        c.moveToFirst();

        if(c.moveToFirst()){

            hosnum=c.getString(c.getColumnIndex(TB_NUM+""));
        }
        return hosnum;

    }



}
