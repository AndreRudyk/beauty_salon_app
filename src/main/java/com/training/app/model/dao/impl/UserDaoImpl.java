package com.training.app.model.dao.impl;

import com.training.app.model.dao.UserDAO;
import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.Card;
import com.training.app.model.entity.User;
import com.training.app.model.dao.DaoException;
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
            preparedStatement.setInt(7, user.getRating());

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
            ResultSet resultSet = preparedStatement.executeQuery();
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
    public List<Optional<User>> findByRating(int rating) throws DaoException {
        List<Optional<User>> usersByRating = new ArrayList<>();


        try (PreparedStatement preparedStatementId = connection.
                prepareStatement("select * from user where rating = ?")) {
            preparedStatementId.setInt(1, rating);

            ResultSet resultSet = preparedStatementId.executeQuery();

            UserMapper userMapper = new UserMapper();

            while (resultSet.next()) {
                Optional<User> user = Optional.
                        ofNullable(userMapper.extractFromResultSet(resultSet));
                usersByRating.add(user);
            }
            return usersByRating;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    @Override
    public List<Optional<User>> findAllUsers() throws DaoException {
        List<Optional<User>> users = new ArrayList<>();
        final String query = "" +
                " select * from user";

        try (PreparedStatement preparedStatement = connection.
                prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery(query);

            UserMapper userMapper = new UserMapper();

            while (resultSet.next()) {
                User user = userMapper.extractFromResultSet(resultSet);
                users.add(Optional.ofNullable(user));
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public Set<Optional<Card>> findAllCards() throws DaoException {
        return null;
    }

    @Override
    public List<Optional<Appointment>> findAllAppointments() throws DaoException {
        return null;
    }

    @Override
    public void changeRole(int id, User.Role role) {

    }

    @Override
    public void updateUser(User user) throws DaoException {

    }

    @Override
    public void updateRating(int rating) throws DaoException {

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

