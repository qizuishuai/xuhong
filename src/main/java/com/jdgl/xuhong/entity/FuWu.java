package com.jdgl.xuhong.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.data.repository.cdi.Eager;

import java.util.Date;

@TableName(value = "fuwu")
public class FuWu {
    private int ZhengJianID;
    private String ZhengJianLeiXing;
    private String XingMing;
    private String XingBie;
    private String DianHua;
    private int YuanGongID;
    private String ShiJian;
    private String FangShi;
    private String PingJia;

    private int Text1;
    private String Text2;
    private String Text3;



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

    public String getShiJian() {
        return ShiJian;
    }

    public void setShiJian(String shiJian) {
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
