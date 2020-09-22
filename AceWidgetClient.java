import javax.swing.*;
import BreezySwing.*;

public class AceWidgetClient extends GBDialog {
		//instantiates new objects
	    AceWidgetServer Widget= new AceWidgetServer();
		MainFrame Frame = new MainFrame();
		//creates popup table
	     JLabel NameLabel = addLabel ("Enter Name",1,1,1,1);
		 JTextField Name= addTextField ("",1,2,1,1);
		 JLabel Quarter1Label = addLabel ("Enter Quarter 1 Sales",2,1,1,1);
		 DoubleField Quarter1Field = addDoubleField (0,2,2,1,1);
		 JLabel Quarter2Label = addLabel ("Enter Quarter 2 Sales",3,1,1,1);
		 DoubleField Quarter2Field = addDoubleField (0,3,2,1,1);
		 JLabel Quarter3Label = addLabel ("Enter Quarter 3 Sales",4,1,1,1);
		 DoubleField Quarter3Field = addDoubleField (0,4,2,1,1);
		 JLabel Quarter4Label = addLabel ("Enter Quarter 4 Sales",5,1,1,1);
		 DoubleField Quarter4Field = addDoubleField (0,5,2,1,1);
		 JButton SubmitButton = addButton ("Submit", 6,1,1,1);
    //calls employee class
 	private Employee emp;	    
	 //displays window
	 public AceWidgetClient(JFrame parent, Employee emp)
	 {
		super(parent);
		 setTitle ("Add Employee");
	     setDlgCloseIndicator ("Cancel");                
	     setSize (300, 200);   
	     this.emp = emp;
	  }
	 //executes action when button is clicked
     public void buttonClicked(JButton buttonObj){

        if (buttonObj == SubmitButton){
       //error checks for non numbers
          if (Quarter1Field.isValidNumber()==false || Quarter2Field.isValidNumber()==false || Quarter3Field.isValidNumber()==false || Quarter4Field.isValidNumber()==false) {
        	  messageBox("Sales must be a number");
          }
          else {
        	//sends information to the employee class
        	 emp.setname(Name.getText());
        	 emp.setq1(Quarter1Field.getNumber());
        	 emp.setq2(Quarter2Field.getNumber());
        	 emp.setq3(Quarter3Field.getNumber());
        	 emp.setq4(Quarter4Field.getNumber());

             setDlgCloseIndicator ("OK");
          	}
          }

      dispose();
    }
 
}














