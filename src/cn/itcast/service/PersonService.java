package cn.itcast.service;

import java.util.List;

import cn.itcast.bean.Person;

public interface PersonService {

	public abstract void save(Person person);

	public abstract void update(Person person);

	public abstract void delete(Integer personid);

	public abstract Person getPerson(Integer personid);

	public abstract List<Person> getPersons();

}