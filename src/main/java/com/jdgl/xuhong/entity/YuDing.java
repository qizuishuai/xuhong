package com.jdgl.xuhong.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName(value = "yuding")
public class YuDing {
    private int ID;
    private String ZhengJianID;
    private int YuanGongID;
    private String ShiJian;
    private int ShuLiang;
    private String JiaGe;
    private int Text1;
    private String Text2;
    private String Text3;

    public YuDing() {
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getZhengJianID() {
        return ZhengJianID;
    }

    public void setZhengJianID(String zhengJianID) {
        ZhengJianID = zhengJianID;
    }

    public int getYuanGongID() {
        return YuanGongID;
    }

    public void setYuanGongID(int yuanGongID) {
        YuanGongID = yuanGongID;
    }

    public String getShiJian() {
        return ShiJian;
    }

    public void setShiJian(String shiJian) {
        ShiJian = shiJian;
    }

    public int getShuLiang() {
        return ShuLiang;
    }

    public void setShuLiang(int shuLiang) {
        ShuLiang = shuLiang;
    }

    public String getJiaGe() {
        return JiaGe;
    }

    public void setJiaGe(String jiaGe) {
        JiaGe = jiaGe;
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
        return "YuDing{" +
                "ID=" + ID +
                ", ZhengJianID='" + ZhengJianID + '\'' +
                ", YuanGongID=" + YuanGongID +
                ", ShiJian=" + ShiJian +
                ", ShuLiang=" + ShuLiang +
                ", JiaGe='" + JiaGe + '\'' +
                ", Text1=" + Text1 +
                ", Text2='" + Text2 + '\'' +
                ", Text3='" + Text3 + '\'' +
                '}';
    }
}
