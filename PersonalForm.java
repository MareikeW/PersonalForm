import java.awt.*;
import javax.swing.*;

//* creates a personal form to be filled out by a user */

public class PersonalForm extends JFrame {
	
	public PersonalForm() {
		
		JPanel jpanel = new JPanel();
		
		jpanel.setLayout(new GridLayout(5, 2)); //Grid with 5 rows and 2 columns
		
		FlowLayout layout = new FlowLayout(); // create flowlayout
		
		JPanel jpanel2 = new JPanel(); //create jpanel2 object
		
		jpanel2.setLayout(layout); //set layout
		
		JLabel lfirst, llast, lage, lplace, lcountry; //declaring objects of JLabel class.
		
		JTextField tfirst, tlast, tage, tplace, tcountry;  // declaring objects of JTextField class.
		
		lfirst = new JLabel("First name:"); //initialize labels
		
		tfirst = new JTextField(20); //initialize textfields for labels
		
		llast = new JLabel("Laste name:");
		
		tlast = new JTextField(20);
		
		lage = new JLabel("Age:");
		
		tage = new JTextField(3);
		
		lplace = new JLabel("Place of Residence:");
		
		tplace = new JTextField(20);
		
		lcountry = new JLabel("Country:");
		
		tcountry = new JTextField(20);
		
		jpanel.add(lfirst); //add Jlabel "lfirst" on JFrame
		
		jpanel.add(tfirst);
		
		jpanel.add(llast);
		
		jpanel.add(tlast);
		
		jpanel.add(lage);
		
		jpanel.add(tage);
		
		jpanel.add(lplace);
		
		jpanel.add(tplace);
		
		jpanel.add(lcountry);
		
		jpanel.add(tcountry);
		
		// add the p1 object which  
	    // refer to the Jpanel - without it there is only an empty window
	    add(jpanel, "North"); 
	  
	    // add the p2 object which 
	    // refer to the Jpanel 
	    add(jpanel2, "South"); 
	
		setVisible(true);
		
		this.setSize(400, 200);
	}
	
	public static void main(String args[]) 
    { 
  
        // call the constructor 
        new PersonalForm(); 
    } 
}
