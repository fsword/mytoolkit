package mytoolkit.beanutil;

public class Main {
	public static void main(String[] args){
		Teacher teacher = new Teacher(21, "john");

		Visitor teacherVisitor = new Visitor(teacher);
		Visitor personVisitor = new Visitor(teacher);

		teacherVisitor.visit();
		personVisitor.visit();

        System.out.println(teacher.getName());
	}
}
