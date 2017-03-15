package org.util.commons.beanutils;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class TestMain
{
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException
    {
        TestBean1 bean1 = new TestBean1("bean11", "bean12", "bean13");
        bean1.setProp2(null);
        TestBean2 bean2 = new TestBean2("bean22", "bean23", "bean24");
        System.out.println(bean1);
        System.out.println(bean2);
        BeanUtils.copyProperties(bean2, bean1);
        System.out.println(bean1);
        System.out.println(bean2);
    }
}
