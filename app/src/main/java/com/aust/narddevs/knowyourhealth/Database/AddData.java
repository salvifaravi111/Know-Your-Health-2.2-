package com.aust.narddevs.knowyourhealth.Database;

import android.content.Context;

/**
 * Created by EZIO on 1/26/2017.
 */

public class AddData {


    public AddData(Context context){

        putInTable(context);

    }

    private void putInTable(Context context){

        DBFunctions db=new DBFunctions(context);

        db.addData(new GetSet(1,"Dhaka","Dhaka","Dhanmondi","Square Hospitals Limited","18F, Bir Uttam Qazi Nuruzzaman Sarak, West Panthapath, Dhaka 1205","8144466,8144477,8144488"));
        db.addData(new GetSet(2,"Dhaka","Dhaka","Dhanmondi","Labaid Specialized Hospital","House- 06, Road-04, Dhanmondi, Dhaka 1205","01713333337,10606"));
        db.addData(new GetSet(3,"Dhaka","Dhaka","Gulshan","United Hospital","Plot 15, Road 71, Gulshan, Dhaka 1212","10666,9852466,+8801914001234"));
        db.addData(new GetSet(4,"Dhaka","Dhaka","Gulshan","Shahabuddin Medical College & Hospital","House No-12, Road No-113/A, Gulshan Model Town, Gulshan-2, Dhaka-1212","88-02-9863387,88-02-9884501"));
        db.addData(new GetSet(5,"Dhaka","Dhaka","Boshundhara","Apollo Hospitals Dhaka","Plot: 81, Block: E, Bashundhara R/A, Dhaka 1229","01714-090000,10678"));
        db.addData(new GetSet(6,"Dhaka","Dhaka","Uttara","Dhaka Eye Care Hospital","32 Rabindra Sarani, Sector - 7, Uttara, Dhaka - 1230","+88027913975,+88027914409"));
        db.addData(new GetSet(7,"Dhaka","Dhaka","Uttara","East-West Medical College","Aichi Nagar, JBCS Sarani, P.O- Khayertek, Horirampur, Turag, Dhaka-1711","+88-01731577922,+8801718447602"));
        db.addData(new GetSet(8,"Dhaka","Dhaka","Mirpur","National Heart Foundation Hospital & Research Institute","Plot-7/2, Section-2, Mirpur, Dhaka-1216","9033442-6"));
        db.addData(new GetSet(9,"Dhaka","Dhaka","Rampura","Farazy Hospital","House#15-19, Block-E, Banasree Main Road, Rampura, Dhaka 1219","01841007006,01944033332"));
        db.addData(new GetSet(10,"Dhaka","Dhaka","Khilgaon","Khidmah Hospital (Pvt.) Ltd","C-287/2-3, Khilgaon Bishwa Road, Khilgaon, Dhaka-1219","55122422,55122423-5,01711063030"));
        db.addData(new GetSet(11,"Dhaka","Dhaka","Savar","Enam Medical College & Hospital","9/3, parboti Nagar, Thana Road, Savar Dhaka","+88-02-7743779,7743780,7743781,+88-01716358146"));
        db.addData(new GetSet(12,"Dhaka","Dhaka","Tongi","International Medical College and Hospital","Gushulia, Sataish,Tongi, Gazipur","88029814713-4,9814550"));
        db.addData(new GetSet(13,"Dhaka","Dhaka","Ashulia","Centre for Woman and Child Health (CWCH)","Jamrgora, Ashulia, Dhaka-1349","+8801713144267,01839932610"));
        db.addData(new GetSet(14,"Dhaka","Dhaka","Tejgaon","MH Samorita Hospital and Medical College","117 Tejgaon, Love Rd, Dhaka 1208","01847-157222,01847-004999"));
        db.addData(new GetSet(15,"Dhaka","Dhaka","Mohammadpur","Shaheed Suhrawardy Medical College and Hospital","Sher-e-Bangla Nagor, Agargaon, Dhaka","91-30800-19"));
        db.addData(new GetSet(16,"Dhaka","Dhaka","Badda","Ibn Sina Diagnostic & Consultation Center","CHA, 72/1 Progoti Soroni, Uttar Badda","8833264-5,8835556-7,01832820950"));
        db.addData(new GetSet(17,"Dhaka","Dhaka","Mohakhali","National Institute of Diseases of the Chest and Hospital","Mohakhali, Dhaka","88-02-8811910"));
        db.addData(new GetSet(18,"Dhaka","Dhaka","Sadarghat","Dhaka National Medical College","53/1, Johnson Road, Dhaka-1100","+880247110089,+880247118967"));
        db.addData(new GetSet(19,"Dhaka","Dhaka","Khilkhet","Ashiyan Medical College Hospital","Barua, Khilkhet","+8801841133501"));

    }

}
