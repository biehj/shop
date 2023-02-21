package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.SpuImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * spu图片
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:20
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

