package com.example.JPA.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@Entity
public class Section extends BaseEntity{

    private String name;
    private int sectionOrder;
@ManyToOne
@JoinColumn(name = "course_id")
    private Course course;

@OneToMany(mappedBy = "section")
private List<Lecture> lectures;
}
