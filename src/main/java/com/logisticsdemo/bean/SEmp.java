package com.logisticsdemo.bean;

public class SEmp {
    private int sId;
    private String sName;
    private String sAccount;
    private String sPassword;
    private String sPosition;
    private String sCardId;
    private String sFace;

    public SEmp() {
    }

    public SEmp(int sId, String sName, String sAccount, String sPassword
            , String sPosition, String sCardId, String sFace) {
        this.sId = sId;
        this.sName = sName;
        this.sAccount = sAccount;
        this.sPassword = sPassword;
        this.sPosition = sPosition;
        this.sCardId = sCardId;
        this.sFace = sFace;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAccount() {
        return sAccount;
    }

    public void setsAccount(String sAccount) {
        this.sAccount = sAccount;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public String getsPosition() {
        return sPosition;
    }

    public void setsPosition(String sPosition) {
        this.sPosition = sPosition;
    }

    public String getsCardId() {
        return sCardId;
    }

    public void setsCardId(String sCardId) {
        this.sCardId = sCardId;
    }

    public String getsFace() {
        return sFace;
    }

    public void setsFace(String sFace) {
        this.sFace = sFace;
    }

    @Override
    public String toString() {
        return "SEmp{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAccount='" + sAccount + '\'' +
                ", sPassword='" + sPassword + '\'' +
                ", sPosition='" + sPosition + '\'' +
                ", sCardId='" + sCardId + '\'' +
                ", sFace='" + sFace + '\'' +
                '}';
    }
}
