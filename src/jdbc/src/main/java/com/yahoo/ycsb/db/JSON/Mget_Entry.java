package com.yahoo.ycsb.db.JSON;

public class Mget_Entry {
    private String id;
    private String device_id;
    public Mget_Entry(String id, String device_id){
        this.id = id;
        this.device_id = device_id;
    }

    public String getId() {
        return this.id;
    }

    public String getDeviceId() {
        return this.device_id;
    }
    
}
