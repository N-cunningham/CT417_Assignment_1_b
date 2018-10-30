package ie.nuigalway.cunningham.driver;
import java.util.ArrayList;

import org.joda.time.DateTime;
import ie.nuigalway.cunningham.studentRegistrationSystem.*;

public class Driver {
	
	public static void main(String[] args) {
	
		
		//Student data
		DateTime dob0 = new DateTime(1992, 10, 2, 0, 0);
		DateTime dob1 = new DateTime(1998, 9, 5, 0, 0);
		DateTime dob2 = new DateTime(1985, 5, 25, 0, 0);
		DateTime dob3 = new DateTime(1999, 2, 19, 0, 0);
		DateTime dob4 = new DateTime(1985, 12, 10, 0, 0);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Student> studentList1 = new ArrayList<Student>();
		ArrayList<Student> studentList2 = new ArrayList<Student>();
		
		Student s1 = new Student("Rene Levesque", 50, dob0, 0, "BCT", null);		
		studentList.add(s1);
		studentList2.add(s1);
		Student s2 = new Student("Peire Trueau", 58, dob1, 1, "BCT", null);
		studentList.add(s2);
		studentList2.add(s1);
		Student s3 = new Student("Adlai Stevenson", 24, dob2, 2, "ART", null);
		studentList.add(s3);
		studentList2.add(s1);
		Student s4 = new Student("Charles De Gaul", 25, dob3, 3, "BCT", null);
		studentList.add(s4);
		studentList1.add(s1);
		Student s5 = new Student("Boris Yelsin", 58, dob4, 4, "ART", null);
		studentList.add(s5);
		studentList1.add(s1);
		
		
		//Module data
		ArrayList<Module> moduleList = new ArrayList<Module>();
		ArrayList<Module> moduleList1 = new ArrayList<Module>();
		
			
		Module m1 = new Module("Soft Eng. iii", 0, studentList, null);
		moduleList.add(m1);
		Module m2 = new Module("History of Political Thought", 0, studentList1, null);
		moduleList1.add(m2);
		Module m3 = new Module("European Union Politics", 0, studentList2, null);
		moduleList1.add(m3);
		
		s1.setModules(moduleList);
		s2.setModules(moduleList);
		s4.setModules(moduleList);
		s3.setModules(moduleList1);
		s5.setModules(moduleList1);
		
		//Course data
		DateTime startDate = new DateTime(2018, 9, 1, 0, 0);
		DateTime endDate = new DateTime(2019, 5, 30, 0, 0);
			
		ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
		
		CourseProgramme cp1 = new CourseProgramme("BCT", moduleList, studentList1, startDate, endDate);
		courses.add(cp1);
		CourseProgramme cp2 = new CourseProgramme("SCP", moduleList1, studentList2, startDate, endDate);
		courses.add(cp2);
		
		
		printCourseDetails(courses);
		printStudentDetails(studentList);
	
	}
	
	// print out a list of all the courses, their respective modules
	public static void printCourseDetails(ArrayList<CourseProgramme> courses) {
		
		
		for(int i = 0; i < courses.size(); i++) {
		 
			System.out.println("Course: " + courses.get(i).getCourseName());
			
			for(int j = 0; j < courses.get(i).getModules().size();j++) {
			
				System.out.println("module " + (j+1) + ": " + courses.get(i).getModules().get(j).getName());
			
			}
			System.out.println("\n");
				
		}
		 
		 
	}
	
	//print all students, their usernames, assigned modules and the course(s) they are registered for
	
	public static void printStudentDetails(ArrayList<Student> studentList) {
		
		System.out.println("Students \n------------------------------------------------------------");
		
		for(int i = 0; i < studentList.size(); i++) {
		
			System.out.println("Name:		" + studentList.get(i).getName() + "\nUsername:	" + studentList.get(i).getUsername() + "\nCource:		" + studentList.get(i).getCourses());
			
			for(int j = 0; j < studentList.get(i).getModules().size() ;j++) {
				
				System.out.println("module " + (j+1) + ":	" + studentList.get(i).getModules().get(j).getName());
				
			}
			
			System.out.println("\n");
			
		}
		
	}
	

}
