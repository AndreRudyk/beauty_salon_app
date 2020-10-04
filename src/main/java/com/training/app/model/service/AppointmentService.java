package com.training.app.model.service;

import com.training.app.model.entity.Appointment;
import com.training.app.model.dao.AppointmentDAO;
import com.training.app.model.dao.DaoException;
import com.training.app.model.dao.DaoFactory;
import com.training.app.model.entity.Service;
import com.training.app.model.entity.User;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @author besko
 */
public class AppointmentService implements AppointmentDAO {
    DaoFactory daoFactory = DaoFactory.getInstance();

    public Appointment findById(int id) throws DaoException {
        AppointmentDAO appointmentDAO = null;
        try {
            appointmentDAO = daoFactory.createAppointmentDao();
        } catch (
                Exception e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(appointmentDAO).findAppointmentById(id);
    }

    /**
     * Add appointment.
     *
     * @param appointment the appointment
     * @throws DaoException the dao exception
     */
    @Override
    public Appointment createAppointment(Appointment appointment) throws DaoException {
            AppointmentDAO appointmentDAO = null;
            try {
                appointmentDAO = daoFactory.createAppointmentDao();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return Objects.requireNonNull(appointmentDAO).createAppointment(appointment);
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
    public void updateAppointment(int id, LocalDateTime dateTime, BigDecimal price, BigDecimal paid, Appointment.Status status, List<User> users, List<Service> services) throws DaoException {

    }

    /**
     * Find appointment by id optional.
     *
     * @param id the id
     * @return the optional
     * @throws DaoException the dao exception
     */
    @Override
    public Appointment findAppointmentById(int id) throws DaoException {
        AppointmentDAO appointmentDAO = null;
        try {
            appointmentDAO = daoFactory.createAppointmentDao();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(appointmentDAO).findAppointmentById(id);
    }

    /**
     * Find appointment by status optional.
     *
     * @param status the status
     * @return the optional
     * @throws DaoException the dao exception
     */
    @Override
    public Appointment findAppointmentByStatus(Appointment.Status status) throws DaoException, SQLException {
        return null;
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
    public List<User> findByUserIdAndDay(int userId, LocalDateTime dateTime) throws DaoException {
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
    public Appointment findByUserId(int userId) throws DaoException {
        return null;
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
        return new ArrayList<>();
    }

    /**
     * Find all list.
     *
     * @return the list
     * @throws DaoException the dao exception
     */
    @Override
    public List<Appointment> findAll() throws DaoException {
        AppointmentDAO appointmentDAO = null;
        try {
            appointmentDAO = daoFactory.createAppointmentDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointmentDAO.findAll();
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

    @Override
    public void updateService(Service service) throws DaoException {

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
}


