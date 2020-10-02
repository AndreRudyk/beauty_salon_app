package com.training.app.model.entity.dao.impl;

import com.training.app.model.entity.Feedback;
import com.training.app.model.entity.Service;
import com.training.app.model.entity.dao.DaoException;
import com.training.app.model.entity.dao.FeedbackDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class FeedbackDaoImpl implements FeedbackDAO {
    private Connection connection;

    public FeedbackDaoImpl(Connection connection) {
        this.connection = connection;
    }

    /**
     * Add feedback.
     *
     * @param id       the id
     * @param service  the service
     * @param dateTime the date time
     * @param comment  the comment
     * @throws DaoException the dao exception
     */
    @Override
    public void addFeedback(int id, Service service, LocalDateTime dateTime, String comment) throws DaoException {

    }

    /**
     * Update feedback.
     *
     * @param id       the id
     * @param service  the service
     * @param dateTime the date time
     * @param comment  the comment
     * @throws DaoException the dao exception
     */
    @Override
    public void updateFeedback(int id, Service service, LocalDateTime dateTime, String comment) throws DaoException {

    }

    /**
     * Find by id optional.
     *
     * @param id the id
     * @return the optional
     * @throws DaoException the dao exception
     */
    @Override
    public Optional<Feedback> findById(int id) throws DaoException {
        return Optional.empty();
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

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
