package org.util.commons.beanutils;

public class TestBean1
{

    String prop1;

    String prop2;

    String prop3;

    public TestBean1(String prop1, String prop2, String prop3)
    {
        super();
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
    }
    
    @Override
    public String toString()
    {
        return prop1 + "," + prop2 + "," + prop3;
    }

    public String getProp1()
    {
        return prop1;
    }

    public void setProp1(String prop1)
    {
        this.prop1 = prop1;
    }

    public String getProp2()
    {
        return prop2;
    }

    public void setProp2(String prop2)
    {
        this.prop2 = prop2;
    }

    public String getProp3()
    {
        return prop3;
    }

    public void setProp3(String prop3)
    {
        this.prop3 = prop3;
    }

}
