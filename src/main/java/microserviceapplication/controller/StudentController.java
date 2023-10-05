package microserviceapplication.controller;

import lombok.RequiredArgsConstructor;
import microserviceapplication.dto.StudentResponse;
import microserviceapplication.dto.request.CreateStudentRequest;
import microserviceapplication.dto.request.UpdateStudentRequest;
import microserviceapplication.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @PostMapping
    public void createStudent(@RequestBody @Valid CreateStudentRequest request){
        studentService.createStudent(request);
    }

    @GetMapping
    public List<StudentResponse> getAllStudent(){
        return studentService.getAllStudents();
    }
    @GetMapping("{id}")
    public StudentResponse getStudent(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody UpdateStudentRequest request){
        studentService.updateStudent(id,request);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
