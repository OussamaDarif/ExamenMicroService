package com.Darif.cours;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cours")
@RequiredArgsConstructor
public class CoursController {

    private final CoursService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Cours cours
    ) {
        service.saveCours(cours);
    }

    @GetMapping
    public ResponseEntity<List<Cours>> findAllCours() {  // Change the return type to 'List<Cours>'
        return ResponseEntity.ok(service.findAllCours());  // Change the method name to 'findAllCours'
    }

    @GetMapping("/with-students/{cours-id}")  // Change the path variable name to 'cours-id'
    public ResponseEntity<FullCoursResponse> findCoursWithStudents(
            @PathVariable("cours-id") Integer coursId  // Change the path variable name to 'coursId'
    ) {
        return ResponseEntity.ok(service.findCoursWithStudents(coursId));  // Change the method name to 'findCoursWithStudents'
    }
}
