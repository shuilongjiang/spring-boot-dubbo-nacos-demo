package cn.raysonblog.shopserviceprovider.service.impl;

import cn.raysonblog.shopserviceprovider.service.RpcShopService;
import org.apache.dubbo.config.annotation.Service;


@Service
public class ShopServiceImpl implements RpcShopService {

    public String sayHello(String name) {
        return name;
    }
}
