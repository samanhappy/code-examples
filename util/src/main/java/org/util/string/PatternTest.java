package org.util.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest
{

    public static void main(String[] args)
    {
        Pattern p = Pattern.compile("\\$\\{[a-zA-Z0-9\u4e00-\u9fa5]+\\}");
        Matcher m = p.matcher("${发的说法} >=  ${测试项目} ");
        while (m.find())
        {
            System.out.println(m.group());
        }
    }
}
