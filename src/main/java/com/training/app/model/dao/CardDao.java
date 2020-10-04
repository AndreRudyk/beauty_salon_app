package com.training.app.model.dao;

import com.training.app.model.entity.Card;
import com.training.app.model.entity.User;


/**
 * The interface Card dao.
 *
 * @author besko
 */
public interface CardDao extends GenericDAO<Card> {

    /**
     * Add card card.
     *
     * @param card the card
     * @param user the user
     * @return the card
     * @throws DaoException the dao exception
     */
    Card addCard(Card card, User user) throws DaoException ;

    /**
     * Find by number card.
     *
     * @param number the number
     * @return the card
     * @throws DaoException the dao exception
     */
    Card findByNumber(String number) throws DaoException;

    /**
     * Find card user user.
     *
     * @return the user
     * @throws DaoException the dao exception
     */
    User findCardUser() throws DaoException;

    /**
     * Update card.
     *
     * @param card the card
     * @throws DaoException the dao exception
     */
    Card updateCard(Card card) throws DaoException;

    /**
     * Remove card.
     *
     * @param id the id
     * @throws DaoException the dao exception
     */
    Card removeCard(int id) throws DaoException;

}
