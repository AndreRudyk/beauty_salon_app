package com.training.app.model.dao;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.Service;
import com.training.app.model.entity.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * The interface Appointment dao.
 */
public interface AppointmentDAO extends GenericDAO<Appointment> {

    /**
     * Create appointment appointment.
     *
     * @param appointment the appointment
     * @return the appointment
     * @throws DaoException the dao exception
     */
    Appointment createAppointment(Appointment appointment) throws DaoException;

    /**
     * Find appointment by id appointment.
     *
     * @param id the id
     * @return the appointment
     * @throws DaoException the dao exception
     */
    Appointment findAppointmentById(int id) throws DaoException;

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
    List<User> findByUserIdAndDay(int userId, LocalDate dateTime) throws DaoException;

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
     * Update appointment.
     *
     * @param appointmentId the appointment id
     * @param appointment   the appointment
     * @throws DaoException the dao exception
     */
    void updateAppointment(int appointmentId, Appointment appointment) throws DaoException;

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
     * @param oldAppointments the old appointments
     * @throws DaoException the dao exception
     */
    void removeOldAppointments(List<Appointment> oldAppointments) throws DaoException;

    /**
     * Remove appointment by id.
     *
     * @param id the id
     * @throws DaoException the dao exception
     */
    void removeAppointmentById(int id) throws DaoException;


}
