package com.training.app.model.entity.dao.impl;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.User;
import com.training.app.model.entity.dao.DaoException;
import com.training.app.model.entity.service.AppointmentService;
import com.training.app.model.entity.service.UserService;

import java.sql.SQLException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws SQLException, DaoException {

        UserService userService = new UserService();
        AppointmentService appointmentService = new AppointmentService();
        List<User> users = userService.getAll();
        System.out.println(users);

        List<Appointment> appointments = appointmentService.getAll();
        System.out.println(appointments);

    }
}
