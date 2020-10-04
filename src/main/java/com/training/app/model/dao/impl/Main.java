package com.training.app.model.dao.impl;

import com.training.app.model.dao.UserDAO;
import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.Card;
import com.training.app.model.entity.Service;
import com.training.app.model.entity.User;
import com.training.app.model.dao.DaoException;
import com.training.app.model.service.AppointmentService;
import com.training.app.model.service.CardService;
import com.training.app.model.service.SalonServiceService;
import com.training.app.model.service.UserService;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) throws SQLException, DaoException {

        UserService userService = new UserService();


        /*User user1 = User.newUserBuilder().
                setLogin("u3245").
                setPassword("2332433").
                setFirstName("J22324").
                setLastName("D3").
                setPhoneNumber("33992211").
                setUserRole(User.Role.ADMIN).
                setRating(3).
                build();

        userService.registerUser(user1);
        User user = userService.findById(2);
        System.out.println(user);



        System.out.println("\n\n-------------------------------------------------------------\n\n");
        List<User> users1 = userService.findAllUsers();
        System.out.println(users1);


        *//*Card card = new Card();
        card.setCardNumber("1231023");
        card.setBalance(BigDecimal.valueOf(2543.23));*//*

        CardService cardService = new CardService();
       *//* cardService.addCard(card, user);*//*


        Service service = Service.newBuilder().
                setServiceName("Spa!").
                setPrice(BigDecimal.valueOf(45.00)).
                setDescription("Lolkek").
                setDurationMinutes(90).
                build();
        SalonServiceService serviceService = new SalonServiceService();
        serviceService.createService(service);

        System.out.println("\n\nservice list \n\n");
        List<Service> serviceList = serviceService.findAll();
        System.out.println(serviceList);


        List<User> users = userService.findByRating(5);
        System.out.println(users);

        List<User> users2 = userService.findAllUsers();
        System.out.println(users2);

        System.out.println("\n\ncard\n\n");
        Card card = cardService.findByNumber("1231023");
        System.out.println(card);*/

        Appointment appointment = Appointment.newBuilder().
                setActionDateTime(LocalDateTime.now()).
                setPrice(BigDecimal.valueOf(45.50)).
                setStatus(Appointment.Status.NEED).
                build();

        AppointmentService appointmentService = new AppointmentService();
        appointmentService.createAppointment(appointment);

        Appointment appointment1 = appointmentService.findAppointmentById(1);
        System.out.println("\n\n---------------appointment-----------------");
        System.out.println(appointment1);


    }
}
