package com.training.app.model.dao.mapper;

import com.training.app.model.entity.Card;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * @author besko
 */
public class CardMapper implements ObjectMapper<Card> {
    /**
     * Extract from result set t.
     *
     * @param resultSet the result set
     * @return the t
     * @throws SQLException the sql exception
     */
    @Override
    public Card extractFromResultSet(ResultSet resultSet) throws SQLException {
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
    public Card makeUnique(Map<Integer, Card> cache, Card object) {
        return null;
    }
}
