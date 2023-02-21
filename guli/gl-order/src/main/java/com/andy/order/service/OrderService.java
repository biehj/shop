package com.andy.order.service;

import com.andy.common.utils.PageUtils;
import com.andy.order.entity.OrderEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 订单
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:22:43
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

