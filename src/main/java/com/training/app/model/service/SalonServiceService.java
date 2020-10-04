package com.training.app.model.service;

import com.training.app.model.dao.DaoException;
import com.training.app.model.dao.DaoFactory;
import com.training.app.model.dao.ServiceDAO;
import com.training.app.model.entity.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

/**
 * @author besko
 */
public class SalonServiceService implements ServiceDAO {

    DaoFactory daoFactory = DaoFactory.getInstance();

    /**
     * Create appointment.
     *
     * @param service the service
     * @throws DaoException the dao exception
     */
    @Override
    public Service createService(Service service) throws DaoException {
        ServiceDAO serviceDAO = null;
        try {
            serviceDAO = daoFactory.createServiceDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(serviceDAO).createService(service);

    }

    @Override
    public Service updateService(int serviceId, Service service) throws DaoException {
        ServiceDAO serviceDAO = null;
        try {
            serviceDAO = daoFactory.createServiceDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(serviceDAO).updateService(serviceId, service);
    }

    /**
     * Find service by id optional.
     *
     * @param id the id
     * @return the optional
     * @throws DaoException the dao exception
     */
    @Override
    public Service findServiceById(int id) throws DaoException {
        ServiceDAO serviceDAO = null;
        try {
            serviceDAO = daoFactory.createServiceDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(serviceDAO).findServiceById(id);
    }

    /**
     * Find service by name optional.
     *
     * @param serviceName the service name
     * @return the optional
     * @throws DaoException the dao exception
     */
    @Override
    public Service findServiceByName(String serviceName) throws DaoException {
        ServiceDAO serviceDAO = null;
        try {
            serviceDAO = daoFactory.createServiceDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(serviceDAO).findServiceByName(serviceName);
    }

    /**
     * Find all list.
     *
     * @return the list
     * @throws DaoException the dao exception
     */
    @Override
    public List<Service> findAll() throws DaoException {
        ServiceDAO serviceDAO = null;
        try {
            serviceDAO = daoFactory.createServiceDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(serviceDAO).findAll();
    }

    /**
     * Remove service by id.
     *
     * @param serviceId the service id
     * @throws DaoException the dao exception
     * @return s
     */
    @Override
    public Service removeServiceById(int serviceId) throws DaoException {
        ServiceDAO serviceDAO = null;
        try {
            serviceDAO = daoFactory.createServiceDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(serviceDAO).removeServiceById(serviceId);
    }
}
