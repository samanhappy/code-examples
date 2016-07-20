package org.util.string;

public class StringUtil
{
    public String trimAllBlank(String str)
    {
        return str.replaceAll("[ |　| ]", " ").trim();
    }
}
