package com.training.app.model.entity.dao.impl;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.Service;
import com.training.app.model.entity.User;
import com.training.app.model.entity.dao.AppointmentDAO;
import com.training.app.model.entity.dao.DaoException;
import com.training.app.model.entity.dao.DaoFctory;
import com.training.app.model.entity.dao.mapper.AppointmentMapper;
import com.training.app.model.entity.dao.mapper.UserMapper;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @author besko
 */
public class AppointmentDaoImpl implements AppointmentDAO {
    private Connection connection;

    public AppointmentDaoImpl(Connection connection) {
        this.connection = connection;
    }
    /**
     * Add appointment.
     *
     * @param appointment the appointment
     * @throws DaoException the dao exception
     */
    @Override
    public void createAppointment(Appointment appointment) throws DaoException {

    }

    /**
     * Update appointment.
     *
     * @param id       the id
     * @param dateTime the date time
     * @param price    the price
     * @param paid     the paid
     * @param status   the status
     * @param users    the users
     * @param services the services
     * @throws DaoException the dao exception
     */
    @Override
    public void updateAppointment(int id,
                                  LocalDateTime dateTime,
                                  BigDecimal price,
                                  BigDecimal paid,
                                  Appointment.Status status,
                                  List<User> users,
                                  List<Service> services) throws DaoException {

    }

    /**
     * Find appointment by id optional.
     *
     * @param id the id
     * @return the optional
     * @throws DaoException the dao exception
     */
    @Override
    public Optional<Appointment> findAppointmentById(int id) throws DaoException {
        return Optional.empty();
    }


    /**
     * Find appointment by status optional.
     *
     * @param status the status
     * @return the optional
     * @throws DaoException the dao exception
     */
    @Override
    public Optional<Appointment> findAppointmentByStatus(Appointment.Status status) throws DaoException, SQLException {
        return Optional.empty();
    }

    /**
     * Find all by status list.
     *
     * @param status the status
     * @return the list
     * @throws DaoException the dao exception
     */
    @Override
    public List<Appointment> findAllByStatus(Appointment.Status status) throws DaoException {
        return null;
    }

    /**
     * Find all available list.
     *
     * @return the list
     * @throws DaoException the dao exception
     */
    @Override
    public List<Appointment> findAllAvailable() throws DaoException {
        return null;
    }

    /**
     * Find by user id and day list.
     *
     * @param userId   the user id
     * @param dateTime the date time
     * @return the list
     * @throws DaoException the dao exception
     */
    @Override
    public List<Appointment> findByUserIdAndDay(int userId, LocalDateTime dateTime) throws DaoException {
        return null;
    }

    /**
     * Find by user id optional.
     *
     * @param userId the user id
     * @return the optional
     * @throws DaoException the dao exception
     */
    @Override
    public Optional<Appointment> findByUserId(int userId) throws DaoException {
        return Optional.empty();
    }

    /**
     * Find by service id list.
     *
     * @param orderId the order id
     * @return the list
     * @throws DaoException the dao exception
     */
    @Override
    public List<Appointment> findByServiceId(int orderId) throws DaoException {
        return null;
    }

    /**
     * Find all list.
     *
     * @return the list
     * @throws DaoException the dao exception
     */
    @Override
    public List<Appointment> findAll() throws DaoException {
        Map<Integer, User> users = new HashMap<>();
        Map<Integer, Appointment> appointments = new HashMap<>();
        final String query = "" +
                " select * from appointment" +
                " left join appointment_has_user on " +
                " appointment.id = appointment_has_user.appointment_id "+
                " left join user on appointment_has_user.user_id = " +
                " user.id";

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
            return new ArrayList<>(appointments.values());
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Update status.
     *
     * @param status the status
     * @throws DaoException the dao exception
     */
    @Override
    public void updateStatus(Appointment.Status status) throws DaoException {

    }

    /**
     * Update time slot.
     *
     * @param localDateTime the local date time
     * @throws DaoException the dao exception
     */
    @Override
    public void updateTimeSlot(LocalDateTime localDateTime) throws DaoException {

    }

    /**
     * Update user.
     *
     * @param user the user
     * @throws DaoException the dao exception
     */
    @Override
    public void updateUser(User user) throws DaoException {

    }

    /**
     * Cancel appointment.
     *
     * @param id the id
     * @throws DaoException the dao exception
     */
    @Override
    public void cancelAppointment(int id) throws DaoException {

    }

    /**
     * Remove old appointments.
     *
     * @throws DaoException the dao exception
     */
    @Override
    public void removeOldAppointments() throws DaoException {

    }

    /**
     * Remove appointment by id.
     *
     * @param id the id
     * @throws DaoException the dao exception
     */
    @Override
    public void removeAppointmentById(int id) throws DaoException {

    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
