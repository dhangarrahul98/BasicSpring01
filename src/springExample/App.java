package springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("springExample/student.xml");
//		Student stud = context.getBean("st_obj",Student.class);
		Student stud = (Student)context.getBean("st_obj");
		
		System.out.println(stud.getId());
	}
}
