package com.jdgl.xuhong.entity;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

@Entity
@Table(name="peizhi")
public class PeiZhi {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int PeiZhiID;
    private String ZhongLei;
    private  String ShuLiang;
    private  String GuiGe;
    private  String YanSe;
    private int Text1;
    private String Text2;
    private String Text3;

    public PeiZhi() {
    }

    public PeiZhi(int peiZhiID, String zhongLei, String shuLiang, String guiGe, String yanSe, int text1, String text2, String text3) {
        PeiZhiID = peiZhiID;
        ZhongLei = zhongLei;
        ShuLiang = shuLiang;
        GuiGe = guiGe;
        YanSe = yanSe;
        Text1 = text1;
        Text2 = text2;
        Text3 = text3;
    }

    public int getPeiZhiID() {
        return PeiZhiID;
    }

    public void setPeiZhiID(int peiZhiID) {
        PeiZhiID = peiZhiID;
    }

    public String getZhongLei() {
        return ZhongLei;
    }

    public void setZhongLei(String zhongLei) {
        ZhongLei = zhongLei;
    }

    public String getShuLiang() {
        return ShuLiang;
    }

    public void setShuLiang(String shuLiang) {
        ShuLiang = shuLiang;
    }

    public String getGuiGe() {
        return GuiGe;
    }

    public void setGuiGe(String guiGe) {
        GuiGe = guiGe;
    }

    public String getYanSe() {
        return YanSe;
    }

    public void setYanSe(String yanSe) {
        YanSe = yanSe;
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
        return "PeiZhi{" +
                "PeiZhiID=" + PeiZhiID +
                ", ZhongLei='" + ZhongLei + '\'' +
                ", ShuLiang='" + ShuLiang + '\'' +
                ", GuiGe='" + GuiGe + '\'' +
                ", YanSe='" + YanSe + '\'' +
                ", Text1=" + Text1 +
                ", Text2='" + Text2 + '\'' +
                ", Text3='" + Text3 + '\'' +
                '}';
    }
}
