package com.kov.db_util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kovantonlenko on 12/10/2015.
 */
public class DataSource {

    private static com.kov.db_util.DataSource dataSource;

    private DataSource() {
    }

    public static com.kov.db_util.DataSource getInstance() {
        if (dataSource == null) {
            synchronized (com.kov.db_util.DataSource.class) {
                if (dataSource == null) {
                    dataSource = new com.kov.db_util.DataSource();
                }
            }
        }
        return dataSource;
    }

    public Connection getConnection() {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        Connection conn = null;
        try {
            cpds.setDriverClass("com.mysql.jdbc.Driver"); //loads the jdbc driver
            cpds.setJdbcUrl("jdbc:mysql://localhost:3306/test?serverTimezone=UTC");
            cpds.setUser("root");
            cpds.setPassword("root");

            cpds.setMinPoolSize(5);
            cpds.setAcquireIncrement(10);
            cpds.setMaxPoolSize(50);

            conn = cpds.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
