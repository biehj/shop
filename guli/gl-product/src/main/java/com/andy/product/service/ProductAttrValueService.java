package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.ProductAttrValueEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * spu属性值
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:18
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

