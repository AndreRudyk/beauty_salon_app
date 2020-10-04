package com.training.app.model.dao.impl;

import com.training.app.model.dao.*;

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

    @Override
    public CardDao createCadDao() throws SQLException {
        return new CardDaoImpl(dataSource.getConnection());
    }

    @Override
    public FeedbackDAO createFeedbackDao() throws SQLException {
        return new FeedbackDaoImpl(dataSource.getConnection());
    }

    @Override
    public ServiceDAO createServiceDao() throws SQLException {
        return new ServiceDaoImpl(dataSource.getConnection());
    }
}
