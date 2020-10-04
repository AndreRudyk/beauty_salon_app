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
            preparedStatement.setBigDecimal(7, user.getRating());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User findById(int id) throws DaoException {
        final String query = "" +
                " select * from user" +
                " where id = ?";
        Optional<User> optionalUser = Optional.empty();
        try (PreparedStatement preparedStatement = connection.
                prepareCall(query)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            UserMapper userMapper = new UserMapper();
            if (resultSet.next()) {
                optionalUser = Optional.ofNullable(userMapper.extractFromResultSet(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return optionalUser.orElse(User.newUserBuilder().build());
    }

    @Override
    public User findByLogin(String login) throws DaoException {
        final String query = "" +
                " select * from user" +
                " where login_email = ?";
        Optional<User> optionalUser1 = Optional.empty();
        try (PreparedStatement preparedStatement = connection.
                prepareCall(query)) {
            preparedStatement.setString(1, login);
            ResultSet resultSet;
            resultSet = preparedStatement.executeQuery();
            UserMapper userMapper = new UserMapper();
            if (resultSet.next()) {
                optionalUser1 = Optional.of(userMapper.extractFromResultSet(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return optionalUser1.orElse(User.newUserBuilder().build());
    }

    @Override
    public User findByName(String name) throws DaoException, SQLException {
        Optional<User> optionalUser = Optional.empty();
        try (PreparedStatement preparedStatement = connection.
                prepareCall("select * from user where first_name = ?")) {
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            UserMapper userMapper = new UserMapper();
            if (resultSet.next()) {
                optionalUser = Optional.ofNullable(userMapper.extractFromResultSet(resultSet));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            return optionalUser.orElse(User.newUserBuilder().build());
    }

    @Override
    public List<User> findByRating(int rating) throws DaoException {
        List<User> usersByRating = new ArrayList<>();

        try (PreparedStatement preparedStatementId = connection.
                prepareStatement("select * from user where rating = ?")) {
            preparedStatementId.setInt(1, rating);

            ResultSet resultSet = preparedStatementId.executeQuery();

            UserMapper userMapper = new UserMapper();

            while (resultSet.next()) {
                Optional<User> user = Optional.
                        ofNullable(userMapper.extractFromResultSet(resultSet));
                user.ifPresent(usersByRating::add);
            }
            return usersByRating;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    @Override
    public List<User> findAllUsers() throws DaoException {
        List<User> users = new ArrayList<>();
        final String query = "" +
                " select * from user";

        try (PreparedStatement preparedStatement = connection.
                prepareStatement(query)) {
            ResultSet resultSet1 = preparedStatement.executeQuery();

            UserMapper userMapper = new UserMapper();

            while (resultSet1.next()) {
                Optional<User> user = Optional.
                        ofNullable(userMapper.extractFromResultSet(resultSet1));
                user.ifPresent(users::add);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
        return users;
    }

    @Override
    public Set<Card> findAllCards() throws DaoException {
        return null;
    }

    @Override
    public List<Appointment> findAllAppointments() throws DaoException {
        return null;
    }

    @Override
    public void updateRole(int id, User.Role role) {

    }

    @Override
    public void updateUser(User user) throws DaoException {

    }

    @Override
    public void updateRating(int rating) throws DaoException {

    }

    @Override
    public void removeUserById(int userId) throws DaoException {

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

