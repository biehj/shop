package com.andy.order.dao;

import com.andy.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:22:44
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
