package pl.kurs.java.test.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class VisitIdDto {
    private int id;
}
