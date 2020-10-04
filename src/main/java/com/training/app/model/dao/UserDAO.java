package com.training.app.model.dao;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.Card;
import com.training.app.model.entity.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

/**
 * The interface User dao.
 * @author besko
 */
public interface UserDAO extends GenericDAO<User> {

    /**
     * Register user user.
     *
     * @param user the user
     * @return the user
     * @throws DaoException the dao exception
     */
    User registerUser(User user) throws DaoException;

    /**
     * Find by id user.
     *
     * @param id the id
     * @return the user
     * @throws DaoException the dao exception
     */
    User findById(int id) throws DaoException;

    User findByLogin(String login) throws DaoException;

    /**
     * Find by name user.
     *
     * @param name the name
     * @return the user
     * @throws DaoException the dao exception
     * @throws SQLException the sql exception
     */
    User findByName(String name) throws DaoException, SQLException;

    /**
     * Find by rating list.
     *
     * @param rating the rating
     * @return the list
     * @throws DaoException the dao exception
     */
    List<User> findByRating(int rating) throws DaoException;

    /**
     * Find all users list.
     *
     * @return the list
     * @throws DaoException the dao exception
     */
    List<User> findAllUsers() throws DaoException;

    /**
     * Find all cards set.
     *
     * @return the set
     * @throws DaoException the dao exception
     */
    Set<Card> findAllCards() throws DaoException;

    /**
     * Find all appointments list.
     *
     * @return the list
     * @throws DaoException the dao exception
     */
    List<Appointment> findAllAppointments() throws DaoException;

    /**
     * Update role.
     *
     * @param id   the id
     * @param role the role
     */
    void updateRole(int id, User.Role role);

    /**
     * Update user.
     *
     * @param user the user
     * @throws DaoException the dao exception
     */
    void updateUser(User user) throws DaoException;

    /**
     * Update rating.
     *
     * @param rating the rating
     * @throws DaoException the dao exception
     */
    void updateRating(int rating) throws DaoException;

    /**
     * Remove user by id.
     *
     * @param userId the user id
     * @throws DaoException the dao exception
     */
    void removeUserById(int userId) throws DaoException;

}
