package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

public class MainController {
	private EmployeeService service;
	
	 public MainController(EmployeeService service) {
			this.service = service;
		}
	 
	 public List<EmployeeVO> getEmpsByDesg(String desg)throws Exception{
        List<EmployeeVO> listVO=null;
        List<EmployeeDTO> listDTO=null;
        EmployeeVO vo=null;
		 //use Service
        listDTO=service.findEmpsByDesg(desg);
        //convert listDTO to listVO
        listVO=new ArrayList();
        for(EmployeeDTO dto:listDTO) {
        	//copy Each DTO class obj to VO class obj
        	vo=new EmployeeVO();
        	vo.setEmpNo(String.valueOf(dto.getEmpNo()));
        	vo.setEname(dto.getEname());
        	vo.setDesg(dto.getDesg());
        	vo.setSalary(String.valueOf(dto.getSalary()));
        	vo.setSrNo(String.valueOf(dto.getSrNo()));
        	//add VO obj to listVO
        	listVO.add(vo);
        }//for
       return listVO; 
	 }//method
	
}//class
