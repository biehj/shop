package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.AttrGroupEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 属性分组
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:21
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

