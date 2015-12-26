package pl.cholewinski.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import pl.cholewinski.dao.PersonDAO;
import pl.cholewinski.model.Person;

public class PersonDAOImpl extends HibernateDaoSupport implements PersonDAO {

	@Override
	@Transactional
	public void save(Person p) {
		getHibernateTemplate().save(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> list() {
		List personList = getHibernateTemplate().find("from Person");
		return personList;
	}

}
