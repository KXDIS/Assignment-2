/*
 * Class: CMSC203 
 * Instructor:Ahmed Tarek
 * Description: Patient: class that contructs the patient 
 * 				Procedure: class that constructs the procedures
 * 				PatientDriverApp: class that creates and displays a patient with given info
 * Due: 09/26/23
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Hendrick Nguyen___
*/

public class PatientDriverApp {
public static void main(String[] args) {
	/*
	 * disregard the different test arguments
	 * than the given ones on the document
	 * I thought the procedures the creation of
	 * captain america seemed cool
	 */
	Patient p1 =  new Patient("Steve", "Grant", "Rogers",
							"120 EVERGREEN AVE ","Brooklyn", "20902","New York",
							"Bucky Barnes","3017284566", "3017285310"
								 );

	Procedure pro1 = new Procedure("Physical Exam","05/10/43","Dr. Erskine", 450.00);
	Procedure pro2 = new Procedure("Penicillin Injection","05/11/43","Dr. Erskine", 700.00);
	Procedure pro3 = new Procedure("Super Soldier Serum Transferance(IE Project Rebirth)","05/11/43","Dr. Erskine", 600000.00);
	
	displayPatient(p1);

	displayProcedure(pro1);
	displayProcedure(pro2);
	displayProcedure(pro3);
	System.out.println("Total Charge: $" + calculateTotalCharges(pro1,pro2,pro3,0));
	System.out.println("\nStudent Name: Hendrick Nguyen\n "
					  +"MC#: 21101752\n"
					  + "Due Date: 9/26/23");
	
}
	public static void displayPatient(Patient patient) {
		System.out.println(patient.toString());
		
	}
	
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toString());
	}
	
	public static double calculateTotalCharges(Procedure pro1,Procedure pro2,Procedure pro3, double total) {
		total = pro1.getProcedureCharge()+ pro2.getProcedureCharge() + pro3.getProcedureCharge();
		return total;
	}
}
