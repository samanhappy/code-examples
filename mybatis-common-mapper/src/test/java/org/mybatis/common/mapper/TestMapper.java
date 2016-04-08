package org.mybatis.common.mapper;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.mapper.TSalaryItemMapper;
import test.model.TSalaryItem;
import tk.mybatis.mapper.entity.Example;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestMapper extends AbstractJUnit4SpringContextTests
{
    @Autowired
    TSalaryItemMapper mapper;
    
    @Test
    public void testInsertAndDelete()
    {
        TSalaryItem salaryItem = new TSalaryItem();
        salaryItem.setItemName("test");
        salaryItem.setCorporateId(1);
        salaryItem.setIsTax((byte) 1);
        salaryItem.setItemType((byte) 1);
        salaryItem.setSalaryType((byte) 1);
        salaryItem.setStatus((byte) 1);
        salaryItem.setUpdatetime(new Date());

        //新增一条数据
        Assert.assertEquals(1, mapper.insert(salaryItem));
        //ID回写,不为空
        Assert.assertNotNull(salaryItem.getId());
        //通过主键删除新增的数据
        Assert.assertEquals(1, mapper.deleteByPrimaryKey(salaryItem));
    }

    @Test
    public void testPage()
    {
        RowBounds rowBounds = new RowBounds(0, 10);
        List<TSalaryItem> list = mapper.selectByRowBounds(null, rowBounds);
        Assert.assertNotNull(list);
        Assert.assertTrue(list.size() > 0);
        System.out.println(list.get(0).getItemName());
        System.out.println(list.size());
    }

    @Test
    public void testExample()
    {
        //通用Example查询
        Example example = new Example(TSalaryItem.class);
        example.createCriteria().andGreaterThan("id", 0);
        example.setOrderByClause("id desc");
        List<TSalaryItem> list = mapper.selectByExample(example);
        Assert.assertNotNull(list);
        Assert.assertTrue(list.size() > 0);
        System.out.println(list.get(0).getItemName());
        System.out.println(list.size());
    }
}
