package com.spc.platform.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spc.common.utils.PageUtils;
import com.spc.platform.question.entity.TypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author spc
 * @email 1124516293@qq.com
 * @date 2021-11-25 20:22:46
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

