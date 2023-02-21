package com.andy.ware.service;

import com.andy.common.utils.PageUtils;
import com.andy.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 采购信息
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:26:40
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

