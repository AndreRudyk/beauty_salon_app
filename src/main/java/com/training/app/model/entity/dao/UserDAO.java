package com.training.app.model.entity.dao;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * The interface User dao.
 *
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
     * Find by id optional.
     *
     * @param id the id
     * @return the optional
     * @throws DaoException the dao exception
     */
    Optional<User> findById(int id) throws DaoException;

    /**
     * Find by name optional.
     *
     * @param login the name
     * @return the optional
     * @throws DaoException the dao exception
     */
    Optional<User> findByLogin(String login) throws DaoException;

    /**
     * Find by last name optional.
     *
     * @param lastName the last name
     * @return the optional
     * @throws DaoException the dao exception
     */
    Optional<User> findByLastName(String lastName) throws DaoException;

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
    Set<String> findAllCards() throws DaoException;

    /**
     * Find all appointments list.
     *
     * @return the list
     */
    List<Appointment> findAllAppointments();

    /**
     * Change role.
     *
     * @param id   the id
     * @param role the role
     */
    void changeRole(int id, User.Role role);

}
