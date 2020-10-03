package com.training.app.model.dao;

import com.training.app.model.dao.impl.DaoFactoryImpl;

import java.sql.SQLException;

public abstract class DaoFactory {
    private static DaoFactory daoFactory;

    public abstract UserDAO createUserDao() throws SQLException;
    public abstract AppointmentDAO createAppointmentDao() throws SQLException;

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            synchronized (DaoFactory.class) {
                if (daoFactory == null) {
                    DaoFactory tmp = new DaoFactoryImpl();
                    daoFactory = tmp;
                }
            }
        }
        return daoFactory;
    }
}
