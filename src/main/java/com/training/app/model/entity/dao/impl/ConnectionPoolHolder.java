package com.training.app.model.entity.dao.impl;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author besko
 */
public class ConnectionPoolHolder {

    private static volatile DataSource dataSource;

    private ConnectionPoolHolder() {}

    public static DataSource getDataSource() throws IOException {
        if (dataSource == null) {
            synchronized (ConnectionPoolHolder.class) {
                if (dataSource == null) {
                    FileReader reader = new FileReader("db.properties");
                    Properties properties = new Properties();
                    properties.load(reader);
                    BasicDataSource basicDataSource = new BasicDataSource();
                    basicDataSource.setUrl(properties.getProperty("url"));
                    basicDataSource.setUsername(properties.getProperty("username"));
                    basicDataSource.setPassword(properties.getProperty("password"));
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
