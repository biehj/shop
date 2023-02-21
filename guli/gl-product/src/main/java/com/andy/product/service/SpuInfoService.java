package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.SpuInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * spu信息
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:20
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

