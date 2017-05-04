package com.animate.until;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by Administrator on 2017/1/16.
 */
public class ConfigWriter {

    public static void writePropertiesFile(String filePath, HashMap<String, String> map, boolean isAppend) {
        if(!filePath.endsWith(".properties")) {
            return;
        }
        try {
            File file = new File(filePath);
            if(!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), isAppend);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Map.Entry<String, String> entry : map.entrySet()) {
                bw.write(entry.getKey() + "=" + entry.getValue());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            //TODO
            e.printStackTrace();
        }
    }
}
