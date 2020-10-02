package com.training.app.model.entity.dao.mapper;

import com.training.app.model.entity.Appointment;

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
                setPaid(resultSet.getBigDecimal("price")).
                setPrice(resultSet.getBigDecimal("rice")).
                setActionDateTime(timestamp.toLocalDateTime()).
                setStatus(Appointment.Status.valueOf(resultSet.getString("status"))).
                build();
        return appointment;
    }

    @Override
    public Appointment makeUnique(Map<Integer, Appointment> cache, Appointment appointment) {
        cache.putIfAbsent(appointment.getId(),appointment);
         return cache.get(appointment.getId());
    }
}
