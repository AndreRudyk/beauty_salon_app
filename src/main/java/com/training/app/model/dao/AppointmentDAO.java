package com.training.app.model.dao;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.Service;
import com.training.app.model.entity.User;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

/**
 * The interface Appointment dao.
 * @author besko
 */
public interface AppointmentDAO extends GenericDAO<Appointment> {

    /**
     * Create appointment.
     *
     * @param appointment the appointment
     * @throws DaoException the dao exception
     */
    void createAppointment(Appointment appointment) throws DaoException;

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
    void updateAppointment(int id,
                           LocalDateTime dateTime,
                           BigDecimal price,
                           BigDecimal paid,
                           Appointment.Status status,
                           List<User> users,
                           List<Service> services) throws DaoException;

    /**
     * Find appointment by id appointment.
     *
     * @param id the id
     * @return the appointment
     * @throws DaoException the dao exception
     */
    Appointment findAppointmentById(int id) throws DaoException;

    /**
     * Find appointment by status appointment.
     *
     * @param status the status
     * @return the appointment
     * @throws DaoException the dao exception
     * @throws SQLException the sql exception
     */
    Appointment findAppointmentByStatus(Appointment.Status status) throws DaoException, SQLException;

    /**
     * Find all by status list.
     *
     * @param status the status
     * @return the list
     * @throws DaoException the dao exception
     */
    List<Appointment> findAllByStatus(Appointment.Status status) throws DaoException;

    /**
     * Find all available list.
     *
     * @return the list
     * @throws DaoException the dao exception
     */
    List<Appointment> findAllAvailable() throws DaoException;

    /**
     * Find by user id and day list.
     *
     * @param userId   the user id
     * @param dateTime the date time
     * @return the list
     * @throws DaoException the dao exception
     */
    List<User> findByUserIdAndDay(int userId, LocalDateTime dateTime) throws DaoException;

    /**
     * Find by user id appointment.
     *
     * @param userId the user id
     * @return the appointment
     * @throws DaoException the dao exception
     */
    Appointment findByUserId(int userId) throws DaoException;

    /**
     * Find by service id list.
     *
     * @param orderId the order id
     * @return the list
     * @throws DaoException the dao exception
     */
    List<Appointment> findByServiceId(int orderId) throws DaoException;


    /**
     * Find all list.
     *
     * @return the list
     * @throws DaoException the dao exception
     */
    List<Appointment> findAll() throws DaoException;

    /**
     * Update status.
     *
     * @param status the status
     * @throws DaoException the dao exception
     */
    void updateStatus(Appointment.Status status) throws DaoException;

    /**
     * Update time slot.
     *
     * @param localDateTime the local date time
     * @throws DaoException the dao exception
     */
    void updateTimeSlot(LocalDateTime localDateTime) throws DaoException;

    /**
     * Update user.
     *
     * @param user the user
     * @throws DaoException the dao exception
     */
    void updateUser(User user) throws DaoException;

    /**
     * Cancel appointment.
     *
     * @param id the id
     * @throws DaoException the dao exception
     */
    void cancelAppointment(int id) throws DaoException;

    /**
     * Remove old appointments.
     *
     * @throws DaoException the dao exception
     */
    void removeOldAppointments() throws DaoException;

    /**
     * Remove appointment by id.
     *
     * @param id the id
     * @throws DaoException the dao exception
     */
    void removeAppointmentById(int id) throws DaoException;


}
