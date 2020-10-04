package com.training.app.model.dao.impl;

import com.training.app.model.dao.UserDAO;
import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.User;
import com.training.app.model.dao.DaoException;
import com.training.app.model.service.AppointmentService;
import com.training.app.model.service.UserService;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) throws SQLException, DaoException {

        UserService userService = new UserService();
        /*AppointmentService appointmentService = new AppointmentService();
        List<User> users = userService.getAll();
        System.out.println(users);

        List<Appointment> appointments = appointmentService.getAll();
        System.out.println(appointments);*/

        /*Optional<User> user = userService.findById(1);
        System.out.println(user);*/

       /* User user1 = User.newUserBuilder().
                setLogin("u3245").
                setPassword("2332433").
                setFirstName("J22324").
                setLastName("D3").
                setPhoneNumber("33992211").
                setUserRole(User.Role.ADMIN).
                setRating(3).
                build();

        userService.registerUser(user1);*/
        Optional<User> users = userService.findByName("J22324");
        System.out.println(users);

        /*List<User> users = userService.findByRating(5);
        System.out.println(users);*/

        /*List<User> users = userService.findAllUsers();
        System.out.println(users);*/


    }
}
