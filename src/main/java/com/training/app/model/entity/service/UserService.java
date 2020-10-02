package com.training.app.model.entity.service;

import com.training.app.model.entity.User;
import com.training.app.model.entity.dao.DaoException;
import com.training.app.model.entity.dao.DaoFctory;
import com.training.app.model.entity.dao.UserDAO;

import java.sql.SQLException;
import java.util.List;

public class UserService {

    DaoFctory daoFctory = DaoFctory.getInstance();

    public List<User> getAll() throws SQLException, DaoException {
        UserDAO userDAO = null;
        try {
            userDAO = daoFctory.createUserDao();

        }catch (Exception e) {
            e.printStackTrace();
        }
        return userDAO.findAllUsers();
    }
}
