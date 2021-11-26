package com.spc.platform.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spc.common.utils.PageUtils;
import com.spc.platform.user.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 会员-积分值变化历史记录表
 *
 * @author spc
 * @email 1124516293@qq.com
 * @date 2021-11-26 09:25:01
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

