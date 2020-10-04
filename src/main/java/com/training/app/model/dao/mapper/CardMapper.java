package com.training.app.model.dao.mapper;

import com.training.app.model.entity.Card;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
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
        Map<Integer, Card> cardMap = new HashMap<>();
        Card card = new Card();
        card.setCardNumber(resultSet.getString("number_id"));
        card.setBalance(resultSet.getBigDecimal("balance"));

        cardMap.put(Integer.parseInt(card.getCardNumber()), card);

        card = this.makeUnique(cardMap, card);
        return card;

    }

    /**
     * Make unique t.
     *
     * @param cache the cache
     * @param card  the object
     * @return the t
     */
    @Override
    public Card makeUnique(Map<Integer, Card> cache, Card card) {
        cache.putIfAbsent(Integer.parseInt(card.getCardNumber()), card);
        return cache.get(Integer.parseInt(card.getCardNumber()));
    }

}
