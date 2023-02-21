package com.andy.coupon.service;

import com.andy.common.utils.PageUtils;
import com.andy.coupon.entity.SeckillSkuNoticeEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 16:59:58
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

