package org.wso2.carbon.connector.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipException;

public class ReadingContentUtil  {

    private static Log log = LogFactory.getLog(ReadingContentUtil.class);

    public void read(String zipFileLocation) throws ZipException,IOException{
        log.info("reading a zip file ");


            File file = new File(zipFileLocation);
            ZipFile zipfile = new ZipFile(file);
            ZipEntry zipentry;
            int fileNumber = 0;
            for (Enumeration<? extends ZipEntry> e = zipfile.entries(); e.hasMoreElements(); fileNumber++) {
                zipentry = e.nextElement();
                if (!zipentry.isDirectory()) {
                    System.out.println(fileNumber + "-" + zipentry.getName());


                }
            }
    }

}
