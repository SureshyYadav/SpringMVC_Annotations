package com.javatechnology.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javatechnology.model.Register;
@Repository
//@Transactional
public class RegisterDaoImpl implements RegisterDao {
	@Autowired
	private HibernateTemplate template;
	//private SessionFactory factory;

	@Override
	public String saveRegister(Register register) {
		//factory.getCurrentSession().save(register);
		template.save(register);
		return null;
	}

}
