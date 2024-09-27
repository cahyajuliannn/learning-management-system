package ca.utoronto.lms.faculty;

import static ca.utoronto.lms.shared.security.SecurityUtils.ROOT_USER_ID;

import ca.utoronto.lms.faculty.model.Administrator;
import ca.utoronto.lms.faculty.repository.AdministratorRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppStartupRunner implements ApplicationRunner {
  private final AdministratorRepository administratorRepository;

  @Override
  public void run(ApplicationArguments args) {
    List<Administrator> administrators = (List<Administrator>) administratorRepository.findAll();

    if (administrators.isEmpty()) {
      administratorRepository.save(
          Administrator.builder()
              .id(ROOT_USER_ID)
              .userId(ROOT_USER_ID)
              .firstName("Bojan")
              .lastName("Zdelar")
              .build());
    }
  }
}
