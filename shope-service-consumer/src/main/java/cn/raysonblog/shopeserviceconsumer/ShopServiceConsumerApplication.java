package cn.raysonblog.shopeserviceconsumer;


import cn.raysonblog.shopserviceprovider.service.RpcShopService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShopServiceConsumerApplication{
    @Reference
    RpcShopService shopService;

        @RequestMapping(name = "/sayHello", method = RequestMethod.GET)
        public String sayHello(){
            return shopService.sayHello("Hello Dubbo Nacos!");
        }

        public static void main(String[] args) {
            SpringApplication.run(ShopServiceConsumerApplication.class, args);
        }

}
