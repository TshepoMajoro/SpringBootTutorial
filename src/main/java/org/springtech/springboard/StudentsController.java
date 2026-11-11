package org.springtech.springboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentsController {
    List<Students> allStudents;

    @GetMapping
    public List<Students> getAllStudents(){
        allStudents = List.of(
                new Students(1,"Karabo","Mahola","kb@gmail.com","Java Skills Program"),
                new Students(2,"Thato","Mokone","km@gmail.com","Software Engineering"),
                new Students(3,"Morena","Thipe","teepee@gmail.com","Geography")
        );
        return allStudents;
    }

    @GetMapping("/{studentId}")
    public Students getStudentById(@PathVariable int studentId){
        for(Students stu : allStudents){
            if (stu.id() == studentId){
                return stu;
            }
        }
        return null;
    }
}
