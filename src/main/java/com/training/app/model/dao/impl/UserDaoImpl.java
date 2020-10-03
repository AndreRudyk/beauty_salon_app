package com.training.app.model.dao.impl;

import com.training.app.model.dao.UserDAO;
import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.User;
import com.training.app.model.dao.DaoException;
import com.training.app.model.dao.mapper.AppointmentMapper;
import com.training.app.model.dao.mapper.UserMapper;

import java.sql.*;
import java.util.*;

/**
 * @author besko
 */
public class UserDaoImpl implements UserDAO, AutoCloseable {
    private final Connection connection;

    public UserDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public User registerUser(User user) throws DaoException {
        final String query = "" +
                " insert into user" +
                " (login_email, password_hash, first_name, last_name, " +
                " phone_number, user_role, rating) values " +
                " (?, ?, ?, ?, ?, ?, ?); ";
        try (PreparedStatement preparedStatement = connection.
                prepareStatement(query)) {
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());
            preparedStatement.setString(5, user.getPhoneNumber());
            preparedStatement.setString(6, user.getUserRole().getRoleName());
            preparedStatement.setString(7, user.getRating().getRate());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public Optional<User> findById(int id) throws DaoException {
        final String query = "" +
                " select * from user" +
                " where id = ?";
        Optional<User> optionalUser = Optional.empty();
        try (PreparedStatement preparedStatement = connection.
                prepareCall(query)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet;
            resultSet = preparedStatement.executeQuery();
            UserMapper userMapper = new UserMapper();
            if (resultSet.next()) {
                optionalUser = Optional.of(userMapper.extractFromResultSet(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return optionalUser;
    }

    @Override
    public Optional<User> findByLogin(String login) throws DaoException {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByName(String name) throws DaoException, SQLException {
        Optional<User> optionalUser = Optional.empty();
        try (PreparedStatement preparedStatement = connection.
                prepareCall("select * from user where first_name = ?")) {
            preparedStatement.setString(1, name);
            ResultSet resultSet;
            resultSet = preparedStatement.executeQuery();
            UserMapper userMapper = new UserMapper();
            if (resultSet.next()) {
                optionalUser = Optional.of(userMapper.extractFromResultSet(resultSet));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return optionalUser;
    }

    @Override
    public List<User> findByRating(User.Rating rating) throws DaoException {
        return null;
    }

    @Override
    public List<User> findAllUsers() throws DaoException {
        List<User> users = new ArrayList<>();
        final String query = "" +
                " select * from user";

        try (PreparedStatement preparedStatement = connection.
                prepareStatement(query) ) {
            ResultSet resultSet = preparedStatement.executeQuery(query);

            UserMapper userMapper = new UserMapper();

            while (resultSet.next()) {
                User user = userMapper.extractFromResultSet(resultSet);
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
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

    @Override
    public void updateUser(User user) throws DaoException {

    }

    @Override
    public void updateRating(User.Rating rating) throws DaoException {

    }

    @Override
    public void removeUser(int userId) throws DaoException {

    }

    @Override
    public void close() throws DaoException {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }
}

