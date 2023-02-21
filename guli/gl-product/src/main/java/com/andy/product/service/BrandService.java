package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.BrandEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 品牌
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:21
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

