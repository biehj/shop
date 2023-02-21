package com.andy.member.service;

import com.andy.common.utils.PageUtils;
import com.andy.member.entity.MemberCollectSubjectEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:09:49
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

