package com.andy.coupon.service;

import com.andy.common.utils.PageUtils;
import com.andy.coupon.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 16:59:57
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

