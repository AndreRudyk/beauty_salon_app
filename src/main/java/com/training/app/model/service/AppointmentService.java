package com.training.app.model.service;

import com.training.app.model.dao.AppointmentDAO;
import com.training.app.model.dao.DaoException;
import com.training.app.model.dao.DaoFactory;
import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.User;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The type Appointment service.
 * @author besko
 */
public class AppointmentService implements AppointmentDAO {
    /**
     * The Dao factory.
     */
    DaoFactory daoFactory = DaoFactory.getInstance();

    /**
     * Find by id appointment.
     *
     * @param id the id
     * @return the appointment
     * @throws DaoException the dao exception
     */
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

    @Override
    public void updateAppointment(int appointmentId, Appointment appointment) throws DaoException {

    }

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
        return new ArrayList<>();
    }

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


    @Override
    public void cancelAppointment(int id) throws DaoException {

    }

    @Override
    public void removeOldAppointments(List<Appointment> oldAppointments) throws DaoException {

    }


    @Override
    public void removeAppointmentById(int id) throws DaoException {

    }
}


