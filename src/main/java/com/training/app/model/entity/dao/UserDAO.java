package com.training.app.model.entity.dao;

import com.training.app.model.entity.Appointment;
import com.training.app.model.entity.Card;
import com.training.app.model.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * The interface User dao.
 *
 * @author besko
 */
public interface UserDAO extends GenericDAO<User> {

    /**
     * Find by id optional.
     *
     * @param id the id
     * @return the optional
     */
    Optional<User> findById(int id);

    /**
     * Find by name optional.
     *
     * @param name the name
     * @return the optional
     */
    Optional<User> findByName(String name);

    /**
     * Find all cards set.
     *
     * @return the set
     */
    Set<Card> findAllCards();

    /**
     * Find all appointments list.
     *
     * @return the list
     */
    List<Appointment> findAllAppointments();

}
