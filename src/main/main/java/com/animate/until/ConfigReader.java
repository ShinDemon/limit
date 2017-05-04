package com.animate.until;

import java.io.*;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by Administrator on 2017/1/16.
 */
public class ConfigReader {

    public static Map<String,String> readPropertiesFile(String fileName) {
        Map<String, String> map = new HashMap<String, String>();
        if(!fileName.endsWith(".properties")) {
            return map;
        }
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempStr = null;
            while ((tempStr = reader.readLine()) != null) {
                if(tempStr.trim().equals("")) {
                    continue;
                }
                if(tempStr.trim().startsWith("#")){
                    continue;
                }
                String[] str = tempStr.split("[= :]", 2);
                map.put(str[0], str[1]);
            }
        } catch (FileNotFoundException e) {
            //TODO
            e.printStackTrace();
        } catch (IOException e) {
            //TODO
            e.printStackTrace();
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //TODO
                    e.printStackTrace();
                }
            }
        }
        return map;
    }
}
