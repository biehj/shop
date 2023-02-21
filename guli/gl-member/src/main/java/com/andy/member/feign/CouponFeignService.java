package com.andy.member.feign;

import com.andy.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Andy
 * @date: 2023-02-19 20:13
 * @version: 1.0.0
 * @description:
 */
@FeignClient("andy-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/info/{id}")
        // @RequiresPermissions("coupon:coupon:info")
    R info(@PathVariable("id") Long id);
}