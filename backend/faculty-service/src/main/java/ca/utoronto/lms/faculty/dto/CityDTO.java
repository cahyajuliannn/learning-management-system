package ca.utoronto.lms.faculty.dto;

import ca.utoronto.lms.shared.dto.BaseDTO;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CityDTO extends BaseDTO<Long> {
  @NotBlank(message = "Name is mandatory")
  private String name;

  @NotNull(message = "Country is mandatory")
  private CountryDTO country;
}
