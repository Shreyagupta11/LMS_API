package spring.com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import spring.com.web.entity.Student;

@EnableJpaRepositories
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
