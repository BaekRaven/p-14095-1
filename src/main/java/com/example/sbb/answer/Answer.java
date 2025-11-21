package com.example.sbb.answer;
import com.example.sbb.question.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Setter
@Getter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;

    @Column(columnDefinition = "TEXT")
    private String content;


}