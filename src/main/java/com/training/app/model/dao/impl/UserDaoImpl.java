package com.training.app.model.dao.impl;

import com.training.app.model.dao.UserDAO;
import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.User;
import com.training.app.model.dao.DaoException;
import com.training.app.model.dao.mapper.AppointmentMapper;
import com.training.app.model.dao.mapper.UserMapper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 * @author besko
 */
public class UserDaoImpl implements UserDAO {
    private Connection connection;

    public UserDaoImpl(Connection connection) {
        this.connection = connection;
    }

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
    public Optional<User> findByName(String name) throws DaoException {
        return Optional.empty();
    }

    @Override
    public List<User> findByRating(User.Rating rating) throws DaoException {
        return null;
    }

    @Override
    public List<User> findAllUsers() throws DaoException {
        Map<Integer, User> users = new HashMap<>();
        Map<Integer, Appointment> appointments = new HashMap<>();
        final String query = "" +
                " select * from user" +
                " left join appointment_has_user on " +
                " user.id = appointment_has_user.user_id "+
                " left join appointment on appointment_has_user.appointment_id = " +
                " appointment.id";

        try (Statement st = connection.createStatement()) {
            ResultSet resultSet = st.executeQuery(query);

            UserMapper userMapper = new UserMapper();
            AppointmentMapper appointmentMapper = new AppointmentMapper();

            while (resultSet.next()) {
                User user = userMapper.extractFromResultSet(resultSet);
                Appointment appointment = appointmentMapper.extractFromResultSet(resultSet);

                user = userMapper.makeUnique(users,user);
                appointment = appointmentMapper.makeUnique(appointments,appointment);
            }
            return new ArrayList<>(users.values());
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
    public void updateUser(int id,
                           String login,
                           String password,
                           String fName,
                           String lName,
                           String phone,
                           User.Role role,
                           User.Rating rating,
                           Set<String> cards,
                           List<Appointment> appointments) throws DaoException {

    }

    @Override
    public void updateRating(User.Rating rating) throws DaoException {

    }

    @Override
    public void removeUser(int userId) throws DaoException {

    }

    public void close() throws DaoException {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }
}

