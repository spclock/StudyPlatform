package com.spc.platform.channel.dao;

import com.spc.platform.channel.entity.AccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author spc
 * @email 1124516293@qq.com
 * @date 2021-11-26 08:50:59
 */
@Mapper
public interface AccessTokenDao extends BaseMapper<AccessTokenEntity> {
	
}
