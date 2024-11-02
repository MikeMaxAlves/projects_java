package entities;

public class Employee {
	private Integer id;
	public String name;
	private Double salary;
	
	public Employee() {
		
	}

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(Double percentage) {
		if(salary != null) {
			salary += salary * percentage / 100;			
		}
	}

	
	public String toString() {
		return id + ", " + name + ", R$" + String.format("%.2f", salary);
	}
	
}
