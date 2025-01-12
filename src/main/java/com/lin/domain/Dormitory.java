package com.lin.domain;

public class Dormitory {
    private String st_name;
    private int buliding_no;
    private int dormitory_no;
    private String st_class;
    private long st_id;
    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public int getBuliding_no() {
        return buliding_no;
    }

    public void setBuliding_no(int buliding_no) {
        this.buliding_no = buliding_no;
    }

    public int getDormitory_no() {
        return dormitory_no;
    }

    public void setDormitory_no(int dormitory_no) {
        this.dormitory_no = dormitory_no;
    }

    public String getSt_class() {
        return st_class;
    }

    public void setSt_class(String st_class) {
        this.st_class = st_class;
    }

    public Dormitory() {
    }

    public Dormitory(String st_name, int buliding_no, int dormitory_no, String st_class, long st_id) {
        this.st_name = st_name;
        this.buliding_no = buliding_no;
        this.dormitory_no = dormitory_no;
        this.st_class = st_class;
        this.st_id = st_id;
    }

    public long getSt_id() {
        return st_id;
    }

    public void setSt_id(long st_id) {
        this.st_id = st_id;
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "st_name='" + st_name + '\'' +
                ", buliding_no=" + buliding_no +
                ", dormitory_no=" + dormitory_no +
                ", st_class='" + st_class + '\'' +
                ", st_id=" + st_id +
                '}';
    }
}
