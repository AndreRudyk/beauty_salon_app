package com.training.app.model.dao;

import com.training.app.model.entity.Feedback;
import com.training.app.model.entity.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * The interface Service dao.
 *
 * @author besko
 */
public interface ServiceDAO extends GenericDAO<Service> {
    /**
     * Create appointment.
     *
     * @param service the service
     * @throws DaoException the dao exception
     */
    void createService(Service service) throws DaoException;


    /**
     * Update service.
     *
     * @param id           the id
     * @param serviceName  the service name
     * @param description  the description
     * @param price        the price
     * @param duration     the duration
     * @param feedbackList the feedback list
     * @throws DaoException the dao exception
     */
    void updateService(int id,
                       String serviceName,
                       String description,
                       BigDecimal price,
                       int duration,
                       List<Feedback> feedbackList) throws DaoException;


    /**
     * Find service by id optional.
     *
     * @param id the id
     * @return the optional
     * @throws DaoException the dao exception
     */
    Optional<Service> findServiceById(int id) throws DaoException;


    /**
     * Find service by name optional.
     *
     * @param serviceName the service name
     * @return the optional
     * @throws DaoException the dao exception
     */
    Optional<Service> findServiceByName(String serviceName) throws DaoException;


    /**
     * Find all list.
     *
     * @return the list
     * @throws DaoException the dao exception
     */
    List<Service> findAll() throws DaoException;



    /**
     * Remove service by id.
     *
     * @param serviceId the service id
     * @throws DaoException the dao exception
     */
    void removeServiceById(int serviceId) throws DaoException;
}
