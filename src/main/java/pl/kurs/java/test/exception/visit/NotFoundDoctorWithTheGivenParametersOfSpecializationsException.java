package pl.kurs.java.test.exception.visit;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundDoctorWithTheGivenParametersOfSpecializationsException extends RuntimeException {
    public NotFoundDoctorWithTheGivenParametersOfSpecializationsException() {
        super("There is no doctor with the given parameters of Specialization");
    }
}
