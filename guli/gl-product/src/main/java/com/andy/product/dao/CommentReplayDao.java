package com.andy.product.dao;

import com.andy.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:18
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
