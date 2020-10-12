package com.training.app.model.dao.impl;

import com.training.app.model.dao.UserDAO;
import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.Card;
import com.training.app.model.entity.User;
import com.training.app.model.dao.DaoException;
import com.training.app.model.dao.mapper.UserMapper;
import org.apache.tomcat.jdbc.pool.ProxyConnection;

import java.sql.*;
import java.util.*;

/**
 * @author besko
 */
public class UserDaoImpl implements UserDAO, AutoCloseable {

    private static final String CREATE_USER = " INSERT INTO user" +
            " (login_email, password_hash, first_name, last_name, " +
            " phone_number, user_role, rating) VALUES " +
            " (?, ?, ?, ?, ?, ?, ?); ";

    private static final String FIND_BY_ID = " SELECT * FROM user" +
            " where id = ? ";

    private static final String FIND_BY_LOGIN = " SELECT * FROM user" +
            " where login_email = ? ";

    private static final String FIND_BY_NAME = " SELECT * FROM user WHERE first_name = ? ";

    private static final String FIND_BY_RATING = " SELECT * FROM user WHERE rating = ? ";

    private static final String FIND_ALL = " SELECT * FROM user ";

    private static final String UPDATE_USER = "UPDATE user SET login_email = ?, " +
            " password_hash = ?, first_name = ?, last_name = ?, phone_number = ?, " +
            " user_role = ?, rating = ? WHERE id = ? ";

    private static final String REMOVE = "DELETE FROM user WHERE id = ?" ;

    private final Connection connection;

    public UserDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public User registerUser(User user) throws DaoException {
        try (PreparedStatement preparedStatement = connection.
                prepareStatement(CREATE_USER)) {
            setUserParameters(user, preparedStatement);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User findById(int id) throws DaoException {
        Optional<User> optionalUser = Optional.empty();
        try (PreparedStatement preparedStatement = connection.
                prepareCall(FIND_BY_ID)) {
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
        Optional<User> optionalUser1 = Optional.empty();
        try (PreparedStatement preparedStatement = connection.
                prepareCall(FIND_BY_LOGIN)) {
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
                prepareCall(FIND_BY_NAME)) {
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
                prepareStatement(FIND_BY_RATING)) {
            preparedStatementId.setInt(1, rating);

            return getUserListExecute(usersByRating, preparedStatementId);
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    @Override
    public List<User> findAllUsers() throws DaoException {
        List<User> users = new ArrayList<>();

        try (PreparedStatement preparedStatement = connection.
                prepareStatement(FIND_ALL)) {
            return getUserListExecute(users, preparedStatement);
        } catch (SQLException e) {
            throw new DaoException(e);
        }
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
    public boolean updateUser(int userId, User user) throws DaoException {
        try (PreparedStatement preparedStatement = connection.
                prepareStatement(UPDATE_USER)){
            setUserParameters(user, preparedStatement);

            preparedStatement.setInt(8, userId);

            int rowUpdated = preparedStatement.executeUpdate();

            if (rowUpdated == 7) {
                return true;
            }

        } catch (SQLException e) {
            throw new DaoException(e);
        }
        return false;
    }



    @Override
    public boolean removeUserById(int userId) throws DaoException {
        try (PreparedStatement preparedStatement = connection.
                prepareStatement(REMOVE)){

            preparedStatement.setInt(1, userId);
            int rowDeleted = preparedStatement.executeUpdate();

            if (rowDeleted > 0) {
                return true;
            }

        } catch (SQLException e) {
            throw new DaoException(e);
        }
        return false;
    }

    @Override
    public void close() throws DaoException {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }


    private void setUserParameters(User user, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(1, user.getLogin());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3, user.getFirstName());
        preparedStatement.setString(4, user.getLastName());
        preparedStatement.setString(5, user.getPhoneNumber());
        preparedStatement.setString(6, user.getUserRole().getRoleName());
        preparedStatement.setBigDecimal(7, user.getRating());
    }

    private List<User> getUserListExecute(List<User> users, PreparedStatement preparedStatement) throws SQLException {
        ResultSet resultSet1 = preparedStatement.executeQuery();

        UserMapper userMapper = new UserMapper();

        while (resultSet1.next()) {
            Optional<User> user = Optional.
                    ofNullable(userMapper.extractFromResultSet(resultSet1));
            user.ifPresent(users::add);
        }
        return users;
    }
}

