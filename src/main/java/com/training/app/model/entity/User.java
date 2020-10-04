package com.training.app.model.entity;

import java.util.*;

/**
 * The type User.
 */
public class User {
    /**
     * The enum Role.
     */
    public enum Role {
        /**
         * Admin role.
         */
        ADMIN("admin"),
        /**
         * Employee role.
         */
        EMPLOYEE("employee"),
        /**
         * Client role.
         */
        CLIENT("client"),
        /**
         * Guest role.
         */
        GUEST("guest");

        private final String roleName;

        Role(String roleName) {
            this.roleName = roleName;
        }

        /**
         * Gets role name.
         *
         * @return the role name
         */
        public String getRoleName() {
            return roleName;
        }
    }

    private int id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Role userRole;
    private int rating;
    private Set<Optional<Card>> cards = new HashSet<>();
    private List<Optional<Appointment>> appointmentList = new ArrayList<>();

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets login.
     *
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Gets user role.
     *
     * @return the user role
     */
    public Role getUserRole() {
        return userRole;
    }

    /**
     * Gets rating.
     *
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * Gets cards.
     *
     * @return the cards
     */
    public Set<Optional<Card>> getCards() {
        return cards;
    }

    /**
     * Gets appointment list.
     *
     * @return the appointment list
     */
    public List<Optional<Appointment>> getAppointmentList() {
        return appointmentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getId() != user.getId()) {
            return false;
        }
        if (getRating() != user.getRating()) {
            return false;
        }
        if (getLogin() != null ? !getLogin().equals(user.getLogin()) : user.getLogin() != null) {
            return false;
        }
        if (getPassword() != null ? !getPassword().equals(user.getPassword()) : user.getPassword() != null) {
            return false;
        }
        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) : user.getFirstName() != null) {
            return false;
        }
        if (getLastName() != null ? !getLastName().equals(user.getLastName()) : user.getLastName() != null) {
            return false;
        }
        if (getPhoneNumber() != null ? !getPhoneNumber().equals(user.getPhoneNumber()) : user.getPhoneNumber() != null) {
            return false;
        }
        if (getUserRole() != user.getUserRole()) {
            return false;
        }
        if (getCards() != null ? !getCards().equals(user.getCards()) : user.getCards() != null) {
            return false;
        }
        return getAppointmentList() != null ? getAppointmentList().equals(user.getAppointmentList()) : user.getAppointmentList() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getLogin() != null ? getLogin().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getPhoneNumber() != null ? getPhoneNumber().hashCode() : 0);
        result = 31 * result + (getUserRole() != null ? getUserRole().hashCode() : 0);
        result = 31 * result + getRating();
        result = 31 * result + (getCards() != null ? getCards().hashCode() : 0);
        result = 31 * result + (getAppointmentList() != null ? getAppointmentList().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userRole=" + userRole +
                ", rating=" + rating +
                ", cards=" + cards +
                ", appointmentList=" + appointmentList +
                '}';
    }

    /**
     * New user builder user builder.
     *
     * @return the user builder
     */
    public static UserBuilder newUserBuilder() {
        return new User().new UserBuilder();
    }

    /**
     * The type User builder.
     */
    public class UserBuilder {
        private UserBuilder() {
        }

        /**
         * Sets id.
         *
         * @param id the id
         * @return the id
         */
        public UserBuilder setId(int id) {
            User.this.id = id;
            return this;
        }

        /**
         * Sets login.
         *
         * @param login the login
         * @return the login
         */
        public UserBuilder setLogin(String login) {
            User.this.login = login;
            return this;
        }

        /**
         * Sets password.
         *
         * @param password the password
         * @return the password
         */
        public UserBuilder setPassword(String password) {
            User.this.password = password;
            return this;
        }

        /**
         * Sets first name.
         *
         * @param firstName the first name
         * @return the first name
         */
        public UserBuilder setFirstName(String firstName) {
            User.this.firstName = firstName;
            return this;
        }

        /**
         * Sets last name.
         *
         * @param lastName the last name
         * @return the last name
         */
        public UserBuilder setLastName(String lastName) {
            User.this.lastName = lastName;
            return this;
        }

        /**
         * Sets phone number.
         *
         * @param phoneNumber the phone number
         * @return the phone number
         */
        public UserBuilder setPhoneNumber(String phoneNumber) {
            User.this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Sets user role.
         *
         * @param userRole the user role
         * @return the user role
         */
        public UserBuilder setUserRole(User.Role userRole) {
            User.this.userRole = userRole;
            return this;
        }

        /**
         * Sets rating.
         *
         * @param rating the rating
         * @return the rating
         */
        public UserBuilder setRating(int rating) {
            User.this.rating = rating;
            return this;
        }

        /**
         * Sets cards.
         *
         * @param cards the cards
         * @return the cards
         */
        public UserBuilder setCards(Set<Optional<Card>> cards) {
            User.this.cards = cards;
            return this;
        }

        /**
         * Sets appointments.
         *
         * @param appointmentList the appointment list
         * @return the appointments
         */
        public UserBuilder setAppointments(List<Optional<Appointment>> appointmentList) {
            User.this.appointmentList = appointmentList;
            return this;
        }

        /**
         * Build user.
         *
         * @return the user
         */
        public User build() {
            return User.this;
        }
    }

}
