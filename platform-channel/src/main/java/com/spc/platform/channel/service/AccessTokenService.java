package com.spc.platform.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spc.common.utils.PageUtils;
import com.spc.platform.channel.entity.AccessTokenEntity;

import java.util.Map;

/**
 * 渠道-认证表
 *
 * @author spc
 * @email 1124516293@qq.com
 * @date 2021-11-26 08:50:59
 */
public interface AccessTokenService extends IService<AccessTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

