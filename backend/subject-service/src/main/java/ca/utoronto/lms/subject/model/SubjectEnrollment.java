package ca.utoronto.lms.subject.model;

import ca.utoronto.lms.shared.model.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SubjectEnrollment extends BaseEntity<Long> {
  @Column(nullable = false)
  private Long studentId;

  @ManyToOne(optional = false)
  private Subject subject;

  private Integer extraPoints;
  private Integer grade;
}
