package com.work.common;

/**
 * Created by changzhou on 2017/4/13.
 */
public class SQLAdapter {

    String sql;

    public SQLAdapter(String sql) {
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}