package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.AttrAttrgroupRelationEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:21
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

