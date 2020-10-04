package com.training.app.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Service {
    private int id;
    private String serviceName;
    private String description;
    private BigDecimal price;
    private int durationMinutes;
    private List<Optional<Feedback>> feedbackList = new ArrayList<>();
    private List<Optional<Appointment>> appointmentSet = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public List<Optional<Feedback>> getFeedbackList() {
        return feedbackList;
    }

    public List<Optional<Appointment>> getAppointmentSet() {
        return appointmentSet;
    }


    public static ServiceBuilder newBuilder() {
        return new Service().new ServiceBuilder();
    }

    public class ServiceBuilder {

        private ServiceBuilder() {
        }

        public ServiceBuilder setId(int id) {
            Service.this.id = id;
            return this;
        }

        public ServiceBuilder setService(String serviceName) {
            Service.this.serviceName = serviceName;
            return this;
        }

        public ServiceBuilder setDescription(String description) {
            Service.this.description = description;
            return this;
        }

        public ServiceBuilder setPrice(BigDecimal price) {
            Service.this.price = price;
            return this;
        }

        public ServiceBuilder setDurationMinutes(int durationMinutes) {
            Service.this.durationMinutes = durationMinutes;
            return this;
        }

        public ServiceBuilder setFeedbackList(List<Optional<Feedback>> feedbackList) {
            Service.this.feedbackList = feedbackList;
            return this;
        }

        public ServiceBuilder setAppointments(List<Optional<Appointment>> appointmentSet) {
            Service.this.appointmentSet = appointmentSet;
            return this;
        }

        public Service build() {
            return Service.this;
        }
    }
}
