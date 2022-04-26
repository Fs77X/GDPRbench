package com.yahoo.ycsb.db;

public class MetaData {
    private String id;
    private String querier;
    private String purpose;
    private int ttl;
    private String origin;
    private String objection;
    private String sharing;
    private String enforcement_action;
    private String inserted_at;
    private int device_id;
    private String key;

    public MetaData() {

    }

    public MetaData(String id, String querier, String purpose, int ttl, String origin, String objection, String sharing, String enforcement_action, String inserted_at, int device_id, String key) {
        this.id = id;
        this.querier = querier;
        this.purpose = purpose;
        this.ttl = ttl;
        this.origin = origin;
        this.objection = objection;
        this.sharing = sharing;
        this.enforcement_action = enforcement_action;
        this.inserted_at = inserted_at;
        this.device_id = device_id;
        this.key = key;

    }

    public String getID() {
        return this.id;
    }

    public String getQuerier() {
        return this.querier;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public int getTtl() {
        return this.ttl;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getObjection() {
        return this.objection;
    }

    public String getSharing() {
        return this.sharing;
    }

    public String getEnforcementAction() {
        return this.enforcement_action;
    }

    public String getInsertedAt() {
        return this.inserted_at;
    }

    public int getDeviceID() {
        return this.device_id;
    }

    public String getKey() {
        return this.key;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("id: ");
        s.append(this.getID()).append(", querier: ");
        s.append(this.getQuerier()).append(", purpose: ");
        s.append(this.getPurpose()).append(", ttl: ");
        s.append(this.getTtl()).append(", origin: ");
        s.append(this.getOrigin()).append(", objection: ");
        s.append(this.getObjection()).append(", sharing: ");
        s.append(this.getSharing()).append(", enforcement_action: ");
        s.append(this.getEnforcementAction()).append(", inserted_at: ");
        s.append(this.getInsertedAt()).append(", device_id: ");
        s.append(this.getDeviceID()).append(", key: ");
        s.append(this.getKey());

        return s.toString();
    }

    
}