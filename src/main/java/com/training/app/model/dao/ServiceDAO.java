package com.training.app.model.dao;

import com.training.app.model.entity.Service;

import java.util.List;

/**
 * The interface Service dao.
 * @author besko
 */
public interface ServiceDAO extends GenericDAO<Service> {
    /**
     * Create service service.
     *
     * @param service the service
     * @return the service
     * @throws DaoException the dao exception
     */
    Service createService(Service service) throws DaoException;


    /**
     * Update service service.
     *
     * @param service the service
     * @return the service
     * @throws DaoException the dao exception
     */
    Service updateService(Service service) throws DaoException;


    /**
     * Find service by id service.
     *
     * @param id the id
     * @return the service
     * @throws DaoException the dao exception
     */
    Service findServiceById(int id) throws DaoException;


    /**
     * Find service by name service.
     *
     * @param serviceName the service name
     * @return the service
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
     * Remove service service.
     *
     * @param serviceId the service id
     * @return the service
     * @throws DaoException the dao exception
     */
    Service removeServiceById(int serviceId) throws DaoException;
}
