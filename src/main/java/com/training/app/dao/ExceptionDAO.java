package com.training.app.dao;

/**
 * The type Exception dao.
 */
public class ExceptionDAO extends Exception{

    /**
     * Instantiates a new Exception dao.
     */
    public ExceptionDAO() {}

    /**
     * Instantiates a new Exception dao.
     *
     * @param message the message
     */
    public ExceptionDAO(String message) {
        super(message);
    }

    /**
     * Instantiates a new Exception dao.
     *
     * @param cause the cause
     */
    public ExceptionDAO(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Exception dao.
     *
     * @param message the message
     * @param cause   the cause
     */
    public ExceptionDAO(String message, Throwable cause) {
        super(message, cause);
    }

}
