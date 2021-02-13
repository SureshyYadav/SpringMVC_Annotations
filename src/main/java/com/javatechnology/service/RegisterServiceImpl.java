package com.javatechnology.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.javatechnology.dao.RegisterDao;
import com.javatechnology.model.Register;
@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private RegisterDao dao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public String saveRegister(Register register) {
		dao.saveRegister(register);
		return null;
	}

}
