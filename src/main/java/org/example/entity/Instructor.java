package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "instructors")
@Getter
@Setter
@NoArgsConstructor

public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long phoneNumber;

//-------------------------------------------------------------
    @ManyToMany( fetch = FetchType.LAZY,
            cascade = {

                        CascadeType.MERGE,
                        CascadeType.REFRESH,
                        CascadeType.DETACH},
    mappedBy = "instructors")
    private List<Course> courses;
//-------------------------------------------------------------


    public Instructor(String firstName, String lastName, String email, Long phoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Instructor id : " + id + ", firstName : " + firstName + ", lastName : " + lastName + ", email : " + email + ", phoneNumber : " + phoneNumber);

        return "-----------------------------------------------------------------------------------------------------------------------------" ;
    }
}
