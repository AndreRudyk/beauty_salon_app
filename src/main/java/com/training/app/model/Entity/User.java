package com.training.app.model.Entity;

/**
 * The type User.
 *
 * @author besko
 */
public class User extends Entity {
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

    private int id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Role userRole;
    private int rating;
    private String cardNumber;

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
     * Gets card number.
     *
     * @return the card number
     */
    public String getCardNumber() {
        return cardNumber;
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
        return getCardNumber() != null ? getCardNumber().equals(user.getCardNumber()) : user.getCardNumber() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getLogin().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getPhoneNumber().hashCode();
        result = 31 * result + getUserRole().hashCode();
        result = 31 * result + getRating();
        result = 31 * result + (getCardNumber() != null ? getCardNumber().hashCode() : 0);
        return result;
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

        private int id;
        private String login;
        private String password;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private User.Role userRole;
        private int rating;
        private String cardNumber;

        /**
         * Sets id.
         *
         * @param id the id
         * @return the id
         */
        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        /**
         * Sets login.
         *
         * @param login the login
         * @return the login
         */
        public UserBuilder setLogin(String login) {
            this.login = login;
            return this;
        }

        /**
         * Sets password.
         *
         * @param password the password
         * @return the password
         */
        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        /**
         * Sets first name.
         *
         * @param firstName the first name
         * @return the first name
         */
        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        /**
         * Sets last name.
         *
         * @param lastName the last name
         * @return the last name
         */
        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        /**
         * Sets phone number.
         *
         * @param phoneNumber the phone number
         * @return the phone number
         */
        public UserBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Sets user role.
         *
         * @param userRole the user role
         * @return the user role
         */
        public UserBuilder setUserRole(User.Role userRole) {
            this.userRole = userRole;
            return this;
        }

        /**
         * Sets rating.
         *
         * @param rating the rating
         * @return the rating
         */
        public UserBuilder setRating(int rating) {
            this.rating = rating;
            return this;
        }

        /**
         * Sets card number.
         *
         * @param cardNumber the card number
         * @return the card number
         */
        public UserBuilder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
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
