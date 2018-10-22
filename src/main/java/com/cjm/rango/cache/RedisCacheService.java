package com.cjm.rango.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 项目启动，redis加载缓存数据。
 *
 * @author rango
 * 2018-09-11 0:10
 **/
@Component
public class RedisCacheService implements CommandLineRunner {

    /**
     * 日志。
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisCacheService.class);

    @Autowired
    private StringRedisTemplate StringRedisTemplate;

    @Override
    public void run(String... strings) {
        LOGGER.info("[初始化数据]开始......");
        StringRedisTemplate.delete(StringRedisTemplate.keys("*"));      //清空缓存数据
        StringRedisTemplate.opsForValue().set("aaa", "rango");
        StringRedisTemplate.opsForValue().set("xinzeng", "222");
        LOGGER.info("[初始化数据]结束......");
    }
}
