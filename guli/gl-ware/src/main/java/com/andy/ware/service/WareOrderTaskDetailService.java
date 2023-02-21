package com.andy.ware.service;

import com.andy.common.utils.PageUtils;
import com.andy.ware.entity.WareOrderTaskDetailEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:26:41
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

