package com.andy.member.service;

import com.andy.common.utils.PageUtils;
import com.andy.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:09:50
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

