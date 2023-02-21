package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.SpuInfoDescEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:17
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

