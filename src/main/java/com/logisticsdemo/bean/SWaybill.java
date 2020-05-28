package com.logisticsdemo.bean;

public class SWaybill {
    private int wId;
    private String wName;//客户名称
    private String wPhone;//客户电话
    private String wType;//货物类型
    private String wWeight;//货物重量
    private String wVolume;//货物体积
    private String wStart_place;//起始地
    private String wEnd_place;//目的地
    private String cCarId;//车牌号
    private String wFare;//运费
    private String wDriver;//司机
    private String wOrder_time;//下单时间
    private String wPayOver_time;//支付时间
    private String wPayType;//支付类型
    private String wLoad_time;//装货时间
    private String wGet_time;//到达时间
    private String wUnload_time;//卸货时间
    private String wExit_time;//返回时间
    private String wState;//订单状态

    public SWaybill() {
    }

    public SWaybill(int wId, String wName, String wPhone,
                    String wType, String wWeight, String wVolume, String wStart_place, String wEnd_place, String cCarId, String wFare,
                    String wDriver, String wOrder_time, String wPayOver_time, String wPayType, String wLoad_time, String wGet_time,
                    String wUnload_time, String wExit_time, String wState) {
        this.wId = wId;
        this.wName = wName;
        this.wPhone = wPhone;
        this.wType = wType;
        this.wWeight = wWeight;
        this.wVolume = wVolume;
        this.wStart_place = wStart_place;
        this.wEnd_place = wEnd_place;
        this.cCarId = cCarId;
        this.wFare = wFare;
        this.wDriver = wDriver;
        this.wOrder_time = wOrder_time;
        this.wPayOver_time = wPayOver_time;
        this.wPayType = wPayType;
        this.wLoad_time = wLoad_time;
        this.wGet_time = wGet_time;
        this.wUnload_time = wUnload_time;
        this.wExit_time = wExit_time;
        this.wState = wState;
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public String getwPhone() {
        return wPhone;
    }

    public void setwPhone(String wPhone) {
        this.wPhone = wPhone;
    }

    public String getwType() {
        return wType;
    }

    public void setwType(String wType) {
        this.wType = wType;
    }

    public String getwWeight() {
        return wWeight;
    }

    public void setwWeight(String wWeight) {
        this.wWeight = wWeight;
    }

    public String getwVolume() {
        return wVolume;
    }

    public void setwVolume(String wVolume) {
        this.wVolume = wVolume;
    }

    public String getwStart_place() {
        return wStart_place;
    }

    public void setwStart_place(String wStart_place) {
        this.wStart_place = wStart_place;
    }

    public String getwEnd_place() {
        return wEnd_place;
    }

    public void setwEnd_place(String wEnd_place) {
        this.wEnd_place = wEnd_place;
    }

    public String getcCarId() {
        return cCarId;
    }

    public void setcCarId(String cCarId) {
        this.cCarId = cCarId;
    }

    public String getwFare() {
        return wFare;
    }

    public void setwFare(String wFare) {
        this.wFare = wFare;
    }

    public String getwDriver() {
        return wDriver;
    }

    public void setwDriver(String wDriver) {
        this.wDriver = wDriver;
    }

    public String getwOrder_time() {
        return wOrder_time;
    }

    public void setwOrder_time(String wOrder_time) {
        this.wOrder_time = wOrder_time;
    }

    public String getwPayOver_time() {
        return wPayOver_time;
    }

    public void setwPayOver_time(String wPayOver_time) {
        this.wPayOver_time = wPayOver_time;
    }

    public String getwPayType() {
        return wPayType;
    }

    public void setwPayType(String wPayType) {
        this.wPayType = wPayType;
    }

    public String getwLoad_time() {
        return wLoad_time;
    }

    public void setwLoad_time(String wLoad_time) {
        this.wLoad_time = wLoad_time;
    }

    public String getwGet_time() {
        return wGet_time;
    }

    public void setwGet_time(String wGet_time) {
        this.wGet_time = wGet_time;
    }

    public String getwUnload_time() {
        return wUnload_time;
    }

    public void setwUnload_time(String wUnload_time) {
        this.wUnload_time = wUnload_time;
    }

    public String getwExit_time() {
        return wExit_time;
    }

    public void setwExit_time(String wExit_time) {
        this.wExit_time = wExit_time;
    }

    public String getwState() {
        return wState;
    }

    public void setwState(String wState) {
        this.wState = wState;
    }

    @Override
    public String toString() {
        return "SWaybill{" +
                "wId=" + wId +
                ", wName='" + wName + '\'' +
                ", wPhone='" + wPhone + '\'' +
                ", wType='" + wType + '\'' +
                ", wWeight='" + wWeight + '\'' +
                ", wVolume='" + wVolume + '\'' +
                ", wStart_place='" + wStart_place + '\'' +
                ", wEnd_place='" + wEnd_place + '\'' +
                ", cCarId='" + cCarId + '\'' +
                ", wFare='" + wFare + '\'' +
                ", wDriver='" + wDriver + '\'' +
                ", wOrder_time='" + wOrder_time + '\'' +
                ", wPayOver_time='" + wPayOver_time + '\'' +
                ", wPayType='" + wPayType + '\'' +
                ", wLoad_time='" + wLoad_time + '\'' +
                ", wGet_time='" + wGet_time + '\'' +
                ", wUnload_time='" + wUnload_time + '\'' +
                ", wExit_time='" + wExit_time + '\'' +
                ", wState='" + wState + '\'' +
                '}';
    }
}
