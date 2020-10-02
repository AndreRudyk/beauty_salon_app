package com.training.app.model.entity.dao.impl;

import com.training.app.model.entity.dao.AppointmentDAO;
import com.training.app.model.entity.dao.DaoFctory;
import com.training.app.model.entity.dao.UserDAO;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author besko
 */
public class DaoFactoryImpl extends DaoFctory {
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
