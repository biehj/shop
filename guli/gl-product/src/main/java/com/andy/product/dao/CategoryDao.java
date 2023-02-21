package com.andy.product.dao;

import com.andy.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
