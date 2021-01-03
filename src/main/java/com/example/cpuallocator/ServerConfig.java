package com.example.cpuallocator;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class ServerConfig {
    public Dictionary GetServerDetails() {
        Dictionary dict = new Hashtable();
        dict.put("large", 1);
        dict.put("xlarge", 2);
        dict.put("2xlarge", 4);
        dict.put("4xlarge", 8);
        dict.put("8xlarge", 16);
        dict.put("10xlarge", 32);

        return dict;
    }
}
