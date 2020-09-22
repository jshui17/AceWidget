import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import BreezySwing.GBDialog;

public class AceWidgetFind extends GBDialog {
	//instantiates new object
	MainFrame Frame = new MainFrame();
	//creates table
	JLabel EmployeeName = addLabel ("Enter Employee Name",1,1,1,1);
	JTextField Name= addTextField ("",2,1,1,1);
	JButton SubmitButton = addButton ("Submit", 3,1,1,1);
	 
//calls employee class
private Employee emp;	    
//displays window
public AceWidgetFind(JFrame parent, Employee emp)
{
	super(parent);
	 setTitle ("Search Employee");
    setDlgCloseIndicator ("Cancel");                
    setSize (300, 200);   
    this.emp = emp;
 }
//executes action when button is clicked
public void buttonClicked(JButton buttonObj){

       if (buttonObj == SubmitButton){
   //sends name to employee class
    	emp.setname(Name.getText());
        setDlgCloseIndicator ("OK");
     	}
       dispose();     
		}
	}





