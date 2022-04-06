package semantic.com.example.semantic_web.exception_employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizedException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Object> handleAllException(Exception ex , WebRequest request){

        ExceptionResponseClass exceptionResponseClass =
                new ExceptionResponseClass(new Date(), ex.getMessage(), request.getDescription(false));

        ResponseEntity responseEntity = new ResponseEntity(exceptionResponseClass, HttpStatus.BAD_REQUEST);
        return responseEntity;


    }
    @ExceptionHandler(NullPointerException.class)
    public final ResponseEntity<Object> handleAllExceptio(Exception ex , WebRequest request){

        ExceptionResponseClass exceptionResponseClass =
                new ExceptionResponseClass(new Date(), ex.getMessage(), request.getDescription(false));

        ResponseEntity responseEntity = new ResponseEntity(exceptionResponseClass, HttpStatus.NOT_FOUND);
        return responseEntity;


    }
}
