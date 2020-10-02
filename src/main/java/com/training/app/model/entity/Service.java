package com.training.app.model.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The type Service.
 *
 * @author besko
 */
public class Service implements Entity {
    private int id;
    private String serviceName;
    private String description;
    private double price;
    private int durationMinutes;
    private List<Feedback> feedbackList;
    /**
     * The Appointment set.
     */
    Set<Appointment> appointmentSet = new HashSet<>();

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets service name.
     *
     * @return the service name
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
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
     * Gets duration minutes.
     *
     * @return the duration minutes
     */
    public int getDurationMinutes() {
        return durationMinutes;
    }

    /**
     * Gets feedback list.
     *
     * @return the feedback list
     */
    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    /**
     * Gets appointment set.
     *
     * @return the appointment set
     */
    public Set<Appointment> getAppointmentSet() {
        return appointmentSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Service)) {
            return false;
        }

        Service service = (Service) o;

        if (getId() != service.getId()) {
            return false;
        }
        if (Double.compare(service.getPrice(), getPrice()) != 0) {
            return false;
        }
        if (getDurationMinutes() != service.getDurationMinutes()) {
            return false;
        }
        if (getServiceName() != null ? !getServiceName().equals(service.getServiceName()) : service.getServiceName() != null) {
            return false;
        }
        if (getDescription() != null ? !getDescription().equals(service.getDescription()) : service.getDescription() != null) {
            return false;
        }
        if (getFeedbackList() != null ? !getFeedbackList().equals(service.getFeedbackList()) : service.getFeedbackList() != null) {
            return false;
        }
        return getAppointmentSet() != null ? getAppointmentSet().equals(service.getAppointmentSet()) : service.getAppointmentSet() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        result = 31 * result + (getServiceName() != null ? getServiceName().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getDurationMinutes();
        result = 31 * result + (getFeedbackList() != null ? getFeedbackList().hashCode() : 0);
        result = 31 * result + (getAppointmentSet() != null ? getAppointmentSet().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", durationMinutes=" + durationMinutes +
                ", feedbackList=" + feedbackList +
                ", appointmentSet=" + appointmentSet +
                '}';
    }

    /**
     * New builder service builder.
     *
     * @return the service builder
     */
    public static ServiceBuilder newBuilder() {
        return new Service().new ServiceBuilder();
    }

    /**
     * The type Service builder.
     */
    public class ServiceBuilder {

        private ServiceBuilder() {}

        /**
         * Sets id.
         *
         * @param id the id
         * @return the id
         */
        public ServiceBuilder setId(int id) {
            Service.this.id = id;
            return this;
        }

        /**
         * Sets service name.
         *
         * @param serviceName the service name
         * @return the service name
         */
        public ServiceBuilder setServiceName(String serviceName) {
            Service.this.serviceName = serviceName;
            return this;
        }

        /**
         * Sets description.
         *
         * @param description the description
         * @return the description
         */
        public ServiceBuilder setDescription(String description) {
            Service.this.description = description;
            return this;
        }

        /**
         * Sets price.
         *
         * @param price the price
         * @return the price
         */
        public ServiceBuilder setPrice(double price) {
            Service.this.price = price;
            return this;
        }

        /**
         * Sets duration minutes.
         *
         * @param durationMinutes the duration minutes
         * @return the duration minutes
         */
        public ServiceBuilder setDurationMinutes(int durationMinutes) {
            Service.this.durationMinutes = durationMinutes;
            return this;
        }

        /**
         * Sets feedback list.
         *
         * @param feedbackList the feedback list
         * @return the feedback list
         */
        public ServiceBuilder setFeedbackList(List<Feedback> feedbackList) {
            Service.this.feedbackList = feedbackList;
            return this;
        }

        /**
         * Sets appointments.
         *
         * @param appointmentSet the appointment set
         * @return the appointments
         */
        public ServiceBuilder setAppointments(Set<Appointment> appointmentSet) {
            Service.this.appointmentSet = appointmentSet;
            return this;
        }

        /**
         * Build service.
         *
         * @return the service
         */
        public Service build() {
            return Service.this;
        }
    }
}
