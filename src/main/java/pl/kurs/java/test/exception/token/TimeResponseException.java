package pl.kurs.java.test.exception.token;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TimeResponseException extends RuntimeException {
    public TimeResponseException() {
        super(" time to perform the operation has passed");
    }
}
