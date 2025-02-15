package com.selcuk.utils;
import com.selcuk.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class ReadPropertyFile {
    private ReadPropertyFile(){

    }
    private static Properties properties = new Properties();
    private static final Map<String,String> CONFIGMAP = new HashMap<>();
    static {
        try {
            FileInputStream file = new FileInputStream(FrameworkConstants.getConfigfilepath());
            properties.load(file);
            // Traditional way
            for(Map.Entry<Object,Object> entry : properties.entrySet()){
                CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()));
            }
//            // using java streams
//            properties.entrySet().forEach(entry -> CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue())));
//            // using java streams shorter way
//            properties.forEach((key, value) -> CONFIGMAP.put(String.valueOf(key), String.valueOf(value)));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static String get(String key) throws Exception {
        if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))){
            throw new Exception("Property name " + key + "is not found.Please check config.properties");
        }
        return CONFIGMAP.get(key);

    }
}
;