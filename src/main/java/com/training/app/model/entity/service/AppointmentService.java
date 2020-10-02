package com.training.app.model.entity.service;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.dao.AppointmentDAO;
import com.training.app.model.entity.dao.DaoFctory;

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
}


