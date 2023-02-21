package com.andy.ware.service;

import com.andy.common.utils.PageUtils;
import com.andy.ware.entity.UndoLogEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:26:40
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

