package com.andy.product;

import com.andy.product.entity.BrandEntity;
import com.andy.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class ProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    public void contextLoads() {
        // BrandEntity brandEntity = new BrandEntity();
        // brandEntity.setDescript("华为");
        // brandService.save(brandEntity);

        // brandEntity.setBrandId(1L);
        // brandService.removeById(brandEntity);
        BrandEntity entity = brandService.lambdaQuery().eq(BrandEntity::getBrandId, 2L).one();
        System.out.println("保存成功");


    }

}
