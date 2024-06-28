package com.example.jazzy_kart.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import javax.security.sasl.AuthenticationException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NoResourceFoundException.class)
    public ProblemDetail handle(NoResourceFoundException exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(400), exception.getMessage());
    }

    @ExceptionHandler(ClassNotFoundException.class)
    public ProblemDetail handle(ClassNotFoundException exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(500), exception.getMessage());
    }
   @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ProblemDetail handle(HttpRequestMethodNotSupportedException exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(405), exception.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public ProblemDetail handle(RuntimeException exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(500), exception.getMessage());
    }
    @ExceptionHandler(AuthenticationException.class)
    public ProblemDetail handle(AuthenticationException exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(401), exception.getMessage());
    }


    @ExceptionHandler(Exception.class)
    public ProblemDetail handle(Exception exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(500), exception.getMessage());
    }


    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ProblemDetail handle(HttpClientErrorException.NotFound exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(404), exception.getMessage());
    }


    //UserDefinedExceptions
   @ExceptionHandler(OutOfResourceException.class)
    public ProblemDetail handle(OutOfResourceException exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(503), exception.getMessage());
    }

    @ExceptionHandler(InvalidException.class)
    public ProblemDetail handle(InvalidException exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(400), exception.getMessage());
    }

    @ExceptionHandler(InvalidInputException.class)
    public ProblemDetail handle(InvalidInputException exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(400), exception.getMessage());
    }
  @ExceptionHandler(AuthorizationException.class)
    public ProblemDetail handle(AuthorizationException exception) {
        return ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(401), exception.getMessage());
    }

}
