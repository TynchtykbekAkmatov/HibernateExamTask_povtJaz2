package org.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate deadLine;
    private String task;

    @ManyToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
//            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    public Task(String name, LocalDate deadLine, String task) {
        this.name = name;
        this.deadLine = deadLine;
        this.task = task;
    }

    @Override
    public String toString() {
        return "Task id: " + id + ", name: " + name + '\'' + ", deadLine: " + deadLine + ", task: " + task ;
    }
}
