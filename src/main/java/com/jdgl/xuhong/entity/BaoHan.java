package com.jdgl.xuhong.entity;

import javax.persistence.*;

@Entity
@Table(name="baohan")
public class BaoHan {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID;
    private int PeiZhiID;
    private int Text1;
    private String Text2;
    private String Text3;

    public BaoHan() {
    }

    public BaoHan(int ID, int peiZhiID, int text1, String text2, String text3) {
        this.ID = ID;
        PeiZhiID = peiZhiID;
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

    public int getPeiZhiID() {
        return PeiZhiID;
    }

    public void setPeiZhiID(int peiZhiID) {
        PeiZhiID = peiZhiID;
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
        return "BaoHan{" +
                "ID=" + ID +
                ", PeiZhiID=" + PeiZhiID +
                ", Text1=" + Text1 +
                ", Text2='" + Text2 + '\'' +
                ", Text3='" + Text3 + '\'' +
                '}';
    }
}
