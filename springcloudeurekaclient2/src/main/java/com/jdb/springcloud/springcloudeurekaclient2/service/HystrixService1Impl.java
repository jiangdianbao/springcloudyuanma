package com.jdb.springcloud.springcloudeurekaclient2.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * 注解@HystrixCommand,就已经开启了服务隔离的功能
 *
 * @author 16600
 * @date 2020/10/24 16:47
 */
@Service
public class HystrixService1Impl implements HystrixService1 {

    @HystrixCommand
    @Override
    public String query() {
        return null;
    }

    @HystrixCommand
    @Override
    public String save() {
        return null;
    }
}
