package com.css.declare.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

/**
 * \* User: rgy
 * \* Date: 2019/8/22 11:27
 * \
 */
@Component
public class RedisClient {


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Autowired
    protected Environment environment;

    public void setString(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
        stringRedisTemplate.expire(key, getTimeout_seconds(0), TimeUnit.SECONDS);
    }

    public void setString(String key, String value, int timeout_seconds) {
        stringRedisTemplate.opsForValue().set(key, value);
        stringRedisTemplate.expire(key, getTimeout_seconds(timeout_seconds), TimeUnit.SECONDS);
    }

    public void setBean(String key, Object object) {
        redisTemplate.opsForValue().set(key, object);
        redisTemplate.expire(key, getTimeout_seconds(0), TimeUnit.SECONDS);
    }

    public void setBean(String key, Object object, int timeout_seconds) {
        redisTemplate.opsForValue().set(key, object);
        redisTemplate.expire(key, getTimeout_seconds(timeout_seconds), TimeUnit.SECONDS);
    }

    public void reflashExpire(String key, int timeout_seconds) {
        redisTemplate.boundHashOps(key).expire(getTimeout_seconds(timeout_seconds), TimeUnit.SECONDS);
    }

    public long getExpire(String key) {
        return redisTemplate.getExpire(key, TimeUnit.SECONDS);
    }

    public String getString(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    public <T> T getBean(String key) {
        return (T) redisTemplate.opsForValue().get(key);
    }

    public void deleteString(String key) {
        stringRedisTemplate.delete(key);
    }

    public void deleteString(Collection<String> keys) {
        stringRedisTemplate.delete(keys);
    }

    public void deleteBean(String keys) {
        redisTemplate.delete(keys);
    }

    public void deleteBean(Collection<String> keys) {
        redisTemplate.delete(keys);
    }

    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }

    private int getTimeout_seconds(int timeout_seconds) {
        int session_timeout = Integer.parseInt(environment.getProperty("server.session.timeout"));
        if (timeout_seconds == 0) {//|| timeout_seconds > session_timeout
            return session_timeout;
        }
        return timeout_seconds;
    }

}
