package com.dongtiandexue.eurekaparent.productserver.service.impl;

import com.dongtiandexue.eurekaparent.productserver.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @ClassName ProductServiceImpl
 * @Description TODO
 * @Author huawei
 * @Date 2019/2/23 12:24
 * @Version 1.0
 **/
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Object findById(Integer id) {
        return "根据商品id查询商品信息";
    }

    @Override
    public Object findAll() {
        return "查询所有商品信息";
    }
}
