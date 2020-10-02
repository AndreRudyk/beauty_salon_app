package com.training.app.model.dao;

import com.training.app.model.entity.Feedback;
import com.training.app.model.entity.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * The interface Feedback dao.
 *
 * @author besko
 */
public interface FeedbackDAO extends GenericDAO<Feedback> {

    /**
     * Add feedback.
     *
     * @param id       the id
     * @param service  the service
     * @param dateTime the date time
     * @param comment  the comment
     * @throws DaoException the dao exception
     */
    void addFeedback(int id,
                     Service service,
                     LocalDateTime dateTime,
                     String comment) throws DaoException;

    /**
     * Update feedback.
     *
     * @param id       the id
     * @param service  the service
     * @param dateTime the date time
     * @param comment  the comment
     * @throws DaoException the dao exception
     */
    void updateFeedback(int id,
                        Service service,
                        LocalDateTime dateTime,
                        String comment) throws DaoException;

    /**
     * Find by id optional.
     *
     * @param id the id
     * @return the optional
     * @throws DaoException the dao exception
     */
    Optional<Feedback> findById(int id) throws DaoException;

    /**
     * Find by service id list.
     *
     * @param serviceId the service id
     * @return the list
     * @throws DaoException the dao exception
     */
    List<Feedback> findByServiceId(int serviceId) throws DaoException;

    /**
     * Remove by id.
     *
     * @param id the id
     * @throws DaoException the dao exception
     */
    void removeById(int id) throws DaoException;


}
