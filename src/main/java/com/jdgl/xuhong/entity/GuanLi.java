package com.jdgl.xuhong.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
@TableName(value = "guanli")
public class GuanLi {
    private int ID;
    private String LeiXing;
    private String WeiZhi;
    private String ZhuangTai;
    private String YuanGongID;
    private String RuZhuShiJian;
    private String TuiFangShiJian;
    private String ShiFouSunHuai;
    private int Text1;
    private String Text2;
    private String Text3;

    public GuanLi() {
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

    public String getRuZhuShiJian() {
        return RuZhuShiJian;
    }

    public void setRuZhuShiJian(String ruZhuShiJian) {
        RuZhuShiJian = ruZhuShiJian;
    }

    public String getTuiFangShiJian() {
        return TuiFangShiJian;
    }

    public void setTuiFangShiJian(String tuiFangShiJian) {
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
