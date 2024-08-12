package com.empcrud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.empcrud.entity.Emp;

@Repository
public class EmpDaoImpl implements EmpDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveEmp(Emp emp) {

		int i = (Integer) hibernateTemplate.save(emp);
		return i;
	}

	@Override
	public Emp getEmpById(int id) {
		Emp emp = hibernateTemplate.get(Emp.class, id);
		return emp;
	}

	@Override
	public List<Emp> getAllEmp() {
		List<Emp> list = hibernateTemplate.loadAll(Emp.class);
		return list;
	}

	@Transactional
	public void update(Emp emp) {
		hibernateTemplate.update(emp);

	}

	@Transactional
	public void deleteEmp(int id) {
		Emp emp = hibernateTemplate.get(Emp.class, id);
		hibernateTemplate.delete(emp);

	}

}
