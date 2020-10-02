package com.training.app.model.dao;

import com.training.app.model.dao.impl.DaoFactoryImpl;

import java.sql.SQLException;

public abstract class DaoFctory {
    private static DaoFctory daoFctory;

    public abstract UserDAO createUserDao() throws SQLException;
    public abstract AppointmentDAO createAppointmentDao() throws SQLException;

    public static DaoFctory getInstance() {
        if (daoFctory == null) {
            synchronized (DaoFctory.class) {
                if (daoFctory == null) {
                    DaoFctory tmp = new DaoFactoryImpl();
                    daoFctory = tmp;
                }
            }
        }
        return daoFctory;
    }
}
