package com.spc.platform.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spc.common.utils.PageUtils;
import com.spc.platform.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author spc
 * @email 1124516293@qq.com
 * @date 2021-11-25 20:22:46
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

