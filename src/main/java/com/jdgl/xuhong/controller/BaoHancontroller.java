package com.jdgl.xuhong.controller;


import com.jdgl.xuhong.entity.BaoHan;
import com.jdgl.xuhong.service.BaoHanServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BaoHancontroller {
    @Autowired
    private BaoHanServcie baoHanServcie;
      @RequestMapping("/ss")
      @ResponseBody
    public List<BaoHan> findTypeInfos() {

        return baoHanServcie.all();

    }


}
