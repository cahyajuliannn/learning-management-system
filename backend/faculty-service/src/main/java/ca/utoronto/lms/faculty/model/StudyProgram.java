package ca.utoronto.lms.faculty.model;

import ca.utoronto.lms.shared.model.BaseEntity;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudyProgram extends BaseEntity<Long> {
  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String acronym;

  @Lob
  @Column(nullable = false)
  private String description;

  @ManyToOne(optional = false)
  private Faculty faculty;

  @ManyToOne(optional = false)
  private Teacher manager;

  @OneToMany(mappedBy = "studyProgram")
  private Set<Student> students = new HashSet<>();
}
