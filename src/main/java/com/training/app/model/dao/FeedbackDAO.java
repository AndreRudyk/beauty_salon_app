package com.training.app.model.dao;

import com.training.app.model.entity.Feedback;

import java.util.List;

/**
 * The interface Feedback dao.
 */
public interface FeedbackDAO extends GenericDAO<Feedback> {

    /**
     * Add feedback.
     *
     * @param feedback the feedback
     * @throws DaoException the dao exception
     */
    void addFeedback(Feedback feedback) throws DaoException;

    /**
     * Find by id feedback.
     *
     * @param id the id
     * @return the feedback
     * @throws DaoException the dao exception
     */
    Feedback findById(int id) throws DaoException;

    /**
     * Find by service id list.
     *
     * @param serviceId the service id
     * @return the list
     * @throws DaoException the dao exception
     */
    List<Feedback> findByServiceId(int serviceId) throws DaoException;

    /**
     * Update feedback.
     *
     * @param feedbackId the feedback id
     * @param feedback   the feedback
     * @throws DaoException the dao exception
     */
    void updateFeedback(int feedbackId, Feedback feedback) throws DaoException;

    /**
     * Remove feedback by id feedback.
     *
     * @param id the id
     * @return the feedback
     * @throws DaoException the dao exception
     */
    Feedback removeFeedbackById(int id) throws DaoException;


}
