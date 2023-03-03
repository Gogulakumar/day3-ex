package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.employee;
@Repository
public interface EmployeeRepo extends JpaRepository<employee,Integer> {}