package com.jdgl.xuhong.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="yuding")
public class YuDing {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID;
    private String ZhengJianID;
    private int YuanGongID;
    private Date ShiJian;
    private int ShuLiang;
    private String JiaGe;
    private int Text1;
    private String Text2;
    private String Text3;

    public YuDing() {
    }

    public YuDing(int ID, String zhengJianID, int yuanGongID, Date shiJian, int shuLiang, String jiaGe, int text1, String text2, String text3) {
        this.ID = ID;
        ZhengJianID = zhengJianID;
        YuanGongID = yuanGongID;
        ShiJian = shiJian;
        ShuLiang = shuLiang;
        JiaGe = jiaGe;
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

    public Date getShiJian() {
        return ShiJian;
    }

    public void setShiJian(Date shiJian) {
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
