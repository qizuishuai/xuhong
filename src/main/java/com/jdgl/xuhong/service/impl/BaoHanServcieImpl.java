package com.jdgl.xuhong.service.impl;

import com.jdgl.xuhong.dao.BaoHanMapper;
import com.jdgl.xuhong.entity.BaoHan;
import com.jdgl.xuhong.service.BaoHanServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BaoHanServcieImpl implements BaoHanServcie {
    @Autowired
    private BaoHanMapper baoHanMapper;
    @Override
    public List<BaoHan> all() {
        return baoHanMapper.selectList(null);
    }
}
