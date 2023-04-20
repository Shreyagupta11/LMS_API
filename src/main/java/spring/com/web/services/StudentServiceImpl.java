package spring.com.web.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.com.web.dto.StudentDto;
import spring.com.web.entity.Student;
import spring.com.web.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentServices {

	@Autowired(required = true)
	private StudentRepo studentRepo;
	
	List<Student> list;
	
//	public StudentServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Student( "Radhika", "Sss@gmail.com", "537606303"));
//		list.add(new Student( "Shreya", "gdsf@gmail.com", "863506787"));
//	}
//	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Student getStudent(long sId) {
		// TODO Auto-generated method stub
		Student s = null;
		for(Student student:list) {
			if(student.getsId()==sId) {
				s=student;
				break;
			}
		}
		return s;
	}

	@Override
	public String addStudent(StudentDto studentDto) {

		Student student= new Student(
		studentDto.getFullname(),
		studentDto.getUsername(),
		studentDto.getEmail(),
		studentDto.getContact(),
		studentDto.getPassword()
				);
		studentRepo.save(student);
		
		return student.getUsername();
	}

}
