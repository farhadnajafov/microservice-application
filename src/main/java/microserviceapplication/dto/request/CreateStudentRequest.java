package microserviceapplication.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateStudentRequest {
    @NotBlank(message = "Name must not be null")
    String name;
    @NotBlank(message = "Surname must not be null")
    String surname;
    @NotBlank(message = "group name must not be null")
    String groupName;
}
