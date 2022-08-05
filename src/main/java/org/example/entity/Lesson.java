package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "lessons")
@Getter
@Setter
@NoArgsConstructor

public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String videoLink;

//-------------------------------------------------------------
    @ManyToOne( fetch = FetchType.EAGER,
    cascade = {
            CascadeType.REMOVE,
            CascadeType.PERSIST,
                CascadeType.DETACH,
                CascadeType.MERGE,
                CascadeType.REFRESH})
    @JoinColumn(name = "course_id")
    private Course course;
//-------------------------------------------------------------
    @OneToMany(mappedBy = "lesson", fetch = FetchType.EAGER, cascade =
            {CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REMOVE,
            CascadeType.REFRESH})
    @Column(name = "lesson_id")
    private List<Task> tasks;
//-------------------------------------------------------------

    public Lesson(String name, String videoLink) {
        this.name = name;
        this.videoLink = videoLink;
    }

    @Override
    public String toString() {
//        System.out.println("Lesson id: " + id + ", name: " + name + ", videoLink: " + videoLink);
//        System.out.println("---------------------------------------------------------------------------------------");
        return "\nLesson id: " + id + ", name: " + name + ", videoLink: " + videoLink + "\n--------------------------------------------------------------------------------";
    }
}
