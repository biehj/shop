package com.andy.member.service;

import com.andy.common.utils.PageUtils;
import com.andy.member.entity.MemberStatisticsInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:09:50
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

