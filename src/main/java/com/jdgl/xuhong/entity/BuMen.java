package com.jdgl.xuhong.entity;

import javax.persistence.*;

@Entity
@Table(name="bumen")
public class BuMen {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int BuMenID;
    private String BuMenMingCheng;
    private String BuMenRenShu;
    private String ZhiWei;
    private int Text1;
    private String Text2;
    private String Text3;

    public BuMen() {
    }

    public BuMen(int buMenID, String buMenMingCheng, String buMenRenShu, String zhiWei, int text1, String text2, String text3) {
        BuMenID = buMenID;
        BuMenMingCheng = buMenMingCheng;
        BuMenRenShu = buMenRenShu;
        ZhiWei = zhiWei;
        Text1 = text1;
        Text2 = text2;
        Text3 = text3;
    }

    @Override
    public String toString() {
        return "BuMen{" +
                "BuMenID=" + BuMenID +
                ", BuMenMingCheng='" + BuMenMingCheng + '\'' +
                ", BuMenRenShu='" + BuMenRenShu + '\'' +
                ", ZhiWei='" + ZhiWei + '\'' +
                ", Text1=" + Text1 +
                ", Text2='" + Text2 + '\'' +
                ", Text3='" + Text3 + '\'' +
                '}';
    }

    public int getBuMenID() {
        return BuMenID;
    }

    public void setBuMenID(int buMenID) {
        BuMenID = buMenID;
    }

    public String getBuMenMingCheng() {
        return BuMenMingCheng;
    }

    public void setBuMenMingCheng(String buMenMingCheng) {
        BuMenMingCheng = buMenMingCheng;
    }

    public String getBuMenRenShu() {
        return BuMenRenShu;
    }

    public void setBuMenRenShu(String buMenRenShu) {
        BuMenRenShu = buMenRenShu;
    }

    public String getZhiWei() {
        return ZhiWei;
    }

    public void setZhiWei(String zhiWei) {
        ZhiWei = zhiWei;
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
