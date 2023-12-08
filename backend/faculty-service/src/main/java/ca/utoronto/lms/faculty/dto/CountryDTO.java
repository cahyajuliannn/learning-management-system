package ca.utoronto.lms.faculty.dto;

import ca.utoronto.lms.shared.dto.BaseDTO;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CountryDTO extends BaseDTO<Long> {
  @NotBlank(message = "Name is mandatory")
  private String name;
}
