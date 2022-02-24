package pl.kurs.java.test.exception.date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidDateException extends RuntimeException {
    public ValidDateException(String message) {super(message);}
}