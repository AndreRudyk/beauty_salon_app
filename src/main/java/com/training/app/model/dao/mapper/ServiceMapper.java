package com.training.app.model.dao.mapper;

import com.training.app.model.entity.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author besko
 */
public class ServiceMapper implements ObjectMapper<Service> {
    /**
     * Extract from result set t.
     *
     * @param resultSet the result set
     * @return the t
     * @throws SQLException the sql exception
     */
    @Override
    public Service extractFromResultSet(ResultSet resultSet) throws SQLException {
        Map<Integer, Service> serviceMap = new HashMap<>();
        Service service = Service.newBuilder().
                setId(resultSet.getInt("id")).
                setServiceName(resultSet.getString("name")).
                setDescription(resultSet.getString("description")).
                setPrice(resultSet.getBigDecimal("price")).
                setDurationMinutes(resultSet.getInt("duration_minutes")).
                build();
        serviceMap.put(service.getId(), service);
        service = this.makeUnique(serviceMap, service);

        return service;

    }

    /**
     * Make unique t.
     *
     * @param cache   the cache
     * @param service the object
     * @return the t
     */
    @Override
    public Service makeUnique(Map<Integer, Service> cache, Service service) {
        cache.putIfAbsent(service.getId(), service);
        return cache.get(service.getId());
    }
}
