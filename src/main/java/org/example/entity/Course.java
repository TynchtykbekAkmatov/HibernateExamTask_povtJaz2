package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
@Getter
@Setter
@NoArgsConstructor

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courseName;
    private Long duration;
    private LocalDate createAt;
    private String imageLink;
    private String description;

//-------------------------------------------------------------
    @ManyToMany( fetch = FetchType.LAZY,
    cascade = {

            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.DETACH})
    private List<Instructor> instructors;

//-------------------------------------------------------------
    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY, cascade = {
                    CascadeType.REMOVE,
                    CascadeType.PERSIST,
                    CascadeType.MERGE,
                    CascadeType.REFRESH,
                    CascadeType.DETACH})
    private List<Lesson> lessons;

//-------------------------------------------------------------


    public Course(String courseName, Long duration, LocalDate createAt, String imageLink, String description) {
        this.courseName = courseName;
        this.duration = duration;
        this.createAt = createAt;
        this.imageLink = imageLink;
        this.description = description;
    }

    @Override
    public String toString() {
    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("[ Course "+"id : "+id+", courseName : "+courseName+'\''+", duration : "+duration+", createAt: "+createAt+", imageLink : "+imageLink+'\''+", description : "+description+" ]");
        return "--------------------------------------------------------------------------------------------------------------------------------------------------";
    }
}
