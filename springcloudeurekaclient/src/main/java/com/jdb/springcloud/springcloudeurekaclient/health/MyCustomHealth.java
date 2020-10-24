package com.jdb.springcloud.springcloudeurekaclient.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义的健康检查的类
 *
 * @author 16600
 * @date 2020/10/24 10:08
 */
@Configuration
public class MyCustomHealth implements HealthIndicator {

    private volatile static HealthEnum HealthFlag = HealthEnum.UP;

    @Override
    public Health health() {
        return HealthFlag.getHealth();
    }

    /**
     * 跟新当前服务的状态
     * 感觉没有必要加锁 但是还是加上吧
     *
     * @param healthEnum
     */
    public synchronized static void updateHealthStatus(HealthEnum healthEnum) {
        HealthFlag = healthEnum;
    }


    public enum HealthEnum {
        UP(new Health.Builder().status(Status.UP).build()),
        DOWN(new Health.Builder().status(Status.DOWN).build()),
        ;
        private Health health;

        HealthEnum(Health health) {
            this.health = health;
        }

        public Health getHealth() {
            return health;
        }
    }


}
