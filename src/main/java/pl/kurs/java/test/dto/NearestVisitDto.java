package pl.kurs.java.test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class NearestVisitDto {
    private DoctorVisitDto doctor;
    private LocalDateTime dateTime;
}
