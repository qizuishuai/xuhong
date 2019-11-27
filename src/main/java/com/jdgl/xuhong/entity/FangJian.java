package com.jdgl.xuhong.entity;

import javax.persistence.*;

@Entity
@Table(name="fangjian")
public class FangJian {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID;
    private String LeiXing;
    private String WeiZhi;
    private String ZhuangTai;
    private int Text1;
    private String Text2;
    private String Text3;

    public FangJian(int ID, String leiXing, String weiZhi, String zhuangTai, int text1, String text2, String text3) {
        this.ID = ID;
        LeiXing = leiXing;
        WeiZhi = weiZhi;
        ZhuangTai = zhuangTai;
        Text1 = text1;
        Text2 = text2;
        Text3 = text3;
    }

    public FangJian() {
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
        return "FangJian{" +
                "ID=" + ID +
                ", LeiXing='" + LeiXing + '\'' +
                ", WeiZhi='" + WeiZhi + '\'' +
                ", ZhuangTai='" + ZhuangTai + '\'' +
                ", Text1=" + Text1 +
                ", Text2='" + Text2 + '\'' +
                ", Text3='" + Text3 + '\'' +
                '}';
    }
}
