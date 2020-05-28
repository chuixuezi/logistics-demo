package com.logisticsdemo.bean;

public class Scar {
    private int cId;
    private String cName;
    private String cCarId;
    private String cImg;
    private String cTonnage;
    private String cMot;//车辆年检时间
    private String cLong;
    private String cWide;
    private String cTall;
    private String cType;

    public Scar() {
    }

    public Scar(int cId, String cName, String cCarId, String cImg, String cTonnage, String cMot,
                String cLong, String cWide, String cTall, String cType) {
        this.cId = cId;
        this.cName = cName;
        this.cCarId = cCarId;
        this.cImg = cImg;
        this.cTonnage = cTonnage;
        this.cMot = cMot;
        this.cLong = cLong;
        this.cWide = cWide;
        this.cTall = cTall;
        this.cType = cType;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcCarId() {
        return cCarId;
    }

    public void setcCarId(String cCarId) {
        this.cCarId = cCarId;
    }

    public String getcImg() {
        return cImg;
    }

    public void setcImg(String cImg) {
        this.cImg = cImg;
    }

    public String getcTonnage() {
        return cTonnage;
    }

    public void setcTonnage(String cTonnage) {
        this.cTonnage = cTonnage;
    }

    public String getcMot() {
        return cMot;
    }

    public void setcMot(String cMot) {
        this.cMot = cMot;
    }

    public String getcLong() {
        return cLong;
    }

    public void setcLong(String cLong) {
        this.cLong = cLong;
    }

    public String getcWide() {
        return cWide;
    }

    public void setcWide(String cWide) {
        this.cWide = cWide;
    }

    public String getcTall() {
        return cTall;
    }

    public void setcTall(String cTall) {
        this.cTall = cTall;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    @Override
    public String toString() {
        return "Scar{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cCarId='" + cCarId + '\'' +
                ", cImg='" + cImg + '\'' +
                ", cTonnage=" + cTonnage +
                ", cMot='" + cMot + '\'' +
                ", cLong=" + cLong +
                ", cWide=" + cWide +
                ", cTall=" + cTall +
                ", cType='" + cType + '\'' +
                '}';
    }
}
