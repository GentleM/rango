package com.cjm.rango.cache;

import com.cjm.rango.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * 项目启动，redis加载缓存数据。
 *
 * @author rango
 *         2018-09-11 0:10
 **/
@Component
public class RedisCacheService implements CommandLineRunner{
//    private Logger logger = lo

    @Autowired
    private StringRedisTemplate StringRedisTemplate;

    @Override
    public void run(String... strings) throws Exception {
        StringRedisTemplate.delete(StringRedisTemplate.keys("*"));      //清空缓存数据
        StringRedisTemplate.opsForValue().set("aaa", "rango");
        StringRedisTemplate.opsForValue().set("xinzeng", "222");
    }
}
