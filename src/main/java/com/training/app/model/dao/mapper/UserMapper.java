package com.training.app.model.dao.mapper;

import com.training.app.model.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * The type User mapper.
 *
 * @author besko
 */
public class UserMapper implements ObjectMapper<User> {
    @Override
    public User extractFromResultSet(ResultSet resultSet) throws SQLException {
        return  User.newUserBuilder().
                setId(resultSet.getInt("id")).
                setLogin(resultSet.getString("login_email")).
                setPassword(resultSet.getString("password_hash")).
                setFirstName(resultSet.getString("first_name")).
                setLastName(resultSet.getString("last_name")).
                setPhoneNumber(resultSet.getString("phone_number")).
                setUserRole(User.Role.ADMIN).
                setRating(User.Rating.S3).
                build();
    }

    @Override
    public User makeUnique(Map<Integer, User> cache, User user) {
        cache.putIfAbsent(user.getId(), user);
        return cache.get(user.getId());
    }
}
