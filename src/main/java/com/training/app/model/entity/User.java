package com.training.app.model.entity;

import java.util.List;

/**
 * The type User.
 *
 * @author besko
 */
public class User implements Entity {
    /**
     * Values for user role
     */
    public enum Role {
        /**
         * for manager
         */
        ADMIN("admin"),
        /**
         * for salon master
         */
        EMPLOYEE("employee"),
        /**
         * for customer
         */
        CLIENT("client"),
        /**
         * for unauthorized user
         */
        GUEST("guest");

        private final String roleName;

        Role(String roleName) {
            this.roleName = roleName;
        }

        /**
         * Gets role name.
         *
         * @return {@link User.Role} roleName field
         */
        public String getRoleName() {
            return roleName;
        }
    }

    /**
     * The enum Rating.
     */
    public enum Rating {
        /**
         * The  1 stars.
         */
        S1("1"),
        /**
         * The 2 stars.
         */
        S2("2"),
        /**
         * The 3 stars.
         */
        S3("3"),
        /**
         * The 4 stars.
         */
        S4("4"),
        /**
         * The 5 stars.
         */
        S5("5");

        private final String rate;

        Rating(String rate) {
            this.rate = rate;
        }

        /**
         * Gets rating.
         *
         * @return the rating
         */
        public String getRate() {
            return rate;
        }
    }

    private int id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Role userRole;
    private Rating rating;
    private List<Card> cards;

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
    public Rating getRating() {
        return rating;
    }

    /**
     * Gets card number.
     *
     * @return the card number
     */
    public List<Card> getCards() {
        return cards;
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
        if (!getLogin().equals(user.getLogin())) {
            return false;
        }
        if (!getPassword().equals(user.getPassword())) {
            return false;
        }
        if (!getFirstName().equals(user.getFirstName())) {
            return false;
        }
        if (!getLastName().equals(user.getLastName())) {
            return false;
        }
        if (!getPhoneNumber().equals(user.getPhoneNumber())) {
            return false;
        }
        if (getUserRole() != user.getUserRole()) {
            return false;
        }
        if (getRating() != user.getRating()) {
            return false;
        }
        return getCards() != null ? getCards().equals(user.getCards()) : user.getCards() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getLogin().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getPhoneNumber().hashCode();
        result = 31 * result + (getUserRole() != null ? getUserRole().hashCode() : 0);
        result = 31 * result + (getRating() != null ? getRating().hashCode() : 0);
        result = 31 * result + (getCards() != null ? getCards().hashCode() : 0);
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
        /**
         *
         */
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
        public UserBuilder setRating(Rating rating) {
            User.this.rating = rating;
            return this;
        }

        /**
         * Sets card number.
         *
         * @param cards the card number
         * @return the cards list
         */
        public UserBuilder setCards(List<Card> cards) {
            User.this.cards = cards;
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
