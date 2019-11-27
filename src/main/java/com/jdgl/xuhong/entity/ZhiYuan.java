package com.jdgl.xuhong.entity;

import com.baomidou.mybatisplus.annotation.TableName;



@TableName(value = "zhiyuan")
public class ZhiYuan {
    private int YuanGongID;
    private String XingMing;
    private String XingBie;
    private String DianHua;
    private String ZhiWu;
    private String BuMenMingCheng;
    private int Text1;
    private String Text2;
    private String Text3;

    public ZhiYuan() {
    }

    public ZhiYuan(int yuanGongID, String xingMing, String xingBie, String dianHua, String zhiWu, String buMenMingCheng, int text1, String text2, String text3) {
        YuanGongID = yuanGongID;
        XingMing = xingMing;
        XingBie = xingBie;
        DianHua = dianHua;
        ZhiWu = zhiWu;
        BuMenMingCheng = buMenMingCheng;
        Text1 = text1;
        Text2 = text2;
        Text3 = text3;
    }

    @Override
    public String toString() {
        return "ZhiYuan{" +
                "YuanGongID=" + YuanGongID +
                ", XingMing='" + XingMing + '\'' +
                ", XingBie='" + XingBie + '\'' +
                ", DianHua='" + DianHua + '\'' +
                ", ZhiWu='" + ZhiWu + '\'' +
                ", BuMenMingCheng='" + BuMenMingCheng + '\'' +
                ", Text1=" + Text1 +
                ", Text2='" + Text2 + '\'' +
                ", Text3='" + Text3 + '\'' +
                '}';
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

    public String getDianHua() {
        return DianHua;
    }

    public void setDianHua(String dianHua) {
        DianHua = dianHua;
    }

    public String getZhiWu() {
        return ZhiWu;
    }

    public void setZhiWu(String zhiWu) {
        ZhiWu = zhiWu;
    }

    public String getBuMenMingCheng() {
        return BuMenMingCheng;
    }

    public void setBuMenMingCheng(String buMenMingCheng) {
        BuMenMingCheng = buMenMingCheng;
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
}
