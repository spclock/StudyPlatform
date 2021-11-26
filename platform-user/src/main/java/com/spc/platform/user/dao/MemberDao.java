package com.spc.platform.user.dao;

import com.spc.platform.user.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author spc
 * @email 1124516293@qq.com
 * @date 2021-11-26 09:25:01
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
