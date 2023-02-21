package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.SkuSaleAttrValueEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:20
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

