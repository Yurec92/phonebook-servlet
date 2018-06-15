package com.digdes.school.phonebook.spring;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    public @ResponseBody
    ExceptionResponse handleEmployeeNotFoundException(HttpServletRequest request, Exception ex){

        ExceptionResponse response = new ExceptionResponse();
        response.setCode("UNKNOWN");
        response.setMessage(ex.getMessage());
        response.setStatus(500);

        return response;
    }
}
