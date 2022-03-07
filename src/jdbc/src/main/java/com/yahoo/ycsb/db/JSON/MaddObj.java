package com.yahoo.ycsb.db.JSON;

public class MaddObj {
    private MallData mallData;
    private MetaData metaData;
    public MaddObj(MallData mallData, MetaData metaData) {
        this.mallData = mallData;
        this.metaData = metaData;
    }
    public MallData getMallD() {
        return this.mallData;
    }
    public MetaData getMetaD() {
        return this.metaData;
    }
    
}
