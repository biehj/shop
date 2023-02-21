package com.andy.ware.service;

import com.andy.common.utils.PageUtils;
import com.andy.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:26:41
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

