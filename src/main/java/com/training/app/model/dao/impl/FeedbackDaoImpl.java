package com.training.app.model.dao.impl;

import com.training.app.model.dao.FeedbackDAO;
import com.training.app.model.entity.Feedback;
import com.training.app.model.dao.DaoException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * The type Feedback dao.
 * @author besko
 */
public class FeedbackDaoImpl implements FeedbackDAO, AutoCloseable {
    private final Connection connection;

    /**
     * Instantiates a new Feedback dao.
     *
     * @param connection the connection
     */
    public FeedbackDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addFeedback(Feedback feedback) throws DaoException {
    }

    @Override
    public Feedback findById(int id) throws DaoException {
        return null;
    }

    @Override
    public List<Feedback> findByServiceId(int serviceId) throws DaoException {
        return null;
    }

    @Override
    public void updateFeedback(Feedback feedback) throws DaoException {

    }

    @Override
    public Feedback removeFeedbackById(int id) throws DaoException {
        return null;
    }

    @Override
    public void close() throws DaoException {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }
}
