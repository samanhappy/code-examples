package org.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 如果要事务管理（比如要在测试结果出来之后回滚测试内容），就可以使用AbstractTransactionalJUnit4SpringTests类
 * 
 * @author samanhappy
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MyServiceTest extends AbstractJUnit4SpringContextTests
{
    @Autowired
    private MyService myService;

    @Test
    public void testService()
    {
        myService.service();
    }

}
