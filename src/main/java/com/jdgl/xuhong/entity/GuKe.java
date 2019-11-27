package com.jdgl.xuhong.entity;

import com.baomidou.mybatisplus.annotation.TableName;


@TableName(value = "guke")
public class GuKe {
    private int ZhengJianID;
    private String ZhengJianLeiXing;
    private String MingZi;
    private String XingBie;

    private String DianHua;
    private int Text1;
    private String Text2;
    private String Text3;

    @Override
    public String toString() {
        return "GuKe{" +
                "ZhengJianID=" + ZhengJianID +
                ", ZhengJianLeiXing='" + ZhengJianLeiXing + '\'' +
                ", MingZi='" + MingZi + '\'' +
                ", XingBie='" + XingBie + '\'' +
                ", DianHua='" + DianHua + '\'' +
                ", Text1=" + Text1 +
                ", Text2='" + Text2 + '\'' +
                ", Text3='" + Text3 + '\'' +
                '}';
    }

    public int getZhengJianID() {
        return ZhengJianID;
    }

    public void setZhengJianID(int zhengJianID) {
        ZhengJianID = zhengJianID;
    }

    public String getZhengJianLeiXing() {
        return ZhengJianLeiXing;
    }

    public void setZhengJianLeiXing(String zhengJianLeiXing) {
        ZhengJianLeiXing = zhengJianLeiXing;
    }

    public String getMingZi() {
        return MingZi;
    }

    public void setMingZi(String mingZi) {
        MingZi = mingZi;
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


    public GuKe(int zhengJianID, String zhengJianLeiXing, String mingZi, String xingBie, String dianHua, int text1, String text2, String text3) {
        ZhengJianID = zhengJianID;
        ZhengJianLeiXing = zhengJianLeiXing;
        MingZi = mingZi;
        XingBie = xingBie;
        DianHua = dianHua;
        Text1 = text1;
        Text2 = text2;
        Text3 = text3;
    }

    public GuKe() {

    }
}
