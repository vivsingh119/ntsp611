package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	public List<EmployeeDTO> findEmpsByDesg(String desg)throws Exception;

}
