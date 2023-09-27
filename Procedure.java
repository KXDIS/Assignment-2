
public class Procedure {

	private String procedureName,
					practitioner,
					procedureDate;
	
	private double procedureCharge;
	
	public Procedure() {
		procedureName ="";
		practitioner = "";
		procedureDate = "";
		procedureCharge = 0.0;
	}
	
	public Procedure (String procedureName,String procedureDate,String practitioner,double procedureCharge) {
		
		this.procedureName = procedureName;
		this.practitioner= practitioner;
		this.procedureDate = procedureDate;
		this.procedureCharge = procedureCharge;
	}
	
	
	
		public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public String getPractitioner() {
		return practitioner;
	}

	public void setPractitioner(String practitioner) {
		this.practitioner = practitioner;
	}

	public String getProcedureDate() {
		return procedureDate;
	}

	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}

	public double getProcedureCharge() {
		return procedureCharge;
	}

	public void setProcedureCharge(int procedureCharge) {
		this.procedureCharge = procedureCharge;
	}

	@Override
	public String toString() {
		String fullProcedureInfo = "\n\tProcedure: " + getProcedureName() 
								+ "\n\tProcedure Date: " + getProcedureDate()
								+ "\n\tPractitioner: " + getPractitioner()
								+ "\n\tCharges: = " + getProcedureCharge();
		
		return fullProcedureInfo;
	}
	
	
	
}
