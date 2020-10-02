package com.training.app.model.entity.service;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.dao.AppointmentDAO;
import com.training.app.model.entity.dao.DaoException;
import com.training.app.model.entity.dao.DaoFctory;
import com.training.app.model.entity.dao.UserDAO;

import java.util.List;
import java.util.Optional;

public class AppointmentService {
    DaoFctory daoFctory = DaoFctory.getInstance();

    public Optional<Appointment> getById(int id) {

        Optional<Appointment> result = Optional.empty();
        try {
            AppointmentDAO dao = daoFctory.createAppointmentDao();
            result = dao.findAppointmentById(1);
        } catch (
                Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Appointment> getAll() throws DaoException {
        AppointmentDAO appDAO = null;
        try {
            appDAO = daoFctory.createAppointmentDao();

        }catch (Exception e) {
            e.printStackTrace();
        }
        return appDAO.findAll();
    }
}


