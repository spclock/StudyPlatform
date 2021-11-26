package com.spc.platform.study.dao;

import com.spc.platform.study.entity.ViewLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习浏览记录表
 * 
 * @author spc
 * @email 1124516293@qq.com
 * @date 2021-11-26 09:24:04
 */
@Mapper
public interface ViewLogDao extends BaseMapper<ViewLogEntity> {
	
}
