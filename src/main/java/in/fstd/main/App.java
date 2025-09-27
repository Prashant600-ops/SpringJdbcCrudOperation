package in.fstd.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.fstd.beans.Student;
import in.fstd.mappers.StudentRowMappers;
import in.fstd.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate=context.getBean(JdbcTemplate.class);
        
        //---------------INSERT OPERATION-------------------------------
//	     int std_rollno=103; 
// 	 String std_name="Ganesh";
//    	 float sts_marks=88.00f;
//        
//                String insert_into_query="INSERT INTO student VALUES(?,?,?)";
        
//        int count=jdbcTemplate.update(insert_into_query ,std_rollno,std_name,sts_marks);
//        if(count>0)
//        {
//        	System.out.println("insertion success");
//        }
//        else
//        {
//        	System.out.println("insertion faild");
//        
//        }
        
        
        
        
        
        //---------------------update operations--------------------------
        
       
//        float marks=99.99f;
//        int rollno=101;
//        
//        
//        String update_sql_query="UPDATE student SET std_marks = ? WHERE std_roll = ?";
        
//        int count=jdbcTemplate.update(update_sql_query,marks,rollno);
//        
//        if(count > 0)
//        {
//        	System.out.println("updation sussess");
//        }
//        else
//        {
//        	System.out.println("updation faild");
//	
//        }
        
        
        
        
        
//        
//        //-----------------------delete operation--------------------------------
        
//         int roll=102;
//        
//        String delete_sql_query="DELETE FROM student WHERE std_roll=?";
//        int count=jdbcTemplate.update(delete_sql_query,roll);
//
//        if(count > 0)
//          {
//          	System.out.println("Delation sussess");
//          }
//          else
//          {
//          	System.out.println("DElation faild");
// 	
//          }
//          
        
        
        //----------------------Select operation-------------------------------
        
//        String select_sql_query="SELECT * FROM student";
//    List<Student> std_list =jdbcTemplate.query(select_sql_query, new StudentRowMappers());
//    for(Student std:std_list)
//    {
//    	System.out.println("Rollno :"+std.getRollno());
//    	System.out.println("Marks : "+std.getMarks());
//    	System.out.println("Name :"+std.getName());
//    	System.out.println("-----------------------------");
//    	}      
        
        
        
        //----------------------------select operation for one object--------------------
        
        
        int rollno=103;
        String select_sql_query="SELECT * FROM student WHERE std_roll=?";
    Student std=jdbcTemplate.queryForObject(select_sql_query, new StudentRowMappers(),rollno);
    
    	System.out.println("Rollno :"+std.getRollno());
    	System.out.println("Marks : "+std.getMarks());
    	System.out.println("Name :"+std.getName());
    	System.out.println("-----------------------------");


    }
}















