package com.niit.service;

import java.util.List;

import com.niit.model.RegnModel;

public interface RegnService {
	public void addUser(RegnModel reg);
   public void updateUser(RegnModel reg);
    public List<RegnModel> listUsers();
   /* public RegnModel getUserById(Integer UserId);
    public void removeUser(Integer id);*/

}
