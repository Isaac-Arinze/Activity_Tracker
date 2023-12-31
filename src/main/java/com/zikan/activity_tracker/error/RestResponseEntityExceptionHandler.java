package com.zikan.activity_tracker.error;

import com.zikan.activity_tracker.entity.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorMessage> departmentNotFoundHandler(UserNotFoundException userNotFoundException, WebRequest request ){
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, userNotFoundException.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
}