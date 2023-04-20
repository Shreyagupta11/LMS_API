package spring.com.web.services;

import java.util.List;

import spring.com.web.dto.StudentDto;
import spring.com.web.entity.Student;

public interface StudentServices {
	
public List<Student> getStudents();
public Student getStudent(long sId);
public String addStudent(StudentDto studentDto);
}
