package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.SkuImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * sku图片
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:19
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

