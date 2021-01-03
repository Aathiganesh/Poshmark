package com.example.cpuallocator;

import java.util.Dictionary;
import java.util.Hashtable;

public class CPUAllocator {
    public static void main (String args[]) {
        CPUAllocatorService cpuAllocatorService = new CPUAllocatorService();
        System.out.print("sssssss");
        System.out.print(cpuAllocatorService.GetCost(10, 32, 100));
    }
}