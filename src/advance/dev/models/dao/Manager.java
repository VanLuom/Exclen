package advance.dev.models.dao;

import java.util.ArrayList;
import java.util.List;

import advance.dev.models.Person;
import advance.dev.models.Students;
import advance.dev.models.Teacher;
import advance.dev.models.dao.IManager;

public class Manager implements IManager {
private List<Person> personList = new ArrayList<Person>();
	public void add(Person p) {
		// TODO Auto-generated method stub
		personList.add(p);
		System.out.println(p);
		
	}

	public void print() {
		// TODO Auto-generated method stub
		for (Person person : personList) {
			System.out.println(person);
		}
		
	}

	public void findExcellentStudents() {
		// TODO Auto-generated method stub
		Students exc = null;
		for(Person person : personList) {
			if(person instanceof Students) {
				Students std = (Students) person;
				if(exc == null) exc = std;
				else {
					if(std.getMark()> exc.getMark())
						exc = std;
				}
			}
			
		}
		System.out.println(exc);
	}

	public void findExcellentTeacher() {
		// TODO Auto-generated method stub
		Teacher exc = null;
		for (Person person : personList) {
			if(person instanceof Teacher) {
				Teacher teacher = (Teacher) person;
					if(exc == null) exc = teacher;
					else {
						if(teacher.getSalary() > exc.getSalary())
							exc = teacher;
			}
		
				}
			}
		System.out.println(exc);
}
}