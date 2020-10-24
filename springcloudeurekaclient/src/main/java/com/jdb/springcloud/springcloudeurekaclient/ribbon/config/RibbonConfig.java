package com.jdb.springcloud.springcloudeurekaclient.ribbon.config;

import com.jdb.springcloud.springcloudeurekaclient.ribbon.config.client.SpringCloudEurekaClient2RibbonConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * 通过配置@RibbonClients实现application.properties文件中的ribbon的配置
 * 但是要注意事里面的配置类(eg:SpringCloudEurekaClient2RibbonConfig)不能被当前的spring扫描到,因为里面是以@bean的形式配置的,扫描到了之后,会把这个变成全局的配置
 * 所以在启动类上面对@ComponentScan做了处理.
 * 注解@RibbonClients属性
 * 1. value 多个client配置的数组,可以进行多个的配置
 * 2. defaultConfiguration 配置的数组,可以使用默认的全局配置 ,可以被上面单个指定的配置覆盖.
 *
 * @author 16600
 * @date 2020/10/24 14:50
 */
@RibbonClients(@RibbonClient(name = "springcloudeurekaclient2", configuration = SpringCloudEurekaClient2RibbonConfig.class))
public class RibbonConfig {
}
