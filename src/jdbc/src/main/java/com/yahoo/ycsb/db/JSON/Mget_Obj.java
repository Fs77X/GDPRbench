package com.yahoo.ycsb.db.JSON;

public class Mget_Obj {
    private String id;
    private String prop;
    private String info;
    private String query;
    public Mget_Obj(String id, String prop, String info) {
        this.query = "mget_obj";
        this.id = id;
        this.prop = prop;
        this.info = info;
    }

    public String getId() {
        return this.id;
    }

    public String getProp(){
        return this.prop;
    }

    public String getInfo() {
        return this.info;
    }

    public String getQuery() {
        return this.query;
    }
    
}
