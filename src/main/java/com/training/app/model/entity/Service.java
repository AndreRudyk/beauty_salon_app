package com.training.app.model.entity;

/**
 * @author besko
 */
public class Service extends Entity {
    private int id;
    private String serviceName;
    private String description;
    private Double price;
    private int durationMinutes;

    public int getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public int getDurationMinutes() {
        return durationMinutes;
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
        if (getDurationMinutes() != service.getDurationMinutes()) {
            return false;
        }
        if (!getServiceName().equals(service.getServiceName())) {
            return false;
        }
        if (!getDescription().equals(service.getDescription())) {
            return false;
        }
        return getPrice().equals(service.getPrice());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getServiceName().hashCode();
        result = 31 * result + getDescription().hashCode();
        result = 31 * result + getPrice().hashCode();
        return result;
    }

    public static ServiceBuilder newBuilder() {
        return new Service().new ServiceBuilder();
    }

    public class ServiceBuilder {
        private int id;
        private String serviceName;
        private String description;
        private Double price;
        private int durationMinutes;

        private ServiceBuilder() {}

        public ServiceBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public ServiceBuilder setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public ServiceBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ServiceBuilder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public ServiceBuilder setDurationMinutes(int durationMinutes) {
            this.durationMinutes = durationMinutes;
            return this;
        }

        public Service build() {
            return Service.this;
        }
    }
}
