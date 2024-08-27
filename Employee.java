package cdac;

public class Employee {
	String firstName;
	String LastName;
	int salary;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(String firstName, String lastName, int salary) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Omkar","yadav",50000);
		Employee e2=new Employee("Ganesh","Todkar",60000);
		Employee e3=new Employee("Utkarsh","Thorat",70000);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		e1.setSalary(60000);
		System.out.println(e1);
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", LastName=" + LastName + ", salary=" + salary + "]";
	}
}
