package com.csye7250.project.webapp.exception;

public class RelationshipException extends Exception{
	private String description;
    private String message;

    public RelationshipException(String message) {
        super(message);
    }

    public RelationshipException(String message, String desc) {
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
