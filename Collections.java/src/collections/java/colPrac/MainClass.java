package collections.java.colPrac;

public class MainClass {
	
	private int empId;
	private String empName;
	private int salary;
	private String location;
	
	public MainClass(int empId, String empName, int salary, String location) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.location = location;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "MainClass [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", location=" + location
				+ "]";
	}
	

}
