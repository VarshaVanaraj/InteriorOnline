package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.RegnDAO;
import com.niit.model.RegnModel;

@Service
public class RegnServiceImpl implements RegnService {

	@Autowired
	private RegnDAO regnDao;
	
	@Transactional
	public void addUser(RegnModel reg) {
		regnDao.addUser(reg);
		
	}

	@Transactional
	public void updateUser(RegnModel reg) {
		regnDao.updateUser(reg);
	}

	@Transactional
	public List<RegnModel> listUsers() {
		return regnDao.listUsers();
	}

	@Transactional
	public RegnModel getUserById(Integer UserId) {
		return regnDao.getUserById(UserId);
	}

	@Transactional
	public void removeUser(Integer id) {
		regnDao.removeUser(id);
		
	}

}
