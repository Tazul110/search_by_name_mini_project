package com.example.demo.sms.Repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.sms.Model.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer>
{
//	@Query("from student pp where pp.name=?1")
	public List<Student>findBysName(String name);
}
