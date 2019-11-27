package com.jdgl.xuhong.entity;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="fuwu")
public class FuWu {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ZhengJianID;
    private String ZhengJianLeiXing;
    private String XingMing;
    private String XingBie;
    private String DianHua;
    private int YuanGongID;
    private Date ShiJian;
    private String FangShi;
    private String PingJia;

    private int Text1;
    private String Text2;
    private String Text3;

    public FuWu(int zhengJianID, String zhengJianLeiXing, String xingMing, String xingBie, String dianHua, int yuanGongID, Date shiJian, String fangShi, String pingJia, int text1, String text2, String text3) {
        ZhengJianID = zhengJianID;
        ZhengJianLeiXing = zhengJianLeiXing;
        XingMing = xingMing;
        XingBie = xingBie;
        DianHua = dianHua;
        YuanGongID = yuanGongID;
        ShiJian = shiJian;
        FangShi = fangShi;
        PingJia = pingJia;
        Text1 = text1;
        Text2 = text2;
        Text3 = text3;
    }

    public FuWu() {
    }

    @Override
    public String toString() {
        return "FuWu{" +
                "ZhengJianID=" + ZhengJianID +
                ", ZhengJianLeiXing='" + ZhengJianLeiXing + '\'' +
                ", XingMing='" + XingMing + '\'' +
                ", XingBie='" + XingBie + '\'' +
                ", DianHua='" + DianHua + '\'' +
                ", YuanGongID=" + YuanGongID +
                ", ShiJian=" + ShiJian +
                ", FangShi='" + FangShi + '\'' +
                ", PingJia='" + PingJia + '\'' +
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

    public String getFangShi() {
        return FangShi;
    }

    public void setFangShi(String fangShi) {
        FangShi = fangShi;
    }

    public String getPingJia() {
        return PingJia;
    }

    public void setPingJia(String pingJia) {
        PingJia = pingJia;
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
