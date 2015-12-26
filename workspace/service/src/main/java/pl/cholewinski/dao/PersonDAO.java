package pl.cholewinski.dao;

import java.util.List;

import pl.cholewinski.model.Person;

public interface PersonDAO {

	public void save(Person p);

	public List<Person> list();
}
