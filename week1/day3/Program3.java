import java.io.*;
class Student
{
	private int studentID;
	private String sName;
	private char gender;
	private Subject subjects;
	Student()
	{
	
	}
	Student(int studentID,String sName,char gender,Subject subjects)
	{
		this.studentID=studentID;
		this.sName=sName;
		this.gender=gender;
		this.subjects=subjects;
	}
	public void setStudentID(int studentID)
	{
		this.studentID=studentID;
	}
	public void setSName(String sName)
	{
		this.sName=sName;
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	public void setSubjects(Subject subjects)
	{
		this.subjects=subjects;
	}
	public int getStudentID()
	{
		return this.studentID;
	}
	public String getSName()
	{
		return this.sName;
	}
	public char getGender()
	{
		return this.gender;
	}
	public Subject getSubjects()
	{
		return this.subjects;
	}
};
class Subject
{
	private String subject1;
	private String subject2;
	private String subject3;
	private float marks1;
	private float marks2;
	private float marks3;
	Subject()
	{}
	public void setSubject1(String subject1)
	{
		this.subject1=subject1;
	}
	public void setSubject2(String subject2)
	{
		this.subject2=subject2;
	}
	public void setSubject3(String subject3)
	{
		this.subject3=subject3;
	}
	public void setMarks1(float marks1)
	{
		this.marks1=marks1;
	}
	public void setMarks2(float marks2)
	{
		this.marks2=marks2;
	}
	public void setMarks3(float marks3)
	{
		this.marks3=marks3;
	}
	public String getSubject1()
	{
		return subject1;
	}
	public String getSubject2()
	{
		return subject2;
	}
	public String getSubject3()
	{
		return subject3;
	}
	public float getMarks1()
	{
		return marks1;
	}
	public float getMarks2()
	{
		return marks2;
	}
	public float getMarks3()
	{
		return marks3;
	}
};
class ResultGenerator
{
	public static void generateResult(Student obj)
	{
		float total=obj.getSubjects().getMarks1()+obj.getSubjects().getMarks2()+obj.getSubjects().getMarks3();
		float avg=total/3;
		System.out.println("StudentID="+obj.getStudentID());
		System.out.println("StudentName="+obj.getSName());
		System.out.println("Gender="+obj.getGender());
		System.out.println("Subject1="+obj.getSubjects().getSubject1()+" Marks1="+obj.getSubjects().getMarks1());
		System.out.println("Subject2="+obj.getSubjects().getSubject2()+" Marks2="+obj.getSubjects().getMarks2());
		System.out.println("Subject3="+obj.getSubjects().getSubject3()+" Marks3="+obj.getSubjects().getMarks3());
		System.out.println("Total="+total);
		System.out.println("Average="+avg);
	}
};
class StudentDemo
{
	public Student storeStudentData(int studentID,String sName,char gender,String sub1,String sub2,String sub3,float mark1,float mark2,float mark3)
	{
		Subject obj=new Subject();
		obj.setSubject1(sub1);
		obj.setSubject1(sub1);
		obj.setSubject1(sub1);
		obj.setMarks1(mark1);
		obj.setMarks2(mark2);
		obj.setMarks3(mark3);
		Student student=new Student();
		student.setStudentID(studentID);
		student.setSName(sName);
		student.setGender(gender);
		student.setSubjects(obj);
		return student;
	}
};	
class Program3
{
	public static void main(String args[])throws IOException
	{
		StudentDemo studentDemo=new StudentDemo();
		Student student=studentDemo.storeStudentData(101,"raju",'M',"C","C++","Java",100,90,80);
		ResultGenerator.generateResult(student);
			
	}
}
