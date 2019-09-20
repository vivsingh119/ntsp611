package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerInfoDAO;
import com.nt.dto.CustomerDTO;

public class CustomerInfoMgmtServiceImpl implements CustomerInfoMgmtService {
	private  CustomerInfoDAO dao;
	
	 public CustomerInfoMgmtServiceImpl(CustomerInfoDAO dao) {
			this.dao = dao;
		}

    
    
	@Override
	public List<CustomerDTO> fetchAllCustomers() {
		List<CustomerBO> listBO=null;
		List<CustomerDTO> listDTO=new ArrayList();
		//use DAO
		listBO=dao.getAllCustomers();
		//copy listBO to listDTO
		listBO.forEach(bo->{
			CustomerDTO dto=new CustomerDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSrNo(listDTO.size()+1);
			listDTO.add(dto);
		});
		return listDTO;
	}//method



	@Override
	public CustomerDTO fetchCustomerByCno(int cno) {
		CustomerBO bo=null;
		CustomerDTO dto=null;
		//use DAO
		bo=dao.getCustomerByCno(cno);
		//copy BO  to DTO
		dto=new CustomerDTO();
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}
	
	@Override
	public String modifyCustomerByNo(CustomerDTO dto) {
		CustomerBO bo=null;
		int count=0;
		//convert DTO to BO
		bo=new CustomerBO();
	   BeanUtils.copyProperties(dto,bo);
	   //use DAO
	   count=dao.updateCustomerByNo(bo);
		if(count==0)
			return "Record not found for updation";
		else
			return "Record  found and updated";
	}
	
	@Override
	public String removeCustomerByNo(int cno) {
		int count=0;
		//use DAO
		count=dao.deleteCustomerByNo(cno);
		if(count==0)
			return "Customer not found for Deletion";
		else
			return "Customer  found and Deleted";
	}

}//class
