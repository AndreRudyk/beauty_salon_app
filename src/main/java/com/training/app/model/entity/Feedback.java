package com.training.app.model.entity;

import java.time.LocalDateTime;

/**
 * The type Feedback.
 *
 * @author besko
 */
public class Feedback {
    private int id;
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
     * Gets service id.
     *
     * @return the service
     */
    public int getService() {
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
        if (serviceId != feedback.serviceId) {
            return false;
        }
        if (getCommentDate() != null ? !getCommentDate().equals(feedback.getCommentDate()) : feedback.getCommentDate() != null) {
            return false;
        }
        return getComment() != null ? getComment().equals(feedback.getComment()) : feedback.getComment() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + serviceId;
        result = 31 * result + (getCommentDate() != null ? getCommentDate().hashCode() : 0);
        result = 31 * result + (getComment() != null ? getComment().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", serviceId=" + serviceId +
                ", commentDate=" + commentDate +
                ", comment='" + comment + '\'' +
                '}';
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

        private FeedbackBuilder() {}

        /**
         * Sets id.
         *
         * @param id the id
         * @return the id
         */
        public FeedbackBuilder setId(int id) {
            Feedback.this.id = id;
            return this;
        }


        /**
         * Sets service id.
         *
         * @param serviceId the service id
         * @return the service id
         */
        public FeedbackBuilder setService(int serviceId) {
            Feedback.this.serviceId = serviceId;
            return this;
        }

        /**
         * Sets comment date.
         *
         * @param commentDate the comment date
         * @return the comment date
         */
        public FeedbackBuilder setCommentDate(LocalDateTime commentDate) {
            Feedback.this.commentDate = commentDate;
            return this;
        }

        /**
         * Sets comment.
         *
         * @param comment the comment
         * @return the comment
         */
        public FeedbackBuilder setComment(String comment) {
            Feedback.this.comment = comment;
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
