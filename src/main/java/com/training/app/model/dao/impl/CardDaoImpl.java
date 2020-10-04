package com.training.app.model.dao.impl;

import com.training.app.model.dao.CardDao;
import com.training.app.model.dao.DaoException;
import com.training.app.model.dao.mapper.CardMapper;
import com.training.app.model.entity.Card;
import com.training.app.model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

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
        Optional<Card> optionalCard = Optional.empty();
        try(PreparedStatement preparedStatement = connection.
                prepareStatement("select * from card where number_id = ?")) {

            preparedStatement.setString(1, number);
            ResultSet resultSet = preparedStatement.executeQuery();

            CardMapper cardMapper = new CardMapper();
            if (resultSet.next()) {
                optionalCard = Optional.ofNullable(cardMapper.extractFromResultSet(resultSet));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return optionalCard.orElse(new Card());
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
    public Card removeCardById(int id) throws DaoException {
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
