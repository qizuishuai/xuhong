package com.jdgl.xuhong.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
@TableName(value = "lishu")
public class LiShu {
    private int YuanGongID;
    private String XingMing;
    private String XingBie;
    private String ZhiWu;
    private String DianHua;
    private String BuMenMingCheng;
    private int BuMenID;
    private String RuZhiShiJian;
    private int Text1;
    private String Text2;
    private String Text3;

    public LiShu() {
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

    public String getRuZhiShiJian() {
        return RuZhiShiJian;
    }

    public void setRuZhiShiJian(String ruZhiShiJian) {
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
