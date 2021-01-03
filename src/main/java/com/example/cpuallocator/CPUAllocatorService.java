package com.example.cpuallocator;

import org.apache.catalina.Server;

import java.util.*;

public class CPUAllocatorService {
    public List<Dictionary> GetCost (int hours, int cpus, float price) {
        Dictionary dc = new Hashtable();
        List<Dictionary> dictionaryList = new ArrayList<Dictionary>();

        CostConfig cc = new CostConfig();
        Dictionary costconfig = cc.GetCostPerHour();

        for (Enumeration i = costconfig.keys(); i.hasMoreElements();) {
            String region = i.nextElement().toString();
            //System.out.println(region + costconfig.get(region));
            Dictionary sol = GetCostForRegion((Dictionary) costconfig.get(region), hours, cpus);
            sol.put("region", region);
            dictionaryList.add(sol);
            break;
        }
        return dictionaryList;
    }
    Dictionary GetCostForRegion (Dictionary dt, int hours, int cpus) {
        Dictionary ans = new Hashtable();

        ServerConfig sc = new ServerConfig();
        Dictionary sdt = sc.GetServerDetails();

        System.out.print(sdt);
        return ans;
    }
}
