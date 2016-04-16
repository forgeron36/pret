package pret.controller;

public class amortization_table {
	private double beginning_balance[];
	private double interest_rate;
	private double interest_monthly[];
	private double principal_monthly;

	
	
	
	public amortization_table(double loan, double interest, int duration_in_months) {
		//super();
		this.interest_rate=interest/100;
		//calculate the principal_monthly
		this.principal_monthly=loan/duration_in_months;
		//calculate the begining balance
		this.beginning_balance = new double[duration_in_months];
		this.beginning_balance[0]=loan;
		
		for (int m=1 ; m<duration_in_months;m++){
			this.beginning_balance[m]=beginning_balance[m-1]-this.principal_monthly;
		}
		//calculate the interests
		this.interest_monthly= new double[duration_in_months];
		this.interest_monthly[0]=beginning_balance[0]/12*interest_rate;
		//System.out.println("ii"+interest_monthly[0]+"="+beginning_balance[0]+"/12*"+interest_rate);
		for (int m=1 ; m<duration_in_months;m++){
			this.interest_monthly[m]=(beginning_balance[m-1]*interest_rate/12);
		}
			
	}




	/**
	 * @return the beginning_balance
	 */
	public double[] getBeginning_balance() {
		return beginning_balance;
	}




	/**
	 * @return the interest_rate
	 */
	public double getInterest_rate() {
		return interest_rate;
	}




	/**
	 * @return the interest_monthly
	 */
	public double[] getInterest_monthly() {
		return interest_monthly;
	}




	/**
	 * @return the principal_monthly
	 */
	public double getPrincipal_monthly() {
		return principal_monthly;
	}


	

	
	
	//methods 

	

	
	


}
