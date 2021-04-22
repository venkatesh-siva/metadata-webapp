package com.csye7250.project.webapp.exception;

import com.csye7250.project.webapp.util.CustomStrings;
import com.csye7250.project.webapp.entity.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerAdvise extends ResponseEntityExceptionHandler {


    /**
     * this method handles all UserException thrown
     *
     * @param ex
     * @return ResponseEntity of type Error
     */
    @ExceptionHandler(BusinessTermException.class)
    public ResponseEntity<Error> handleUserException(BusinessTermException ex) {
        Error error = new Error();
        error.setErrormessage(ex.getMessage());
        if (error.getErrormessage().equals(CustomStrings.notFound))
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}
