package ca.utoronto.lms.exam.model;

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
public class ExamRealization extends BaseEntity<Long> {
  @Column(nullable = false)
  private Long subjectEnrollmentId;

  @ManyToOne(optional = false)
  private ExamTerm examTerm;

  private Integer score;
}
