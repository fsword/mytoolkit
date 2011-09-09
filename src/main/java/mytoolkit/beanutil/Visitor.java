package mytoolkit.beanutil;

import org.springframework.beans.BeanUtils;

public class Visitor {

	private Person person;

    public Visitor(Person person) {

        /** 错误的用法 */
        //this.person = person;
        /** 正确的用法 */
    	this.person=new Person();
    	BeanUtils.copyProperties(person,this.person);

    }

    public void hello(){
		System.out.println("hello world");
	}

	public Person getTeacher() {
		return person;
	}

	public void setTeacher(Person teacher) {
        
		this.person = teacher;
	}

	public void visit(){
		person.setName(person.getName() + " changed");
		person.dosth();
	}
}
