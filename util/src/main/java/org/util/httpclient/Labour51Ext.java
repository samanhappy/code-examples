package org.util.httpclient;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.cookie.BasicClientCookie;

public class Labour51Ext
{

    public static Map<String, String> types = new LinkedHashMap<String, String>();

    public static Map<String, String> cities = new LinkedHashMap<String, String>();

    static
    {
        //types.put("1", "非全日制小时最低工资");
        //types.put("2", "社会平均工资");
        //types.put("4", "最低工资标准");
        //types.put("5", "工资增长指导线");
        //types.put("7", "失业保险金");
        types.put("17", "养老保险缴费基数");
        types.put("13", "养老保险缴费比例");
        types.put("19", "医疗保险缴费基数");
        types.put("11", "医疗保险缴费比例");
        types.put("20", "工伤保险缴费基数");
        types.put("6", "工伤保险缴费比例");
        types.put("21", "生育保险缴费基数");
        types.put("3", "生育保险缴费比例");
        types.put("18", "失业保险缴费基数");
        types.put("8", "失业保险缴费比例");
        types.put("22", "住房公积金缴费基数");
        types.put("14", "住房公积金缴费比例");

        cities.put("2", "北京");
        cities.put("3", "天津");
        cities.put("10", "上海");
        cities.put("23", "重庆");
        cities.put("34", "广州");
        cities.put("35", "深圳");
        cities.put("36", "石家庄");
        cities.put("47", "太原");
        cities.put("48", "大同");
        cities.put("58", "呼和浩特");
        cities.put("70", "沈阳");
        cities.put("71", "大连");
        cities.put("76", "锦州");
        cities.put("84", "长春");
        cities.put("93", "哈尔滨");
        cities.put("106", "南京");
        cities.put("107", "无锡");
        cities.put("109", "常州");
        cities.put("110", "苏州");
        cities.put("111", "南通");
        cities.put("119", "杭州");
        cities.put("120", "宁波");
        cities.put("121", "温州");
        cities.put("123", "湖州");
        cities.put("130", "合肥");
        cities.put("146", "福州");
        cities.put("147", "厦门");
        cities.put("155", "南昌");
        cities.put("166", "济南");
        cities.put("167", "青岛");
        cities.put("171", "烟台");
        cities.put("183", "郑州");
        cities.put("200", "武汉");
        cities.put("212", "长沙");
        cities.put("227", "珠海");
        cities.put("228", "汕头");
        cities.put("229", "佛山");
        cities.put("234", "惠州");
        cities.put("240", "东莞");
        cities.put("241", "中山");
        cities.put("245", "南宁");
        cities.put("257", "海口");
        cities.put("259", "成都");
        cities.put("280", "贵阳");
        cities.put("289", "昆明");
        cities.put("305", "拉萨");
        cities.put("312", "西安");
        cities.put("322", "兰州");
        cities.put("336", "西宁");
        cities.put("344", "银川");
        cities.put("348", "乌鲁木齐");
    }

    public static void main(String[] args) throws ClientProtocolException, IOException
    {
        List<String> lines = IOUtils.readLines(new FileInputStream(new File("src/main/java/org/util/httpclient/datalist.txt")), "utf-8");
        for (String line : lines)
        {
            System.out.println(line);
        }
    }
    
    

    public static void crawl() throws IOException, ClientProtocolException
    {
        CookieStore cookieStore = new BasicCookieStore();
        BasicClientCookie dntCookie = new BasicClientCookie("dnt", "userid=753852");
        dntCookie.setDomain("hr.51labour.com");
        cookieStore.addCookie(dntCookie);
        BasicClientCookie pwdCookie = new BasicClientCookie("password",
                "kKQEuPtbxeggHd482BoUKG2la%2fXD2yAtSbZ%2fQF88xe5cDiZjTAeaFQ%3d%3d");
        cookieStore.addCookie(pwdCookie);
        pwdCookie.setDomain("hr.51labour.com");
        CloseableHttpClient httpclient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();

        Iterator<Map.Entry<String, String>> cityEntries = cities.entrySet().iterator();
        while (cityEntries.hasNext())
        {
            Map.Entry<String, String> city = cityEntries.next();
            Iterator<Map.Entry<String, String>> typeEntries = types.entrySet().iterator();
            while (typeEntries.hasNext())
            {
                Map.Entry<String, String> type = typeEntries.next();
                String uri = "http://hr.51labour.com/data/responseData.ashx?pgsize=1&typeid="
                        + type.getKey() + "&addrid=" + city.getKey();
                HttpPost post = new HttpPost(uri);
                HttpResponse response = httpclient.execute(post);
                System.out.println(IOUtils.toString(response.getEntity().getContent()));
                IOUtils.closeQuietly(response.getEntity().getContent());
            }
        }
        IOUtils.closeQuietly(httpclient);
    }

}
