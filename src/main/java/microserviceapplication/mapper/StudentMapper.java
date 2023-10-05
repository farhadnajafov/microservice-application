package microserviceapplication.mapper;

import microserviceapplication.dto.StudentResponse;
import microserviceapplication.dto.request.CreateStudentRequest;
import microserviceapplication.dto.request.UpdateStudentRequest;
import microserviceapplication.model.Student;
import org.mapstruct.*;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface StudentMapper {
//    @Mapping(target = "id", ignore = true)
    Student mapRequestToStudent(CreateStudentRequest request);

    StudentResponse mapEntityToResponse(Student student);

    Student mapUpdateRequestToEntity(@MappingTarget Student student, UpdateStudentRequest request);

}
