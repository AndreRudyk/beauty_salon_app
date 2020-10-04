package com.training.app.model.service;

import com.training.app.model.dao.CardDao;
import com.training.app.model.dao.DaoException;
import com.training.app.model.dao.DaoFactory;
import com.training.app.model.entity.Card;
import com.training.app.model.entity.User;

import java.sql.SQLException;
import java.util.Objects;

/**
 * @author besko
 */
public class CardService implements CardDao {
    DaoFactory daoFactory = DaoFactory.getInstance();

    @Override
    public Card addCard(Card card, User user) throws DaoException {
        CardDao cardDao = null;
        try {
            cardDao = daoFactory.createCadDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(cardDao).addCard(card, user);
    }

    @Override
    public Card findByNumber(String number) throws DaoException {
        CardDao cardDao = null;
        try {
            cardDao = daoFactory.createCadDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(cardDao).findByNumber(number);
    }

    @Override
    public User findCardUser() throws DaoException {
        CardDao cardDao = null;
        try {
            cardDao = daoFactory.createCadDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(cardDao).findCardUser();
    }

    @Override
    public Card updateCard(Card card) throws DaoException {
        CardDao cardDao = null;
        try {
            cardDao = daoFactory.createCadDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(cardDao).updateCard(card);
    }

    @Override
    public Card removeCard(int id) throws DaoException {
        CardDao cardDao = null;
        try {
            cardDao = daoFactory.createCadDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(cardDao).removeCard(id);
    }
}
