package Com.java.demo.service;
import  Com.java.Model.Student;
import java.util.*;
import Com.java.demo.dao.StudentDao;


public class StudentService {

	
	    Scanner sc;
		StudentDao sdao;
		
		
		public StudentService()
		{
			sc= new Scanner(System.in);
			sdao= new StudentDao();
		}
		
		
		 public void addStudent()
		 {
			 Student s = new Student();
			
			 System.out.println("enter roll No");
			 
			 s.setRoll(sc.nextInt());
			 sc.nextLine();
			 System.out.println("enter name No");
			 s.setName(sc.nextLine());
			
			
			 System.out.println("enter Fee ");
			 s.setFee(sc.nextInt());
			
			 sdao.add(s);
			
		 }
		 public void removestudent()
		 {
			 
			 System.out.println("enter roll No to delete");
			 int r=sc.nextInt();
			 sdao.remove(r);
			 
			 
		 }
		 public void updatestudent()
		 {
			
			 System.out.println("enter roll No to update");
			 int r=sc.nextInt();
			 sc.nextLine();
			 System.out.println("enter fee to update");
			 int f=sc.nextInt();
			 sdao.update(r,f);
		 }
		 public void showstudent()
		 {
			 sdao.show(null);
		 }
}
