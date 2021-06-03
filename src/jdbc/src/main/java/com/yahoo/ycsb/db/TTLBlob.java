package com.yahoo.ycsb.db;
/**
 * ttlcount class ye.
 */
public class TTLBlob {
  private long count;

  public TTLBlob() {
    super();
  }

  public TTLBlob(long count) {
    this.count = count;
  }
  public void setCount(long ourCount) {
    this.count = ourCount;
  }
  public long getCount(){
    return this.count;
  }
}
