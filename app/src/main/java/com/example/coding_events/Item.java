package com.example.coding_events;

public class Item {

    private String hostname;
    private String compname;
    private String comptime;



    public Item(String hostname,String compname,String comptime)
    {
        this.hostname=hostname;
        this.compname=compname;
        this.comptime=comptime;
    }

    public String getHostname()
    {
        return hostname;
    }
    public String getCompname()
    {
        return compname;
    }
    public String getComptime()
    {
        return comptime;
    }
}
