package com.training.app.model.dao.mapper;

import com.training.app.model.entity.Feedback;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * @author besko
 */
public class FeedbackMapper implements ObjectMapper<Feedback> {
    /**
     * Extract from result set t.
     *
     * @param resultSet the result set
     * @return the t
     * @throws SQLException the sql exception
     */
    @Override
    public Feedback extractFromResultSet(ResultSet resultSet) throws SQLException {
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
    public Feedback makeUnique(Map<Integer, Feedback> cache, Feedback object) {
        return null;
    }
}
