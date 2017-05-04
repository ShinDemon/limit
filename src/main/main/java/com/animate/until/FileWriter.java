package com.animate.until;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * Created by Administrator on 2017/1/16.
 */
public class FileWriter {

    /**
     * BufferedWriter写入文件
     * 缓冲字符（BufferedWriter ）是一个字符流类来处理字符数据。不同于字节流（数据转换成字节），你可以直接写字符串，数组或字符数据保存到文件。
     * @param path
     * @param data
     * @param isAppend
     */
    public static void writeFileWithWriter(String path, String data, boolean isAppend) {
        try {
            File file = new File(path);
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            java.io.FileWriter fw = new java.io.FileWriter(file.getAbsoluteFile(), isAppend);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
            //System.out.println("Done");
        } catch (IOException e) {
            //TODO
            e.printStackTrace();
        }
    }

    /**
     * FileOutputStream写入文件
     * 文件输出流是一种用于处理原始二进制数据的字节流类。为了将数据写入到文件中，必须将数据转换为字节，并保存到文件。
     * @param path
     * @param data
     */
    public static void writeFileWithStream(String path, String data, boolean isAppend) {
        FileOutputStream fop = null;
        File file;
        try {
            file = new File(path);
            fop = new FileOutputStream(file, isAppend);
            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            // get the content in bytes
            byte[] contentInBytes = data.getBytes();
            fop.write(contentInBytes);
            fop.flush();
            fop.close();
            //System.out.println("Done");
        } catch (IOException e) {
            //TODO
            e.printStackTrace();
        } finally {
            try {
                if (fop != null) {
                    fop.close();
                }
            } catch (IOException e) {
                //TODO
                e.printStackTrace();
            }
        }
    }
}
