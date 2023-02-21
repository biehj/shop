package com.andy.order.dao;

import com.andy.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:22:43
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
