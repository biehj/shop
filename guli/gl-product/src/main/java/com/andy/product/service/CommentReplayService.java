package com.andy.product.service;

import com.andy.common.utils.PageUtils;
import com.andy.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-18 12:23:18
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

