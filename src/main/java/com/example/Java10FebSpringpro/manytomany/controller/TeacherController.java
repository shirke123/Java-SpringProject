package com.example.Java10FebSpringpro.manytomany.controller;

import com.example.Java10FebSpringpro.manytomany.domain.Subjects;
import com.example.Java10FebSpringpro.manytomany.domain.Teacher;
import com.example.Java10FebSpringpro.manytomany.repository.SubjectRepo;
import com.example.Java10FebSpringpro.manytomany.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    private SubjectRepo subjectRepo;

    @Autowired
    private TeacherRepo teacherRepo;


    @PostMapping("saveTeacher")
    public ResponseEntity<Response> saveTeacher(@RequestBody Teacher teacher) {
        Response response = new Response();

        Teacher teacher1 = teacherRepo.save(teacher);
        response.setMessage("teacher is saved");
        response.setResult(teacher1);
        response.setStatusCode(HttpStatus.OK.name());
        return ResponseEntity.ok(response);
    }


    @GetMapping(value = "getIntData",produces = {
            MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE })
    public ResponseEntity<?> getIntData(){

        Response<Object> res = new Response<>();
        res.setStatusCode(HttpStatus.OK.name());
        String str = "t";
//        res.setResult(str);
        res.setMessage("Sending string value");
        return new ResponseEntity<>(res,HttpStatus.OK);
    }


    @GetMapping(value = "getTeacherData")
    public ResponseEntity<?>getTeacherData(){
        return  new ResponseEntity<>(teacherRepo.getTeacherData(),HttpStatus.OK);
    }

    @PostMapping("saveSubject")
    public ResponseEntity<?> saveSubject(@RequestBody Subjects subjects) {
        Subjects subjects1 = subjectRepo.save(subjects);
        return new ResponseEntity<>(subjects1, HttpStatus.OK);

    }
}



/**
"name":"Manish",
            "address":"Nashik",
            "subjects":[
                {
                     "id":1
                 },
                {
                   "id":2
                }
             ]
        }
 */