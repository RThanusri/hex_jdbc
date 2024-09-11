package Com.java.demo.dao;
import java.sql.*;

import Com.java.Connect.DataConnect;
import Com.java.Model.Student;

public class StudentDao {


	
	private Connection con;
	PreparedStatement stat;
	
	public  StudentDao()
	{
		con=DataConnect.getConnect();
	}
	
	
	
	public void add(Student s)
	{
		
		try
		{
			 stat=con.prepareStatement("insert into students values(?,?,?)");
	  stat.setInt(1, s.getRoll());
	  stat.setString(2, s.getName());
	  stat.setInt(3, s.getFee());
	  stat.executeUpdate();
	  System.out.println("Record added");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void remove(int roll) {
		
		try {
			stat=con.prepareStatement("delete from students where roll=?");
			stat.setInt(1, roll);
			int k=stat.executeUpdate();
			if(k>0)
			{
			 System.out.println("Record deleted");
			}
			else
			{
				System.out.println("No Record deleted");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void update(int roll,int fee)
	{
		try {
			stat=con.prepareStatement("update students set fee=? where roll=?");
			stat.setInt(1, fee);
			stat.setInt(2, roll);
			int k=stat.executeUpdate();
			if(k>0)
			{
				
			
			System.out.println("Record updated");
			}
			else
			{

				System.out.println("No Record updated");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void show(Student s)
	{
		try {
			stat=con.prepareStatement("select * from students");
			 ResultSet rs = stat.executeQuery();
	            
	            while(rs.next())
	            {
	            	System.out.println("rollno    :"+rs.getInt(1));
	            	System.out.println("name     :"+rs.getString(2));
	            	System.out.println("fee      : "+rs.getInt(3));
	            
	            }
	    		
	    		}
	    		catch(Exception e)
	    		{
	    			System.out.println(e);
	    			
	    		}
		}
	}

