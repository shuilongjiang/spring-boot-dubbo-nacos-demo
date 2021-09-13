package cn.raysonblog.shopeserviceconsumer.controller;

import cn.raysonblog.shopserviceprovider.service.RpcShopService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Reference
    RpcShopService rpcShopService;
    @RequestMapping("say")
    public String sayHello(){

        return rpcShopService.sayHello("HelloWord!!!!");
    }
}
