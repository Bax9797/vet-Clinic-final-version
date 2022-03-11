package pl.kurs.java.test.exception.token.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.kurs.java.test.exception.token.TimeResponseException;

@RestControllerAdvice
public class TimeResponseExceptionHandler {

    @ExceptionHandler(value = TimeResponseException.class)
    public ResponseEntity<Object> handlerTokenNotFoundException(TimeResponseException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
