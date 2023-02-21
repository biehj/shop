package com.andy.member.controller;

import com.andy.common.utils.PageUtils;
import com.andy.common.utils.R;
import com.andy.member.entity.MemberLevelEntity;
import com.andy.member.service.MemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员等级
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 17:09:49
 */
@RestController
@RequestMapping("member/memberlevel")
public class MemberLevelController {
    @Autowired
    private MemberLevelService memberLevelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("member:memberlevel:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberLevelService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("member:memberlevel:info")
    public R info(@PathVariable("id") Long id) {
        MemberLevelEntity memberLevel = memberLevelService.getById(id);

        return R.ok().put("memberLevel", memberLevel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("member:memberlevel:save")
    public R save(@RequestBody MemberLevelEntity memberLevel) {
        memberLevelService.save(memberLevel);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("member:memberlevel:update")
    public R update(@RequestBody MemberLevelEntity memberLevel) {
        memberLevelService.updateById(memberLevel);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("member:memberlevel:delete")
    public R delete(@RequestBody Long[] ids) {
        memberLevelService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
