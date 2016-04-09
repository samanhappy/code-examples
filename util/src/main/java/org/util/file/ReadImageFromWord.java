package org.util.file;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Picture;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFPictureData;

public class ReadImageFromWord
{

    public void read(File file)
    {
        if (file.exists())
        {
            try
            {
                List<byte[]> result = new ArrayList<byte[]>();
                if (file.getName().endsWith("docx"))
                {
                    XWPFDocument doc = new XWPFDocument(new FileInputStream(file));
                    for (XWPFPictureData picture : doc.getAllPictures())
                    {
                        result.add(picture.getData());
                    }
                    doc.close();
                }
                else if (file.getName().endsWith("doc"))
                {
                    HWPFDocument doc = new HWPFDocument(new FileInputStream(file));
                    for (Picture picture : doc.getPicturesTable().getAllPictures())
                    {
                        result.add(picture.getContent());
                    }
                }
            }
            catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
