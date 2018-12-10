package com.aust.narddevs.knowyourhealth.Database;

/**
 * Created by EZIO on 1/24/2017.
 */

public class GetSet {

    private int id;
    private String division;
    private String district;
    private String area;
    private String name;
    private String location;
    private String number;


    public GetSet(int idd,String div,String dis,String ar,String n,String loc,String num){

        id=idd;
        division=div;
        district=dis;
        area=ar;
        name=n;
        location=loc;
        number=num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
