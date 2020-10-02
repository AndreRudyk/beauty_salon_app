package com.training.app.model.entity.dao.impl;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.User;
import com.training.app.model.entity.dao.DaoException;
import com.training.app.model.entity.dao.UserDAO;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author besko
 */
public class UserDaoImpl implements UserDAO {

    @Override
    public User registerUser(User user) throws DaoException {
        return null;
    }

    @Override
    public Optional<User> findById(int id) throws DaoException {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByLogin(String login) throws DaoException {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByLastName(String lastName) throws DaoException {
        return Optional.empty();
    }

    @Override
    public List<User> findAllUsers() throws DaoException {
        return null;
    }

    @Override
    public Set<String> findAllCards() throws DaoException {
        return null;
    }

    @Override
    public List<Appointment> findAllAppointments() {
        return null;
    }

    @Override
    public void changeRole(int id, User.Role role) {

    }
}
