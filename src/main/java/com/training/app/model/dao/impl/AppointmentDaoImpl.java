package com.training.app.model.dao.impl;

import com.training.app.model.dao.AppointmentDAO;
import com.training.app.model.dao.mapper.AppointmentMapper;
import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.Service;
import com.training.app.model.entity.User;
import com.training.app.model.dao.DaoException;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * The type Appointment dao.
 *
 * @author besko
 */
public class AppointmentDaoImpl implements AppointmentDAO, AutoCloseable {
    private final Connection connection;

    /**
     * Instantiates a new Appointment dao.
     *
     * @param connection the connection
     */
    public AppointmentDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Appointment createAppointment(Appointment appointment) throws DaoException {
        final String query = "" +
                " insert into appointment " +
                " (time, price, status, estimate) values " +
                " (? ,? ,?, ?); ";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setTimestamp(1, Timestamp.valueOf(appointment.getActionDateTime()));
            preparedStatement.setBigDecimal(2, appointment.getPrice());
            preparedStatement.setString(3, appointment.getStatus().getStatusName());
            preparedStatement.setInt(4, appointment.getEstimate());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointment;
    }

    @Override
    public Appointment findAppointmentById(int id) throws DaoException {
        final String query = "" +
                " select * from appointment " +
                " where id = ?";
        Optional<Appointment> optionalAppointment = Optional.empty();
        try (PreparedStatement preparedStatement = connection.prepareCall(query)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            AppointmentMapper appointmentMapper = new AppointmentMapper();
            if (resultSet.next()) {
                optionalAppointment = Optional.ofNullable(appointmentMapper.extractFromResultSet(resultSet));
            }
        } catch (SQLException e) {
            throw new DaoException(e);
        }
        return optionalAppointment.orElse(Appointment.newBuilder().build());
    }

    @Override
    public List<Appointment> findAllByStatus(Appointment.Status status) throws DaoException {
        return null;
    }

    @Override
    public List<Appointment> findAllAvailable() throws DaoException {
        return null;
    }

    @Override
    public List<User> findByUserIdAndDay(int userId, LocalDate dateTime) throws DaoException {
        return null;
    }

    @Override
    public Appointment findByUserId(int userId) throws DaoException {
        return null;
    }

    @Override
    public List<Appointment> findByServiceId(int orderId) throws DaoException {
        return null;
    }

    @Override
    public List<Appointment> findAll() throws DaoException {
        List<Appointment> appointments = new ArrayList<>();
        final String query = "" +
                " select * from appointment";


        try (Statement st = connection.createStatement()) {
            ResultSet resultSet = st.executeQuery(query);

            AppointmentMapper appointmentMapper = new AppointmentMapper();

            while (resultSet.next()) {
                Optional<Appointment> appointment = Optional.
                        ofNullable(appointmentMapper.extractFromResultSet(resultSet));

                appointment.ifPresent(appointments::add);
            }
            return appointments;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public void updateAppointment(Appointment appointment) throws DaoException {

    }

    @Override
    public void updateStatus(Appointment.Status status) throws DaoException {

    }

    @Override
    public void updateTimeSlot(LocalDateTime localDateTime) throws DaoException {

    }

    @Override
    public void updateUser(User user) throws DaoException {

    }

    @Override
    public void updateService(Service service) throws DaoException {

    }

    @Override
    public void cancelAppointment(int id) throws DaoException {

    }

    @Override
    public void removeOldAppointments(List<Appointment> oldAppointments) throws DaoException {

    }

    @Override
    public void removeAppointmentById(int id) throws DaoException {

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
