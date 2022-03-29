package pl.kurs.java.test.exception.token;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TokenNotFoundException extends RuntimeException {
    public TokenNotFoundException() {
        super("There is no Token with the given parameters");
    }
}
