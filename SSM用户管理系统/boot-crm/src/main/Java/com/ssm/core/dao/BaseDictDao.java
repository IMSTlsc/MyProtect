package com.ssm.core.dao;

import com.ssm.core.po.BaseDict;

import java.util.List;

/**
 * 数据字典
 */
public interface BaseDictDao {
    // 根据类别代码查询数据字典
    List<BaseDict> selectBaseDictByTypeCode(String typecode);
}

