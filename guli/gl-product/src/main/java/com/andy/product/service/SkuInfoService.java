package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.SkuInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * sku信息
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:19
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

