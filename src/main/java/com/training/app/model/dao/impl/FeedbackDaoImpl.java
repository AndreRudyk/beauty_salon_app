package com.training.app.model.dao.impl;

import com.training.app.model.dao.FeedbackDAO;
import com.training.app.model.entity.Feedback;
import com.training.app.model.dao.DaoException;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author besko
 */
public class FeedbackDaoImpl implements FeedbackDAO, AutoCloseable {
    private final Connection connection;

    public FeedbackDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addFeedback(Feedback feedback) throws DaoException {

    }

    @Override
    public void updateFeedback(Feedback feedback) throws DaoException {

    }

    /**
     * Find by id optional.
     *
     * @param id the id
     * @return the optional
     * @throws DaoException the dao exception
     */
    @Override
    public Feedback findById(int id) throws DaoException {
        return null;
    }

    /**
     * Find by service id list.
     *
     * @param serviceId the service id
     * @return the list
     * @throws DaoException the dao exception
     */
    @Override
    public List<Feedback> findByServiceId(int serviceId) throws DaoException {
        return null;
    }

    /**
     * Remove by id.
     *
     * @param id the id
     * @throws DaoException the dao exception
     */
    @Override
    public void removeById(int id) throws DaoException {

    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
