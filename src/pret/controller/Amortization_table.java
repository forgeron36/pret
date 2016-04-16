package pret.controller;

public class Amortization_table {
	private double beginning_balance[];
	private double interest_rate;
	private double interest_monthly[];
	private double principal_monthly[];
	private double monthly_global_payment;
	




	//adding insurance rate and and interest_monthly
	private double insurance_rate;
	private double insurance_monthly;

	
	
	
	public Amortization_table(double loan, double interest_rate, double insurante_rate, int duration_in_months) {
		//super();
		this.interest_rate=interest_rate/100;
		this.setInsurance_rate(insurante_rate/100);
		this.beginning_balance=new double[duration_in_months];
		this.interest_monthly= new double[duration_in_months];
		this.principal_monthly=new double[duration_in_months];
		this.insurance_monthly=this.insurance_rate*loan/12;
		//calculate monthly payment
			//this formula is the most commonly used
			this.monthly_global_payment=loan*(this.interest_rate)/12 * (1- ((1)/(1-(Math.pow(1+this.interest_rate/12, duration_in_months)))) );
		//calculate principal_monthly
			//finally find out the formula's 
			//initiation is good !
			this.beginning_balance[0]=loan;
			this.interest_monthly[0]=loan*this.interest_rate/12;
			this.principal_monthly[0]=monthly_global_payment-interest_monthly[0];
			
			for (int m = 1; m < duration_in_months; m++) {
				beginning_balance[m]=beginning_balance[m-1]-this.principal_monthly[m-1];
				this.interest_monthly[m]=beginning_balance[m]*this.interest_rate/12;
				this.principal_monthly[m]=monthly_global_payment-interest_monthly[m];
				
			}
			//time to get all others 
		//calculate monthly interests
			// i am using this formula : 
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
	public double[] getPrincipal_monthly() {
		return principal_monthly;
	}




	public double getInsurance_rate() {
		return insurance_rate;
	}




	public void setInsurance_rate(double insurance_rate) {
		this.insurance_rate = insurance_rate;
	}




	public double getInsurance_monthly() {
		return insurance_monthly;
	}




	public void setInsurance_monthly(double insurance_monthly) {
		this.insurance_monthly = insurance_monthly;
	}


	
	/**
	 * @return the monthly_global_payment
	 */
	public double getMonthly_global_payment() {
		return monthly_global_payment;
	}






	/**
	 * @param monthly_global_payment the monthly_global_payment to set
	 */
	public void setMonthly_global_payment(double monthly_global_payment) {
		this.monthly_global_payment = monthly_global_payment;
	}

	
	
	//methods 

	

	
	


}
