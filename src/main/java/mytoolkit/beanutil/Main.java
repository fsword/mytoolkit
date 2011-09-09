package mytoolkit.beanutil;

public class Main {
	public static void main(String[] args){
		Person john = new Person(21, "john");

		Visitor oneVistor = new Visitor(john);
		Visitor anotherVistor = new Visitor(john);

		oneVistor.visit();
		anotherVistor.visit();

        System.out.println(john.getName());
	}
}
