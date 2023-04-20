package spring.com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.com.web.dto.StudentDto;
import spring.com.web.entity.Student;
import spring.com.web.services.StudentServices;

@RestController
@CrossOrigin
@RequestMapping("api/student")
public class Controllers {
	
	@Autowired
	private StudentServices stServices;
	
	@GetMapping("/home")
	public String home()
	{
		return "Welcome To our Page";
	}
	
	@GetMapping("/allStudent")
	public List<Student> getStudents()
	{
		return this.stServices.getStudents();
	}
	
	@GetMapping("/allStudent/{sId}")
	public Student getStudent(@PathVariable String sId)
	{
		return this.stServices.getStudent(Long.parseLong(sId));
	}  
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody StudentDto studentDto)
	{
		String id= stServices.addStudent(studentDto);
	   return id;
	}
}
