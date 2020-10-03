package com.training.app.model.service;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.User;
import com.training.app.model.dao.DaoException;
import com.training.app.model.dao.DaoFactory;
import com.training.app.model.dao.UserDAO;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class UserService implements UserDAO{

    DaoFactory daoFactory = DaoFactory.getInstance();
    @Override
    public List<User> findAllUsers() throws DaoException {
        UserDAO userDAO = null;
        try {
            userDAO = daoFactory.createUserDao();

        }catch (Exception e) {
            e.printStackTrace();
        }
        return userDAO.findAllUsers();
    }
    @Override
    public Optional<User> findByName(String name) throws SQLException, DaoException {
        UserDAO userDAO = null;
        try {
            userDAO = daoFactory.createUserDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userDAO.findByName(name);
    }

    /**
     * Find all users list.
     *
     * @param rating the rating
     * @return the list
     * @throws DaoException the dao exception
     */
    @Override
    public List<User> findByRating(User.Rating rating) throws DaoException {
        return null;
    }

    /**
     * Find all users list.
     *
     * @return the list
     * @throws DaoException the dao exception
     */

    /**
     * Find all cards set.
     *
     * @return the set
     * @throws DaoException the dao exception
     */
    @Override
    public Set<String> findAllCards() throws DaoException {
        return null;
    }

    /**
     * Find all appointments list.
     *
     * @return the list
     */
    @Override
    public List<Appointment> findAllAppointments() {
        return null;
    }

    /**
     * Change role.
     *
     * @param id   the id
     * @param role the role
     */
    @Override
    public void changeRole(int id, User.Role role) {

    }

    /**
     * Update user.
     *
     * @param user
     */
    @Override
    public void updateUser(User user) throws DaoException {

    }

    /**
     * Update rating.
     *
     * @param rating the rating
     * @throws DaoException the dao exception
     */
    @Override
    public void updateRating(User.Rating rating) throws DaoException {

    }

    /**
     * Remove user.
     *
     * @param userId the user id
     * @throws DaoException the dao exception
     */
    @Override
    public void removeUser(int userId) throws DaoException {

    }

    /**
     * Register user user.
     *
     * @param user the user
     * @return the user
     * @throws DaoException the dao exception
     */
    @Override
    public User registerUser(User user) throws DaoException {
        UserDAO userDAO = null;
        try {
            userDAO = daoFactory.createUserDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userDAO.registerUser(user);
    }
    @Override
    public Optional<User> findById(int id) throws DaoException {
        UserDAO userDAO = null;
        try {
            userDAO = daoFactory.createUserDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userDAO.findById(id);
    }

    /**
     * Find by name optional.
     *
     * @param login the name
     * @return the optional
     * @throws DaoException the dao exception
     */
    @Override
    public Optional<User> findByLogin(String login) throws DaoException {
        return Optional.empty();
    }
}
