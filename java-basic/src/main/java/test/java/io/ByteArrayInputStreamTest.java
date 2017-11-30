package test.java.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * ByteArrayInputStream用来读取字节数组
 */
public class ByteArrayInputStreamTest
{
    public final static int ANY_VALUE = -1;

    byte[] data = new byte[] {1, 2, 3};

    ByteArrayInputStream bais = null;

    @Before
    public void before() {
        bais = new ByteArrayInputStream(data);
    }

    @After
    public void after() throws IOException {
        bais.close();
    }

    @Test
    public void testRead() throws IOException {
        Assert.assertEquals(bais.read(), 1);
    }

    @Test
    public void testSkip() throws IOException {
        bais.skip(1);
        Assert.assertEquals(bais.read(), 2);
    }

    @Test
    public void testMarkAndReset() throws IOException {
        bais.mark(ANY_VALUE);
        bais.read();
        bais.reset();
        Assert.assertEquals(bais.read(), 1);
    }

}
