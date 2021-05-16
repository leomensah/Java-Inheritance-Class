/* 1 - Name
 * 2 - Age
 * 3 - Phone number
 * 4 - Address
 * 5 - Salary
 * It also has a method named 'printSalary' which prints the salary of the members.
 * Two classes 'Employee' and 'Manager' inherits the 'Member' class. The
 * 'Employee' and 'Manager' classes have data members 'specialization' and
 * 'department' respectively. Now, assign name, age, phone number, address and
 * salary to an employee and a manager by making an object of both of these
 * classes and print the same.
*/

class Member {
	private String name;
	private int age;
	private String phoneNumber;
	private int salary;
	private Address address;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}  
	
	public void setAddress(Address address) {
		this.address = address;
	}  
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getAddress() {
		return address.city + " , "+ address.country + " , " + address.state;
	}
	
	
	public void printSalary() {
		System.out.println(" Salary is GHC "+this.getSalary());
	}
}

class Employee extends Member{
	private String specialization = "JavaScript";
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public String getSpecialization() {
		return specialization;
	}
}

class Address{
	String city;
	String country;
	String state;
	
	Address(String city, String country, String state){
		this.city = city;
		this.country = country;
		this.state = state;
	}
}

class Manager extends Member{
	private String department = "Software Development";
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
}

public class Q2 {

	public static void main(String[] args) {
		
		Address empAddress = new Address("Kasoa", "Ghana", "Amanfrom");
		Address mngAddress = new Address("Accra", "Ghana", "Dansoman");
		Employee emp = new Employee();
		emp.setName("Leonard");
		emp.setAge(23);
		emp.setAddress(empAddress);
		emp.setphoneNumber("0244567345");
		emp.setSalary(200);
		
		System.out.print("Employee's name is: "+ emp.getName() + " Age is: " + emp.getAge()+ " Address is: "+ emp.getAddress()+
				" Phone Number is: "+ emp.getphoneNumber() + " Specialization is: "+emp.getSpecialization());
		emp.printSalary();
		
		Manager mng = new Manager();
		mng.setName("Abigail");
		mng.setAge(20);
		mng.setAddress(mngAddress);
		mng.setphoneNumber("0245786567");
		mng.setSalary(2000);
		
		System.out.print("Manager's name is: "+ mng.getName() + " Age is: " + mng.getAge() + " Address is: "+mng.getAddress()+
				" Phone Number is: "+ mng.getphoneNumber() + " Specialization is: "+mng.getDepartment());
		mng.printSalary();
	}
}
