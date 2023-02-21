package com.andy.coupon.service;

import com.andy.common.utils.PageUtils;
import com.andy.coupon.entity.HomeSubjectEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 16:59:57
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

