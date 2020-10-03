package com.training.app.model.service;

import com.training.app.model.entity.User;
import com.training.app.model.dao.DaoException;
import com.training.app.model.dao.DaoFactory;
import com.training.app.model.dao.UserDAO;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class UserService {

    DaoFactory daoFactory = DaoFactory.getInstance();

    public List<User> getAll() throws SQLException, DaoException {
        UserDAO userDAO = null;
        try {
            userDAO = daoFactory.createUserDao();

        }catch (Exception e) {
            e.printStackTrace();
        }
        return userDAO.findAllUsers();
    }

    public Optional<User> findByName(String name) throws SQLException, DaoException {
        UserDAO userDAO = null;
        try {
            userDAO = daoFactory.createUserDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userDAO.findByName(name);
    }
}
