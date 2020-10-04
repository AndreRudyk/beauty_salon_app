package com.training.app.model.dao.impl;

import com.training.app.model.dao.ServiceDAO;
import com.training.app.model.dao.mapper.ServiceMapper;
import com.training.app.model.entity.Service;
import com.training.app.model.dao.DaoException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        List<Service> serviceList = new ArrayList<>();
        final String query = "" +
                " select * from service";

        try (PreparedStatement preparedStatement = connection.
                prepareStatement(query)){

            ResultSet resultSet = preparedStatement.executeQuery();

            ServiceMapper serviceMapper = new ServiceMapper();
            while (resultSet.next()) {
                Optional<Service> service = Optional.
                        ofNullable(serviceMapper.extractFromResultSet(resultSet));
                service.ifPresent(serviceList::add);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
        return serviceList;
    }

    @Override
    public Service removeServiceById(int serviceId) throws DaoException {
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
