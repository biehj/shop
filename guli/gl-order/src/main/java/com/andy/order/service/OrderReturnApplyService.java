package com.andy.order.service;

import com.andy.common.utils.PageUtils;
import com.andy.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:22:44
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

