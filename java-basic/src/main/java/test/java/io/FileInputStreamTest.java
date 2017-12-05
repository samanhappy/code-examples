package test.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileInputStreamTest
{
    FileInputStream fis = null;
    
    byte[] data = null;

    @Before
    public void before() throws FileNotFoundException {
        data = new byte[3];
        fis = new FileInputStream("src/main/resources/read.txt");
    }
    
    @After
    public void after() throws IOException {
        data = null;
        fis.close();
    }

    @Test
    public void testRead() throws IOException {
        Assert.assertEquals('1', fis.read());
        fis.read(data);
        Assert.assertEquals('2', data[0]);
        Assert.assertEquals('3', data[1]);
        Assert.assertEquals('4', data[2]);
        fis.read(data, 1, 2);
        Assert.assertEquals('5', data[1]);
        Assert.assertEquals('6', data[2]);
    }
    
    @Test
    public void testSkip() throws IOException {
        fis.skip(1);
        Assert.assertEquals('2', fis.read());
    }
    
    @Test
    public void testMarkAndReset() throws IOException {
        Assert.assertEquals(false, fis.markSupported());
    }
}
