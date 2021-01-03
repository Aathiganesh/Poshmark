package com.example.cpuallocator;

import java.util.Dictionary;
import java.util.Hashtable;

public class CostConfig {

    public Dictionary GetCostPerHour() {
        Dictionary dict = new Hashtable();

        Dictionary east = new Hashtable();
        east.put("large", 0.12);
        east.put("xlarge", 0.23);
        east.put("2xlarge", 0.45);
        east.put("4xlarge", 0.774);
        east.put("8xlarge", 1.4);
        east.put("10xlarge", 2.72);
        dict.put("useast", east);

        Dictionary west = new Hashtable();
        west.put("large", 0.14);
        west.put("2xlarge", 0.413);
        west.put("4xlarge", 0.89);
        west.put("8xlarge", 1.3);
        west.put("10xlarge", 2.97);
        dict.put("uswest", west);

        Dictionary asia = new Hashtable();
        asia.put("large", 0.11);
        asia.put("xlarge", 0.20);
        asia.put("4xlarge", 0.67);
        asia.put("8xlarge", 1.18);
        dict.put("asia", asia);

        return dict;
    }
}
