package cdac;

public class Student {
      String name;
      int rollno;
      int marks;
      public Student(String name,int roll,int totalMarks)
      {
    	  this.name=name;
    	  this.rollno=roll;
    	  this.marks=totalMarks;
      }
      
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Omkar",1,200);
		Student s2=new Student("Utkarsh",2,180);
		Student s3=new Student("Ganesh",3,190);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
