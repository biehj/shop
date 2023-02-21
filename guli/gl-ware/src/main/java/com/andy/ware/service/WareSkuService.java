package com.andy.ware.service;

import com.andy.common.utils.PageUtils;
import com.andy.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品库存
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:26:40
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

