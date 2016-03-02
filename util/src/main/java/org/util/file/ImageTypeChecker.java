package org.util.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ImageTypeChecker
{
    public static String bytesToHexString(byte[] src)
    {
        StringBuilder strBuilder = new StringBuilder();
        if (src == null || src.length <= 0)
        {
            return null;
        }
        for (int i = 0; i < src.length; i++)
        {
            int v = src[i] & 0xFF;
            String strhs = Integer.toHexString(v);
            if (strhs.length() < 2)
            {
                strBuilder.append(0);
            }
            strBuilder.append(strhs);
        }
        return strBuilder.toString();
    }

    /**
     * 根据文件流读取图片文件真实类型
     * @param is
     * @return
     */
    public static String getTypeByStream(InputStream is)
    {
        byte[] b = new byte[4];
        try
        {
            is.read(b, 0, b.length);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                is.close();
            }
            catch (IOException e)
            {
            }
        }
        String type = bytesToHexString(b).toUpperCase();
        if (type.contains("FFD8FF"))
        {
            return "jpg";
        }
        else if (type.contains("89504E47"))
        {
            return "png";
        }
        else if (type.contains("47494638"))
        {
            return "gif";
        }
        else if (type.contains("49492A00"))
        {
            return "tif";
        }
        else if (type.contains("424D"))
        {
            return "bmp";
        }
        return type;
    }

    /**
     * 根据文件流读取图片文件真实类型
     * @param is
     * @return
     */
    public static String getTypeByURL(String httpUrl)
    {
        try
        {
            URL url = new URL(httpUrl);
            URLConnection conn = url.openConnection();
            conn.connect();
            return getTypeByStream(conn.getInputStream());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据文件流读取图片文件真实类型
     * @param is
     * @return
     */
    public static String getTypeByFilePath(String filePath)
    {
        try
        {
            FileInputStream is = null;
            is = new FileInputStream(filePath);
            return getTypeByStream(is);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String args[]) throws Exception
    {
        System.out.println(getTypeByFilePath("C:\\TEMP\\test.png"));
        System.out.println(getTypeByURL("http://www.weixinqz.com/uploadfile/2015/0408/20150408045700755.jpg"));
    }
}
