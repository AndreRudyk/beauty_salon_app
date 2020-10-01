package com.training.app.dao;

/**
 * The type Exception dao.
 */
public class DaoException extends Exception{

    /**
     * Instantiates a new Exception dao.
     */
    public DaoException() {}

    /**
     * Instantiates a new Exception dao.
     *
     * @param message the message
     */
    public DaoException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Exception dao.
     *
     * @param cause the cause
     */
    public DaoException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Exception dao.
     *
     * @param message the message
     * @param cause   the cause
     */
    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }

}
