package com.dongtiandexue.eurekaparent.productserver.controller;

import com.dongtiandexue.eurekaparent.productserver.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author huawei
 * @Date 2019/2/23 12:21
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * 查询所有商品信息
     *
     * @return
     */
    @RequestMapping("findAll")
    public Object findAll() {
        return productService.findAll();
    }

    /**
     * 根据商品id查询指定商品
     *
     * @param id
     * @return
     */
    @RequestMapping("findById")
    public Object findById(@RequestParam("id") Integer id) {
        return productService.findById(id);
    }
}
