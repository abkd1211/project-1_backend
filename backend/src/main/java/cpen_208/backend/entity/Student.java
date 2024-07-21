package cpen_208.backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Student info")

public class Student {

    @Id
    private Long id; // 10 digit id

    @Column(name = "pin")
    private short pin; // 5-digit pin

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "department")
    private String department;

    @Column(name = "email_id", nullable = false, unique = true)
    private String email;


}
