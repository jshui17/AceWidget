import java.text.DecimalFormat;

public class Employee {
	//instantiates variables
   private String Name;
   private double price[];
	//instantiates decimal formatting
   DecimalFormat Dec = new DecimalFormat("0.00");
   //initializes employee class
   
   public Employee() {   
	Name="";
	price = new double[4];
	price[0]=1;
	price[1]=1;
	price[2]=1;
	price[3]=1;
	
   }
   
   //set functions for name and array
   public void setname (String nm) {
	  Name=nm; 
   }
   
   public void setq1 (double q1) {
		price[0]=q1;
	}
   
   public void setq2 (double q2) {
 		price[1]=q2;
 	}
   
   public void setq3 (double q3) {
 		price[2]=q3;
 	}
   
   public void setq4 (double q4) {
 		price[3]=q4;
 	}
   //gets the name from another class
   public String getname() {
	   return Name;
   }
   //calculates the total earnings of an employee
   public double gettotal() {
	   double total;
	   total=price[0]+price[1]+price[2]+price[3];
	   return total;
   }
   //turns the employee data into a string
   public String toString () {
		String str; 
		str = Name + "                    " +"$" + Dec.format(price[0]) + "                    "  + "$" + Dec.format(price[1]) + "                    "  + "$" + Dec.format(price[2]) + "                    " + "$" + Dec.format(price[3]) + "                    "+ "$" + Dec.format(gettotal());
	return str;
	}
	

} 







