package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.AttrEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:21
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

