
public abstract class Employee {

	private String name;
	private String age;
	private int productivityMultiplier;
	
	public Employee (String name, String age, int productivityMultiplier) {
		this.name = name;
		this.age = age;
		this.productivityMultiplier = productivityMultiplier;
	}
	
	public abstract void work();
	
	public abstract void rest();
	
	@Override
	public String toString() {
		return "Employee " + name + " is " + age + " years old. Their position is " + this.getClass().getSimpleName();
	}
	

}
