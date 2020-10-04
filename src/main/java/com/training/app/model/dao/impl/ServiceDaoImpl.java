package com.training.app.model.dao.impl;

import com.training.app.model.dao.ServiceDAO;
import com.training.app.model.entity.Service;
import com.training.app.model.dao.DaoException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author besko
 */
public class ServiceDaoImpl implements ServiceDAO, AutoCloseable {
    private final Connection connection;

    public ServiceDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Service createService(Service service) throws DaoException {
       final String query = "" +
               " insert into service " +
               " (name, description, price, duration_minutes) " +
               " values (?, ?, ?, ?); ";
       try(PreparedStatement preparedStatement = connection.
               prepareStatement(query)) {

           preparedStatement.setString(1, service.getServiceName());
           preparedStatement.setString(2, service.getDescription());
           preparedStatement.setBigDecimal(3, service.getPrice());
           preparedStatement.setInt(4, service.getDurationMinutes());

           preparedStatement.executeUpdate();

       } catch (SQLException e) {
           e.printStackTrace();
       }
       return service;
    }

    @Override
    public Service updateService(Service service) throws DaoException {
        return service;
    }

    @Override
    public Service findServiceById(int id) throws DaoException {
        return null;
    }

    @Override
    public Service findServiceByName(String serviceName) throws DaoException {
        return null;
    }

    @Override
    public List<Service> findAll() throws DaoException {
        return null;
    }

    @Override
    public Service removeService(int serviceId) throws DaoException {
        return null;
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
