package test.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileOutputStreamTest
{

    FileOutputStream fos = null;
    
    FileInputStream fis = null;
    
    String file = "src/main/resources/write.txt";
    
    @Before
    public void before() {
        
    }
    
    @After
    public void after() throws IOException {
        if (fos != null) {
            fos.close();
        }
        if (fis != null) {
            fis.close();
        }
        new File(file).delete();
    }
    
    @Test
    public void testWrite() throws IOException {
        fos = new FileOutputStream(file);
        fos.write('1');
        fos.write(new byte[]{'2','3'});
        fos.write(new byte[]{'4','5','6'}, 1, 1);
        
        fis = new FileInputStream(file);
        Assert.assertEquals('1', fis.read());
        Assert.assertEquals('2', fis.read());
        Assert.assertEquals('3', fis.read());
        Assert.assertEquals('5', fis.read());
    }
    
    @Test
    public void testAppend() throws IOException {
        fos = new FileOutputStream(file, true);
        fos.write('1');
        fos.close();
        
        fos = new FileOutputStream(file, true);
        fos.write('2');
        
        fis = new FileInputStream(file);
        Assert.assertEquals('1', fis.read());
        Assert.assertEquals('2', fis.read());
    }
}
