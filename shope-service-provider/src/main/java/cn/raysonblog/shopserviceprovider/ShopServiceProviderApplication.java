package cn.raysonblog.shopserviceprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableDubbo
public class ShopServiceProviderApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ShopServiceProviderApplication.class, args).registerShutdownHook();
    }

}