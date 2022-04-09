package com.greatLearning.studentManagement.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.greatLearning.studentManagement.entity.*;

@Service
public interface StudentService {
	
	//list of all the books
		public List<Student> findAll();	
		public Student findById(int id);
		//save or update
		public void save(Student theStudent);
		// delete by Id
		public void deleteById(int id);
	

}
