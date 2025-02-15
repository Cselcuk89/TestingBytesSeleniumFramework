package com.selcuk.constants;

public final  class FrameworkConstants {
    //no class can extend this class because of private constructor.
    private FrameworkConstants(){

    }
    private static final String RESOURCESPATH = System.getProperty("user.dir") + "/src/test/resources";
    private static final String CONFIGFILEPATH = RESOURCESPATH + "/config/config.properties";
    public static String getConfigfilepath(){
        return CONFIGFILEPATH;
    }
}
