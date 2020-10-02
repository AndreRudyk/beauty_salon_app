package com.training.app.model.entity.dao.impl;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.Card;
import com.training.app.model.entity.User;
import com.training.app.model.entity.dao.UserDAO;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class UserDaoImpl implements UserDAO {
    @Override
    public Optional<User> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Set<Card> findAllCards() {
        return null;
    }

    @Override
    public List<Appointment> findAllAppointments() {
        return null;
    }
}
