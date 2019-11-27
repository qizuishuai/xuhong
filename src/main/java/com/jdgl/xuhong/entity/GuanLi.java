package com.jdgl.xuhong.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="guanli")
public class GuanLi {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID;
    private String LeiXing;
    private String WeiZhi;
    private String ZhuangTai;
    private String YuanGongID;
    private Date RuZhuShiJian;
    private Date TuiFangShiJian;
    private String ShiFouSunHuai;
    private int Text1;
    private String Text2;
    private String Text3;

    public GuanLi() {
    }

    public GuanLi(int ID, String leiXing, String weiZhi, String zhuangTai, String yuanGongID, Date ruZhuShiJian, Date tuiFangShiJian, String shiFouSunHuai, int text1, String text2, String text3) {
        this.ID = ID;
        LeiXing = leiXing;
        WeiZhi = weiZhi;
        ZhuangTai = zhuangTai;
        YuanGongID = yuanGongID;
        RuZhuShiJian = ruZhuShiJian;
        TuiFangShiJian = tuiFangShiJian;
        ShiFouSunHuai = shiFouSunHuai;
        Text1 = text1;
        Text2 = text2;
        Text3 = text3;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLeiXing() {
        return LeiXing;
    }

    public void setLeiXing(String leiXing) {
        LeiXing = leiXing;
    }

    public String getWeiZhi() {
        return WeiZhi;
    }

    public void setWeiZhi(String weiZhi) {
        WeiZhi = weiZhi;
    }

    public String getZhuangTai() {
        return ZhuangTai;
    }

    public void setZhuangTai(String zhuangTai) {
        ZhuangTai = zhuangTai;
    }

    public String getYuanGongID() {
        return YuanGongID;
    }

    public void setYuanGongID(String yuanGongID) {
        YuanGongID = yuanGongID;
    }

    public Date getRuZhuShiJian() {
        return RuZhuShiJian;
    }

    public void setRuZhuShiJian(Date ruZhuShiJian) {
        RuZhuShiJian = ruZhuShiJian;
    }

    public Date getTuiFangShiJian() {
        return TuiFangShiJian;
    }

    public void setTuiFangShiJian(Date tuiFangShiJian) {
        TuiFangShiJian = tuiFangShiJian;
    }

    public String getShiFouSunHuai() {
        return ShiFouSunHuai;
    }

    public void setShiFouSunHuai(String shiFouSunHuai) {
        ShiFouSunHuai = shiFouSunHuai;
    }

    public int getText1() {
        return Text1;
    }

    public void setText1(int text1) {
        Text1 = text1;
    }

    public String getText2() {
        return Text2;
    }

    public void setText2(String text2) {
        Text2 = text2;
    }

    public String getText3() {
        return Text3;
    }

    public void setText3(String text3) {
        Text3 = text3;
    }

    @Override
    public String toString() {
        return "GuanLi{" +
                "ID=" + ID +
                ", LeiXing='" + LeiXing + '\'' +
                ", WeiZhi='" + WeiZhi + '\'' +
                ", ZhuangTai='" + ZhuangTai + '\'' +
                ", YuanGongID='" + YuanGongID + '\'' +
                ", RuZhuShiJian=" + RuZhuShiJian +
                ", TuiFangShiJian=" + TuiFangShiJian +
                ", ShiFouSunHuai='" + ShiFouSunHuai + '\'' +
                ", Text1=" + Text1 +
                ", Text2='" + Text2 + '\'' +
                ", Text3='" + Text3 + '\'' +
                '}';
    }
}
