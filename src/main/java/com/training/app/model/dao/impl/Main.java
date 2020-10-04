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
        User user = userService.findById(2);
        System.out.println(user);



        System.out.println("\n\n-------------------------------------------------------------\n\n");
        List<User> users1 = userService.findAllUsers();
        System.out.println(users1);


        Card card = new Card();
        card.setCardNumber("12223");
        card.setBalance(BigDecimal.valueOf(2543.23));

        CardService cardService = new CardService();
        cardService.addCard(card, user);


        Service service = Service.newBuilder().
                setServiceName("Spa").
                setPrice(BigDecimal.valueOf(45.00)).
                setDescription("Lolkek").
                setDurationMinutes(90).
                build();

        SalonServiceService serviceService = new SalonServiceService();
        serviceService.createService(service);


        /*List<User> users = userService.findByRating(5);
        System.out.println(users);*/

        /*List<User> users = userService.findAllUsers();
        System.out.println(users);*/


    }
}
