package com.training.app.model.entity;

import java.time.LocalDateTime;

/**
 * The type Appointment.
 */
public class Appointment extends Entity {

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

        private String statusName;

        Status(String statusName) {
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
    private int userId;
    private LocalDateTime actionDateTime;
    private Double price;
    private Double paid;
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
    public int getUserId() {
        return userId;
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
    public Double getPrice() {
        return price;
    }

    /**
     * Gets paid.
     *
     * @return the paid
     */
    public Double getPaid() {
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
        if (getUserId() != that.getUserId()) {
            return false;
        }
        if (!getActionDateTime().equals(that.getActionDateTime())) {
            return false;
        }
        if (!getPrice().equals(that.getPrice())) {
            return false;
        }
        if (getPaid() != null ? !getPaid().equals(that.getPaid()) : that.getPaid() != null) {
            return false;
        }
        return getStatus() == that.getStatus();
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getUserId();
        result = 31 * result + getActionDateTime().hashCode();
        result = 31 * result + getPrice().hashCode();
        result = 31 * result + (getPaid() != null ? getPaid().hashCode() : 0);
        result = 31 * result + getStatus().hashCode();
        return result;
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
        private int id;
        private int userId;
        private LocalDateTime actionDateTime;
        private Double price;
        private Double paid;
        private Appointment.Status status;

        private AppointmentBuilder() {
        }

        /**
         * Sets id.
         *
         * @param id the id
         * @return the id
         */
        public AppointmentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        /**
         * Sets user id.
         *
         * @param userId the user id
         * @return the user id
         */
        public AppointmentBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Sets action date time.
         *
         * @param actionDateTime the action date time
         * @return the action date time
         */
        public AppointmentBuilder setActionDateTime(LocalDateTime actionDateTime) {
            this.actionDateTime = actionDateTime;
            return this;
        }

        /**
         * Sets price.
         *
         * @param price the price
         * @return the price
         */
        public AppointmentBuilder setPrice(Double price) {
            this.price = price;
            return this;
        }

        /**
         * Sets paid.
         *
         * @param paid the paid
         * @return the paid
         */
        public AppointmentBuilder setPaid(Double paid) {
            this.paid = paid;
            return this;
        }

        /**
         * Sets status.
         *
         * @param status the status
         * @return the status
         */
        public AppointmentBuilder setStatus(Appointment.Status status) {
            this.status = status;
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
