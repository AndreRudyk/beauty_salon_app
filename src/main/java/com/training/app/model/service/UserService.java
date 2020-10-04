package com.training.app.model.service;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.Card;
import com.training.app.model.entity.User;
import com.training.app.model.dao.DaoException;
import com.training.app.model.dao.DaoFactory;
import com.training.app.model.dao.UserDAO;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * The type User service.
 *
 * @author besko
 */
public class UserService implements UserDAO {

    /**
     * The Dao factory.
     */
    DaoFactory daoFactory = DaoFactory.getInstance();

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
        return Objects.requireNonNull(userDAO).registerUser(user);
    }

    @Override
    public User findById(int id) throws DaoException {
        UserDAO userDAO = null;
        try {
            userDAO = daoFactory.createUserDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(userDAO).findById(id);
    }

    @Override
    public User findByLogin(String login) throws DaoException {
        return null;
    }

    @Override
    public List<User> findAllUsers() throws DaoException {
        UserDAO userDAO = null;
        try {
            userDAO = daoFactory.createUserDao();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(userDAO).findAllUsers();
    }

    @Override
    public User findByName(String name) throws SQLException, DaoException {
        UserDAO userDAO = null;
        try {
            userDAO = daoFactory.createUserDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(userDAO).findByName(name);
    }

    @Override
    public List<User> findByRating(int rating) throws DaoException {
        UserDAO userDAO = null;
        try {
            userDAO = daoFactory.createUserDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(userDAO).findByRating(rating);
    }

    @Override
    public Set<Card> findAllCards() throws DaoException {
        return null;
    }

    @Override
    public List<Appointment> findAllAppointments() {
        return null;
    }

    @Override
    public void updateUser(int userId, User user) throws DaoException {

    }

    @Override
    public void removeUserById(int userId) throws DaoException {

    }


}
