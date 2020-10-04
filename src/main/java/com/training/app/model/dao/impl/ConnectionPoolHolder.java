package com.training.app.model.dao.impl;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author besko
 */
public class ConnectionPoolHolder {

    private static volatile DataSource dataSource;

    private ConnectionPoolHolder() {
    }

    public static DataSource getDataSource() throws IOException {
        if (dataSource == null) {
            synchronized (ConnectionPoolHolder.class) {
                if (dataSource == null) {
                    BasicDataSource basicDataSource = new BasicDataSource();
                    basicDataSource.setUrl("jdbc:mysql://localhost:3306/beauty_salon_db");
                    basicDataSource.setUsername("root");
                    basicDataSource.setPassword("root");
                    basicDataSource.setMinIdle(5);
                    basicDataSource.setMaxIdle(10);
                    basicDataSource.setMaxOpenPreparedStatements(100);
                    dataSource = basicDataSource;
                }
            }
        }
        return dataSource;
    }
}
