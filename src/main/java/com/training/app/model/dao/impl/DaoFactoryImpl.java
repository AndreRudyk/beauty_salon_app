package com.training.app.model.dao.impl;

import com.training.app.model.dao.AppointmentDAO;
import com.training.app.model.dao.UserDAO;
import com.training.app.model.dao.DaoFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author besko
 */
public class DaoFactoryImpl extends DaoFactory {
    private DataSource dataSource;

    {
        try {
            dataSource = ConnectionPoolHolder.getDataSource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public UserDAO createUserDao() throws SQLException {
        return new UserDaoImpl(dataSource.getConnection());
    }

    @Override
    public AppointmentDAO createAppointmentDao() throws SQLException {
        return new AppointmentDaoImpl(dataSource.getConnection());
    }
}
