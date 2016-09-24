package com.niit.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.niit.model.RegnModel;

@Repository
public class RegnDAOImpl implements RegnDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUser(RegnModel reg) {
		sessionFactory.getCurrentSession().save(reg);
		
	}

	
	public void updateUser(RegnModel reg) {
		sessionFactory.getCurrentSession().update(reg);
		
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<RegnModel> listUsers() {
		return sessionFactory.getCurrentSession().createQuery("from RegnModel").list();
	}

	/*@SuppressWarnings({"unchecked"})
	public RegnModel getUserById(Integer UserId) {
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("deprecation")
		List<RegnModel> list=session.createQuery("from RegnModel r where r.id= :UserId").setParameter("UserId",UserId).list();
		return list.size()>0?(RegnModel)list.get(0):null;
	}

	public void removeUser(Integer id) {
		RegnModel reg=(RegnModel)sessionFactory.getCurrentSession().load(RegnModel.class,id);
		if(null!=reg){
		sessionFactory.getCurrentSession().delete(reg);
	}
	}*/
}
