package pl.kurs.java.test.exception.doctor.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import pl.kurs.java.test.exception.doctor.DoctorNotFoundException;
import pl.kurs.java.test.exception.errors.ErrorMessageResponse;

@ControllerAdvice
public class DoctorNotFoundExceptionHandler {

    @ExceptionHandler(value = DoctorNotFoundException.class)
    public ResponseEntity<Object> handlerUserNotFoundException(DoctorNotFoundException exception) {
        ErrorMessageResponse response = new ErrorMessageResponse().setErrorMessage(exception.getMessage());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
