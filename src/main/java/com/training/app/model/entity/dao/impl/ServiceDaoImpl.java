package com.training.app.model.entity.dao.impl;

import com.training.app.model.entity.Feedback;
import com.training.app.model.entity.Service;
import com.training.app.model.entity.dao.DaoException;
import com.training.app.model.entity.dao.ServiceDAO;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ServiceDaoImpl implements ServiceDAO {
    private Connection connection;

    public ServiceDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void createService(Service service) throws DaoException {

    }

    @Override
    public void updateService(int id, String serviceName, String description, BigDecimal price, int duration, List<Feedback> feedbackList) throws DaoException {

    }

    @Override
    public Optional<Service> findServiceById(int id) throws DaoException {
        return Optional.empty();
    }

    @Override
    public Optional<Service> findServiceByName(String serviceName) throws DaoException {
        return Optional.empty();
    }

    @Override
    public List<Service> findAll() throws DaoException {
        return null;
    }

    @Override
    public void removeServiceById(int serviceId) throws DaoException {

    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
