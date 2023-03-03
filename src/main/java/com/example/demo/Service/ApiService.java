package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.employee;
import com.example.demo.Repository.EmployeeRepo;
@Service
public class ApiService
{	
	@Autowired	EmployeeRepo emp;
public employee postDetails(employee e) 
{		
	return emp.save(e);
	}	
public List<employee> getDetails()
{		
	return emp.findAll();
	}
}