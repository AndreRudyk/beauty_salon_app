package com.training.app.model.dao.mapper;

import com.training.app.model.entity.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

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
        return null;
    }

    /**
     * Make unique t.
     *
     * @param cache  the cache
     * @param object the object
     * @return the t
     */
    @Override
    public Service makeUnique(Map<Integer, Service> cache, Service object) {
        return null;
    }
}
