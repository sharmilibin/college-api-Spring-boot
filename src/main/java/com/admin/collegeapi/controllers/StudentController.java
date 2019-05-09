package com.admin.collegeapi.controllers;

import com.admin.collegeapi.db.entity.MarkEntity;
import com.admin.collegeapi.db.entity.StudentEntity;
import com.admin.collegeapi.db.repository.MarkRepository;
import com.admin.collegeapi.db.repository.StudentRepository;
import com.admin.collegeapi.domain.Mark;
import com.admin.collegeapi.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository studentRepository;
    private final MarkRepository markRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository, MarkRepository markRepository) {
        this.studentRepository = studentRepository;

        this.markRepository = markRepository;
    }
        @PostMapping("/")
    public StudentEntity createStudent(@RequestBody @Valid Student student)
        {
            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setFirstName(student.getFirstName());
            studentEntity.setLastName(student.getLastName());
            studentEntity.setAbout(student.getAbout());





            return studentRepository.save(studentEntity);
        }
  @GetMapping("/")
    public List<StudentEntity> getAllStudents(@RequestParam int page, @RequestParam int count){
      System.out.println(page + "   "   + count);
        return studentRepository.findAll();

    }
    @PostMapping("/marks")
    public MarkEntity addMarks(@RequestBody @Valid Mark mark)
    {
        MarkEntity markEntity= new MarkEntity();
        markEntity.setStudentId(mark.getStudentId());
        markEntity.setSubjectCode(mark.getSubjectCode());
        markEntity.setMarksObtained(mark.getMarksObtained());
        markEntity.setMarksTotal(mark.getMarksTotal());
        markEntity.setExamType(mark.getExamType());
        markEntity.setYear(mark.getYear());
        markEntity.setSemester(mark.getSemester());


      return markRepository.save(markEntity);

      // MarKResponse markResponse = new MarkResponse();
        // markResponse.set(markentty.get())

    }
    @GetMapping("/mark/{studentId}")
    public MarkEntity getMarks(@PathVariable Integer studentId)
    {
     return markRepository.findByStudentId(studentId);

    }
    // find all students in a dept
    // select * from students where dept = ? what ever you are passing from postman
// find all students from year 2019 who had more than 80% of marks

    }

