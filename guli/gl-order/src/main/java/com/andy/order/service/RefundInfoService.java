package com.andy.order.service;

import com.andy.common.utils.PageUtils;
import com.andy.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 退款信息
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:22:44
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

