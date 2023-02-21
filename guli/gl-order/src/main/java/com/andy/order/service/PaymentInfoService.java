package com.andy.order.service;

import com.andy.common.utils.PageUtils;
import com.andy.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:22:44
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

