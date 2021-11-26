package com.spc.platform.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spc.common.utils.PageUtils;
import com.spc.platform.content.entity.NewsEntity;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author spc
 * @email 1124516293@qq.com
 * @date 2021-11-26 09:21:09
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

