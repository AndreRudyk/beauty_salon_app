package com.training.app.model.dao.impl;

import com.training.app.model.dao.CardDao;
import com.training.app.model.dao.DaoException;
import com.training.app.model.entity.Card;
import com.training.app.model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author besko
 */
public class CardDaoImpl implements CardDao, AutoCloseable {

    public final Connection connection;

    public CardDaoImpl(Connection connection) {
        this.connection = connection;
    }


    @Override
    public Card addCard(Card card, User user) throws DaoException {
        final String query = "" +
                " insert into card" +
                " (number_id, balance, user_id)" +
                " values (?, ?, ?); ";
        try (PreparedStatement preparedStatement = connection.
                prepareStatement(query)) {
            preparedStatement.setString(1, card.getCardNumber());
            preparedStatement.setBigDecimal(2, card.getBalance());
            preparedStatement.setInt(3, user.getId());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return card;
    }

    @Override
    public Card findByNumber(String number) throws DaoException {
        return null;
    }

    @Override
    public User findCardUser() throws DaoException {
        return null;
    }

    @Override
    public Card updateCard(Card card) throws DaoException {
        return null;
    }

    @Override
    public Card removeCard(int id) throws DaoException {
        return null;
    }

    @Override
    public void close() throws Exception {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }
}
