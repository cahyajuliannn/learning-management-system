package ca.utoronto.lms.exam.client;

import ca.utoronto.lms.exam.dto.FacultyDTO;
import java.util.List;
import java.util.Set;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("faculty-service")
public interface FacultyFeignClient {
  @GetMapping("/faculties/{id}")
  List<FacultyDTO> getFaculty(@PathVariable Set<Long> id);
}
