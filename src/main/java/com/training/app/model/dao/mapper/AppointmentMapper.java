package com.training.app.model.dao.mapper;

import com.training.app.model.entity.Appointment;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

/**
 * The type Appointment mapper.
 *
 * @author besko
 */
public class AppointmentMapper implements ObjectMapper<Appointment> {
    @Override
    public Appointment extractFromResultSet(ResultSet resultSet) throws SQLException {
        Date date = resultSet.getDate("time");
        Timestamp timestamp = new Timestamp(date.getTime());
        Appointment appointment = Appointment.newBuilder().
                setId(resultSet.getInt("id")).
                setPaid(BigDecimal.valueOf(3.45)).
                setPrice(BigDecimal.valueOf(3.40)).
                setStatus(Appointment.Status.DONE).
                build();
        return appointment;
    }

    @Override
    public Appointment makeUnique(Map<Integer, Appointment> cache, Appointment appointment) {
        cache.putIfAbsent(appointment.getId(),appointment);
         return cache.get(appointment.getId());
    }
}
