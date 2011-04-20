package mytoolkit.beanutil;

public class Teacher {
	private Integer age;
	private String name;

    public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void dosth(){
		System.out.println("do by " + name);
	}
	public Teacher(Integer age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public Teacher(){
		
	}
}
