package com.spc.platform.content.dao;

import com.spc.platform.content.entity.BannerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-横幅广告表
 * 
 * @author spc
 * @email 1124516293@qq.com
 * @date 2021-11-26 09:21:09
 */
@Mapper
public interface BannerDao extends BaseMapper<BannerEntity> {
	
}
