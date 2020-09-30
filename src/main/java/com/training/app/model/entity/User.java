package com.training.app.model.entity;

/**
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

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Role getUserRole() {
        return userRole;
    }

    public int getRating() {
        return rating;
    }

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

    public static UserBuilder newUserBuilder() {
        return new User().new UserBuilder();
    }

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

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder setLogin(String login) {
            this.login = login;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder setUserRole(User.Role userRole) {
            this.userRole = userRole;
            return this;
        }

        public UserBuilder setRating(int rating) {
            this.rating = rating;
            return this;
        }

        public UserBuilder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public User build() {
            return User.this;
        }
    }

}
