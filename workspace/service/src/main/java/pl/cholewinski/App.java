package pl.cholewinski;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.cholewinski.dao.PersonDAO;
import pl.cholewinski.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring/config/applicationContext.xml");
		PersonDAO personDAO = context.getBean(PersonDAO.class);

		Person person = new Person();
		person.setName("Micha³");
		person.setCountry("Poland");
		personDAO.save(person);

		System.out.println("Person::" + person);

		List<Person> list = personDAO.list();

		list.forEach(System.out::println);
    }
}
