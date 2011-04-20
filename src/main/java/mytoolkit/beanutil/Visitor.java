package mytoolkit.beanutil;

import org.springframework.beans.BeanUtils;

public class Visitor {

	private Teacher teacher;

    public Visitor(Teacher teacherData) {

//        this.teacher = teacherData;
    teacher=new Teacher();

    BeanUtils.copyProperties(teacherData,teacher);

    }

//    //??Teacher??

    public void hello(){
		System.out.println("hello world");
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
        
		this.teacher = teacher;
	}

	public void visit(){
		teacher.setName(teacher.getName() + " changed");
		teacher.dosth();
	}
}
