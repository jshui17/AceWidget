//Jonathan Shui
//B block
//9/27/2019
//This program makes a list of up to 10 employees, has a search feature, displays their total earnings and can determine the employees with the highest and lowest earnings
import javax.swing.*;
import BreezySwing.*;
import java.text.DecimalFormat;

public class MainFrame extends GBFrame{
	//instantiates new object
	 AceWidgetServer Widget= new AceWidgetServer();
	 //instantiates decimal formatting
	 DecimalFormat dec = new DecimalFormat("0.00");

	 //creates table
	 JTextArea outputArea = addTextArea("Name                 Quarter 1                 Quarter 2                 Quarter 3                 Quarter 4                 Total Sales", 1,1,5,2);
	 JButton AddEmployeeButton = addButton ("Add Employee", 6,3,1,1);
	 JButton SearchEmployeeButton = addButton ("Search Employee",6,4,1,1);
	 JButton HighestButton = addButton ("Calculate Employee with highest sales amount", 6,1,1,1);
	 JButton LowestButton =addButton ("Calculate Employee with lowest sales amount", 6,2,1,1);
	 JLabel nm = addLabel("Jonathan Shui 2019",7,1,1,1);
	 //calls employee class
	 private Employee emp;
 //executes action when button is clicked
	 public void buttonClicked (JButton buttonobj) {
		 emp = new Employee();
		 if (buttonobj== AddEmployeeButton) {
			 //displays window
			 AceWidgetClient Client = new AceWidgetClient(this,emp);
			 Client.setVisible(true);
			 if (Client.getDlgCloseIndicator().equals("OK")) {
				 //error checks for name
				 if(emp.getname().isEmpty()) {
					 messageBox("Employee must have a name");
				 }
				 //outputs data in outputArea
				 else if(Widget.addEmployee(emp)) {
				 	outputArea.setText(outputArea.getText() + "\n" + emp.toString());
			 	 }
			 	 else {
			 		 //error checks for amount of employees
			 		 messageBox("Cannot add more than 10 employees");
			 	 }
			 }
		 }
		 if(buttonobj==SearchEmployeeButton) {
			 //displays window
			 AceWidgetFind Find = new AceWidgetFind(this,emp);
			 Find.setVisible(true);
			 //
			 if (Find.getDlgCloseIndicator().equals("OK")) {
				emp=Widget.findEmployee(emp.getname()); 
			 //error checks if employee does not exist
				if(emp==null) {
				 messageBox("Employee not found");
				}
				//displays employee data
				else {
		          messageBox("Name                 Quarter 1                 Quarter 2                 Quarter 3                 Quarter 4                 Total Sales \n" + emp.toString());
			 	}
			 }
		 }
		 
		 if(buttonobj==HighestButton) {
			 //displays employee data
			 emp=Widget.getHighest();
			 messageBox("The employee with the highest earnings is/are " + Widget.getHighestEmployees(emp.gettotal()) + " with $ " + dec.format(emp.gettotal()));
		 }
		 
		 if(buttonobj==LowestButton) {
			 //displays employee data
			 emp=Widget.getLowest();
			 messageBox("The employee with the lowest earnings is/are " + Widget.getLowestEmployees(emp.gettotal()) + " with $ " + dec.format(emp.gettotal()));
		 }	
	 }	
	 //displays main frame
	 public static void main(String[] args){
		    JFrame frm = new MainFrame();
		    frm.setTitle ("AceWidget");
		    frm.setSize (750, 250);
		    frm.setVisible (true);
	 }
}













