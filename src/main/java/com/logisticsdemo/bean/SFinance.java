package com.logisticsdemo.bean;

public class SFinance {
    private int fId;
    private String fDate;
    private String fMoney;
    private String fType;
    private String fContent;

    public SFinance() {
    }

    public SFinance(int fId, String fDate, String fMoney, String fType, String fContent) {
        this.fId = fId;
        this.fDate = fDate;
        this.fMoney = fMoney;
        this.fType = fType;
        this.fContent = fContent;
    }

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public String getfDate() {
        return fDate;
    }

    public void setfDate(String fDate) {
        this.fDate = fDate;
    }

    public String getfMoney() {
        return fMoney;
    }

    public void setfMoney(String fMoney) {
        this.fMoney = fMoney;
    }

    public String getfType() {
        return fType;
    }

    public void setfType(String fType) {
        this.fType = fType;
    }

    public String getfContent() {
        return fContent;
    }

    public void setfContent(String fContent) {
        this.fContent = fContent;
    }

    @Override
    public String toString() {
        return "SFinance{" +
                "fId=" + fId +
                ", fDate='" + fDate + '\'' +
                ", fMoney='" + fMoney + '\'' +
                ", fType='" + fType + '\'' +
                ", fContent='" + fContent + '\'' +
                '}';
    }
}
