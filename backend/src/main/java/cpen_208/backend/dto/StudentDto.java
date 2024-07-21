package cpen_208.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private Long id; // 10-digit id
    private short pin; // 5-digit pin
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String department;
    private String email;
}
