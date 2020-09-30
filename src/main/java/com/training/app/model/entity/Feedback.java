package com.training.app.model.entity;

import java.time.LocalDateTime;

/**
 * The type Feedback.
 *
 * @author besko
 */
public class Feedback extends Entity {
    private int id;
    private int userId;
    private int serviceId;
    private LocalDateTime commentDate;
    private String comment;


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
     * Gets service id.
     *
     * @return the service id
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Gets comment date.
     *
     * @return the comment date
     */
    public LocalDateTime getCommentDate() {
        return commentDate;
    }

    /**
     * Gets comment.
     *
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Feedback)) {
            return false;
        }

        Feedback feedback = (Feedback) o;

        if (getId() != feedback.getId()) {
            return false;
        }
        if (getUserId() != feedback.getUserId()) {
            return false;
        }
        if (getServiceId() != feedback.getServiceId()) {
            return false;
        }
        if (!getCommentDate().equals(feedback.getCommentDate())) {
            return false;
        }
        return getComment().equals(feedback.getComment());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getUserId();
        result = 31 * result + getServiceId();
        result = 31 * result + getComment().hashCode();
        return result;
    }

    /**
     * New builder feedback builder.
     *
     * @return the feedback builder
     */
    public static FeedbackBuilder newBuilder() {
        return new Feedback().new FeedbackBuilder();
    }

    /**
     * The type Feedback builder.
     */
    public class FeedbackBuilder {
        private int id;
        private int userId;
        private int serviceId;
        private LocalDateTime commentDate;
        private String comment;

        private FeedbackBuilder() {}

        /**
         * Sets id.
         *
         * @param id the id
         * @return the id
         */
        public FeedbackBuilder setId(int id) {
            this.id = id;
            return this;
        }

        /**
         * Sets user id.
         *
         * @param userId the user id
         * @return the user id
         */
        public FeedbackBuilder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Sets service id.
         *
         * @param serviceId the service id
         * @return the service id
         */
        public FeedbackBuilder setServiceId(int serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Sets comment date.
         *
         * @param commentDate the comment date
         * @return the comment date
         */
        public FeedbackBuilder setCommentDate(LocalDateTime commentDate) {
            this.commentDate = commentDate;
            return this;
        }

        /**
         * Sets comment.
         *
         * @param comment the comment
         * @return the comment
         */
        public FeedbackBuilder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Build feedback.
         *
         * @return the feedback
         */
        public Feedback build() {
            return Feedback.this;
        }
    }
}
