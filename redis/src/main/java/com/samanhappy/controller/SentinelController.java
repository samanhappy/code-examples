package com.samanhappy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * Created by xin on 15/1/7. 
 */
@Controller
public class SentinelController
{

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/sentinelTest")
    public String sentinelTest(final Model model, final HttpServletRequest request, final String action) {
        return "sentinelTest";
    }

    @ExceptionHandler(value = {java.lang.Exception.class})
    @RequestMapping("/setValueToRedis")
    public String setValueToRedis(final Model model, final HttpServletRequest request, final String action)
            throws Exception
    {
        Map<String, String> mapValue = new HashMap<String, String>();
        for (int i = 0; i < 1000; i++)
        {
            mapValue.put(String.valueOf(i), String.valueOf(i));
        }
        try
        {
            BoundHashOperations<String, String, String> boundHashOperations = redisTemplate.boundHashOps("test");
            boundHashOperations.putAll(mapValue);
            System.out.println("put key into redis");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new Exception(e);
        }

        return "sentinelTest";
    }

    @ExceptionHandler(value = {java.lang.Exception.class})
    @RequestMapping("/setSingleValueToRedis")
    public String setSingleValueToRedis(final Model model, final HttpServletRequest request, final String action)
            throws Exception
    {
        redisTemplate.execute(new RedisCallback<Object>()
        {
            @Override
            public Object doInRedis(RedisConnection connection) throws DataAccessException {
                connection.set(redisTemplate.getStringSerializer().serialize("test"), redisTemplate
                        .getStringSerializer().serialize("hello"));
                return null;
            }
        });
        return "";
    }

}
