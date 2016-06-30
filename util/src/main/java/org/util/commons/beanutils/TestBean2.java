package org.util.commons.beanutils;

public class TestBean2
{

    String prop2;

    String prop3;

    String prop4;

    public TestBean2(String prop2, String prop3, String prop4)
    {
        super();
        this.prop2 = prop2;
        this.prop3 = prop3;
        this.prop4 = prop4;
    }

    @Override
    public String toString()
    {
        return prop2 + "," + prop3 + "," + prop4;
    }

    public String getProp4()
    {
        return prop4;
    }

    public void setProp4(String prop4)
    {
        this.prop4 = prop4;
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
