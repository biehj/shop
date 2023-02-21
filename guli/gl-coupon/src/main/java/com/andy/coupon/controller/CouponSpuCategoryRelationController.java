package com.andy.coupon.controller;

import com.andy.common.utils.PageUtils;
import com.andy.common.utils.R;
import com.andy.coupon.entity.CouponSpuCategoryRelationEntity;
import com.andy.coupon.service.CouponSpuCategoryRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 优惠券分类关联
 *
 * @author Andy
 * @email 13774082213@163.com
 * @date 2023-02-19 16:59:57
 */
@RestController
@RequestMapping("coupon/couponspucategoryrelation")
public class CouponSpuCategoryRelationController {
    @Autowired
    private CouponSpuCategoryRelationService couponSpuCategoryRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:couponspucategoryrelation:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = couponSpuCategoryRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:couponspucategoryrelation:info")
    public R info(@PathVariable("id") Long id) {
        CouponSpuCategoryRelationEntity couponSpuCategoryRelation = couponSpuCategoryRelationService.getById(id);

        return R.ok().put("couponSpuCategoryRelation", couponSpuCategoryRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:couponspucategoryrelation:save")
    public R save(@RequestBody CouponSpuCategoryRelationEntity couponSpuCategoryRelation) {
        couponSpuCategoryRelationService.save(couponSpuCategoryRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:couponspucategoryrelation:update")
    public R update(@RequestBody CouponSpuCategoryRelationEntity couponSpuCategoryRelation) {
        couponSpuCategoryRelationService.updateById(couponSpuCategoryRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:couponspucategoryrelation:delete")
    public R delete(@RequestBody Long[] ids) {
        couponSpuCategoryRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
