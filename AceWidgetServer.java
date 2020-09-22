import java.text.DecimalFormat;

public class AceWidgetServer {
	//instantiate variables
	Employee [] persons = new Employee[10];
	//instantiates decimal formatting
    DecimalFormat dec = new DecimalFormat("0.00");

	private int amount;
	//instantiates class
	public AceWidgetServer() {
		amount=0;	
	}
	//checks for amount of employees
	public boolean addEmployee(Employee emp) {
		boolean valid=true;
		if(amount>=10) {
			valid=false;	
		}
		else {	
			persons[amount]=emp;
			amount++;
		}
		return valid;
	}
	//gets desired employee info
	public Employee findEmployee(String name) {
		int a=0;
		boolean found=false;
		Employee emp=null;
		while(a<amount && !found) {
			if(name.equals(persons[a].getname())) {
			emp=persons[a];
			found=true;
			}
			a++;
		}
		return emp;
	}
	//gets employees with the most earnings
	public Employee getHighest() {
		Employee a=persons[0];
		double x=persons[0].gettotal();
		for(int i=1; i<amount;i++) {
			if(persons[i].gettotal()>=x) {
				x=persons[i].gettotal();
				a=persons[i];
			}
		}
		return a;
	}
	//gets names of employees with the highest salaries
	public String getHighestEmployees(double highestsalary) {
		String info="";
		for(int i=0; i<amount;i++) {
			if(persons[i].gettotal()==highestsalary) {
				info+= persons[i].getname() + ",";
			}
		}
		return info;
	}
	
	
	
	
	//gets employees with the least earnings
	public Employee getLowest() {
		Employee a=persons[0];
		double x=persons[0].gettotal();
		for(int i=1; i<amount;i++) {
			if(persons[i].gettotal()<x) {
				x=persons[i].gettotal();
				a=persons[i];
			}
		}
		return a;
	}
	//gets names of employees with lowest salaries
	public String getLowestEmployees(double lowestsalary) {
		String info="";
		for(int i=0; i<amount;i++) {
			if(persons[i].gettotal()==lowestsalary) {
				info+= persons[i].getname() + ",";
			}
		}
		return info;
	}
	

	
}
















