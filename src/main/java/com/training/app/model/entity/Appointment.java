package com.training.app.model.entity;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * The type Appointment.
 */
public class Appointment implements Entity {

    /**
     * The enum Status.
     */
    public enum Status {
        /**
         * Confirmed status.
         */
        CONFIRMED("confirmed"),
        /**
         * Cancelled status.
         */
        CANCELLED("cancelled"),
        /**
         * Done status.
         */
        DONE("done");

        private final String statusName;

        Status(String statusName) {
            this.statusName = statusName;
        }

        /**
         * Gets status name.
         *
         * @return the status name
         */
        public String getStatusName() {
            return statusName;
        }
    }


    private int id;
    private User user;
    private LocalDateTime actionDateTime;
    private double price;
    private double paid;
    private Status status;


    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public User getUser() {
        return user;
    }

    /**
     * Gets action date time.
     *
     * @return the action date time
     */
    public LocalDateTime getActionDateTime() {
        return actionDateTime;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets paid.
     *
     * @return the paid
     */
    public double getPaid() {
        return paid;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Appointment)) {
            return false;
        }

        Appointment that = (Appointment) o;

        if (getId() != that.getId()) {
            return false;
        }
        if (Double.compare(that.getPrice(), getPrice()) != 0) {
            return false;
        }
        if (Double.compare(that.getPaid(), getPaid()) != 0) {
            return false;
        }
        if (!Objects.equals(user, that.user)) {
            return false;
        }
        if (getActionDateTime() != null ? !getActionDateTime().equals(that.getActionDateTime()) : that.getActionDateTime() != null) {
            return false;
        }
        return getStatus() == that.getStatus();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        result = 31 * result + (getActionDateTime() != null ? getActionDateTime().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPaid());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", user=" + user +
                ", actionDateTime=" + actionDateTime +
                ", price=" + price +
                ", paid=" + paid +
                ", status=" + status +
                '}';
    }

    /**
     * New builder appointment builder.
     *
     * @return the appointment builder
     */
    public static AppointmentBuilder newBuilder() {
        return new Appointment().new AppointmentBuilder();
    }

    /**
     * The type Appointment builder.
     */
    public class AppointmentBuilder {

        private AppointmentBuilder() {
        }

        /**
         * Sets id.
         *
         * @param id the id
         * @return the id
         */
        public AppointmentBuilder setId(int id) {
            Appointment.this.id = id;
            return this;
        }

        /**
         * Sets user id.
         *
         * @param user the user
         * @return the user id
         */
        public AppointmentBuilder setUser(User user) {
            Appointment.this.user = user;
            return this;
        }

        /**
         * Sets action date time.
         *
         * @param actionDateTime the action date time
         * @return the action date time
         */
        public AppointmentBuilder setActionDateTime(LocalDateTime actionDateTime) {
            Appointment.this.actionDateTime = actionDateTime;
            return this;
        }

        /**
         * Sets price.
         *
         * @param price the price
         * @return the price
         */
        public AppointmentBuilder setPrice(double price) {
            Appointment.this.price = price;
            return this;
        }

        /**
         * Sets paid.
         *
         * @param paid the paid
         * @return the paid
         */
        public AppointmentBuilder setPaid(double paid) {
            Appointment.this.paid = paid;
            return this;
        }

        /**
         * Sets status.
         *
         * @param status the status
         * @return the status
         */
        public AppointmentBuilder setStatus(Appointment.Status status) {
            Appointment.this.status = status;
            return this;
        }

        /**
         * Build appointment.
         *
         * @return the appointment
         */
        public Appointment build() {
            return Appointment.this;
        }
    }

}