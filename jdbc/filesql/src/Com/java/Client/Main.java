package Com.java.Client;

import Com.java.demo.service.StudentService;

public class Main {

	public static void main(String[]args)
	{
		 StudentService ser= new StudentService();
		 
		 
		  ser.addStudent();
		  ser.removestudent();
		  ser.updatestudent();
		  ser.showstudent();
	}
}
