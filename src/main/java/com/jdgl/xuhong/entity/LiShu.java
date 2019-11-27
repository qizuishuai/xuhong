package com.jdgl.xuhong.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="lishu")
public class LiShu {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int YuanGongID;
    private String XingMing;
    private String XingBie;
    private String ZhiWu;
    private String DianHua;
    private String BuMenMingCheng;
    private int BuMenID;
    private Date RuZhiShiJian;
    private int Text1;
    private String Text2;
    private String Text3;

    public LiShu() {
    }

    public LiShu(int yuanGongID, String xingMing, String xingBie, String zhiWu, String dianHua, String buMenMingCheng, int buMenID, Date ruZhiShiJian, int text1, String text2, String text3) {
        YuanGongID = yuanGongID;
        XingMing = xingMing;
        XingBie = xingBie;
        ZhiWu = zhiWu;
        DianHua = dianHua;
        BuMenMingCheng = buMenMingCheng;
        BuMenID = buMenID;
        RuZhiShiJian = ruZhiShiJian;
        Text1 = text1;
        Text2 = text2;
        Text3 = text3;
    }

    public int getYuanGongID() {
        return YuanGongID;
    }

    public void setYuanGongID(int yuanGongID) {
        YuanGongID = yuanGongID;
    }

    public String getXingMing() {
        return XingMing;
    }

    public void setXingMing(String xingMing) {
        XingMing = xingMing;
    }

    public String getXingBie() {
        return XingBie;
    }

    public void setXingBie(String xingBie) {
        XingBie = xingBie;
    }

    public String getZhiWu() {
        return ZhiWu;
    }

    public void setZhiWu(String zhiWu) {
        ZhiWu = zhiWu;
    }

    public String getDianHua() {
        return DianHua;
    }

    public void setDianHua(String dianHua) {
        DianHua = dianHua;
    }

    public String getBuMenMingCheng() {
        return BuMenMingCheng;
    }

    public void setBuMenMingCheng(String buMenMingCheng) {
        BuMenMingCheng = buMenMingCheng;
    }

    public int getBuMenID() {
        return BuMenID;
    }

    public void setBuMenID(int buMenID) {
        BuMenID = buMenID;
    }

    public Date getRuZhiShiJian() {
        return RuZhiShiJian;
    }

    public void setRuZhiShiJian(Date ruZhiShiJian) {
        RuZhiShiJian = ruZhiShiJian;
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
        return "LiShu{" +
                "YuanGongID=" + YuanGongID +
                ", XingMing='" + XingMing + '\'' +
                ", XingBie='" + XingBie + '\'' +
                ", ZhiWu='" + ZhiWu + '\'' +
                ", DianHua='" + DianHua + '\'' +
                ", BuMenMingCheng='" + BuMenMingCheng + '\'' +
                ", BuMenID=" + BuMenID +
                ", RuZhiShiJian=" + RuZhiShiJian +
                ", Text1=" + Text1 +
                ", Text2='" + Text2 + '\'' +
                ", Text3='" + Text3 + '\'' +
                '}';
    }
}
