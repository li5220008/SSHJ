package junit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.bean.Person;
import cn.itcast.service.PersonService;

public class PersonServiceTest {
	
	private static PersonService personService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			personService = (PersonService)context.getBean("personService");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testSave() {
		personService.save(new Person("小叶"));
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPerson() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPersons() {
		List<Person> persons = personService.getPersons();
		for(Person person : persons){
			System.out.println(person.getName());
		}
	}

}
