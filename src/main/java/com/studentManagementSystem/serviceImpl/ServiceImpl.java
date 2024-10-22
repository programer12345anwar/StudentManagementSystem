package com.studentManagementSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagementSystem.entity.Student;
import com.studentManagementSystem.repository.StudentRepository;
import com.studentManagementSystem.service.StudentService;

@Service
public class ServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository; // Use camel case for variable names

	@Override
	public List<Student> getAllStudents() {
		List<Student> list = studentRepository.findAll();
		return list;// Return the list of students
	}

	@Override
	public Student saveStudent(Student student) { // Corrected method signature
		return studentRepository.save(student); // Save the student and return the saved entity
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

		studentRepository.deleteById(id);
	}
}
