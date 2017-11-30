package test.java.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * ByteArrayOutputStream用来生成字节数组
 * 
 * @author samanhappy
 *
 */
public class ByteArrayOutputStreamTest
{
    ByteArrayOutputStream baos = null;

    byte[] data = null;

    @Before
    public void before() {
        baos = new ByteArrayOutputStream();
    }

    @After
    public void after() throws IOException {
        baos.close();
        data = null;
    }

    @Test
    public void testWriteInt() {
        baos.write(1);
        data = baos.toByteArray();
        Assert.assertEquals(1, data.length);
        Assert.assertEquals(1, data[0]);
    }

    @Test
    public void testWriteArray() throws IOException {
        baos.write(new byte[] {1, 2, 3});
        data = baos.toByteArray();
        Assert.assertEquals(3, data.length);
        Assert.assertEquals(3, data[2]);
    }

    @Test
    public void testWriteArrayWithOffset() throws IOException {
        baos.write(new byte[] {1, 2, 3}, 1, 1);
        data = baos.toByteArray();
        Assert.assertEquals(1, data.length);
        Assert.assertEquals(2, data[0]);
    }

}
