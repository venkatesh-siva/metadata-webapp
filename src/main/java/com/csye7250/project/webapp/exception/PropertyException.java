package com.csye7250.project.webapp.exception;

public class PropertyException extends Exception{
    private String description;
    private String message;

    public PropertyException(String message) {
        super(message);
    }

    public PropertyException(String message, String desc) {
        super(message);
        this.description = desc;
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
