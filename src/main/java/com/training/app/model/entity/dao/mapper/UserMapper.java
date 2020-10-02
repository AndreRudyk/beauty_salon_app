package com.training.app.model.entity.dao.mapper;

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
        User user = User.newUserBuilder().
                setId(resultSet.getInt("id")).
                setLogin(resultSet.getString("login_email")).
                setPassword(resultSet.getString("password_hash")).
                setFirstName(resultSet.getString("first_name")).
                setLastName(resultSet.getString("last_name")).
                setPhoneNumber(resultSet.getString("phone_number")).
                setUserRole(User.Role.valueOf(resultSet.getString("user_role"))).
                setRating(User.Rating.valueOf(resultSet.getString("rating"))).
                build();
        return user;
    }

    @Override
    public User makeUnique(Map<Integer, User> cache, User user) {
        cache.putIfAbsent(user.getId(), user);
        return cache.get(user.getId());
    }
}
