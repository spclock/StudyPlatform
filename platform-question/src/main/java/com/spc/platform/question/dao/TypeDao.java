package com.spc.platform.question.dao;

import com.spc.platform.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author spc
 * @email 1124516293@qq.com
 * @date 2021-11-25 20:22:46
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
