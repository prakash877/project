package com.abhinavitsolutions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhinavitsolutions.entity.Student;
import com.abhinavitsolutions.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository repo;
	
	@PostMapping("/student/save")
	public Student saveStudent(@RequestBody Student student) {
		return repo.save(student);
	}
	
	@GetMapping("/student/get-all")
	public List<Student> getAllStudent() {
		return repo.findAll();
	}
	
	@DeleteMapping("/student/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		repo.deleteById(id);
		return "Stuent deleted Successfully...";
	}
	
	@PutMapping("/student/update")
	public Student updateStudent(@RequestBody Student student) {
		return repo.save(student);
	}
}
