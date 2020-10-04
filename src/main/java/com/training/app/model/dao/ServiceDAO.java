package com.training.app.model.dao;

import com.training.app.model.entity.Service;

import java.util.List;

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
    Service createService(Service service) throws DaoException;


    Service updateService(Service service) throws DaoException;


    /**
     * Find service by id optional.
     *
     * @param id the id
     * @return the optional
     * @throws DaoException the dao exception
     */
    Service findServiceById(int id) throws DaoException;


    /**
     * Find service by name optional.
     *
     * @param serviceName the service name
     * @return the optional
     * @throws DaoException the dao exception
     */
    Service findServiceByName(String serviceName) throws DaoException;


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
     * @return
     */
    Service removeService(int serviceId) throws DaoException;
}
