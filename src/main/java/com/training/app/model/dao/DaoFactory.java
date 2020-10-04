package com.training.app.model.dao;

import com.training.app.model.dao.impl.DaoFactoryImpl;

import java.sql.SQLException;

/**
 * The type Dao factory.
 *
 * @author besko
 */
public abstract class DaoFactory {

    private static DaoFactory daoFactory;

    /**
     * Create user dao user dao.
     *
     * @return the user dao
     * @throws SQLException the sql exception
     */
    public abstract UserDAO createUserDao() throws SQLException;

    /**
     * Create appointment dao appointment dao.
     *
     * @return the appointment dao
     * @throws SQLException the sql exception
     */
    public abstract AppointmentDAO createAppointmentDao() throws SQLException;

    /**
     * Create cad dao card dao.
     *
     * @return the card dao
     * @throws SQLException the sql exception
     */
    public abstract CardDao createCadDao() throws SQLException;

    /**
     * Create feedback dao feedback dao.
     *
     * @return the feedback dao
     * @throws SQLException the sql exception
     */
    public abstract FeedbackDAO createFeedbackDao() throws SQLException;

    /**
     * Create service dao service dao.
     *
     * @return the service dao
     * @throws SQLException the sql exception
     */
    public abstract ServiceDAO createServiceDao() throws  SQLException;

    /**
     * Gets instance.
     *
     * @return the instance
     */
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
