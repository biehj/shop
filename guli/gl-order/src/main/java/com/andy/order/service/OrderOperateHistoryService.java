package com.andy.order.service;

import com.andy.common.utils.PageUtils;
import com.andy.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:22:44
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

