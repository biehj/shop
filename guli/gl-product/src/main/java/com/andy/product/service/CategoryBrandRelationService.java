package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:17
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

