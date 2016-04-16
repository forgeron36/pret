package pret.controller;

import java.util.Date;

public class Credit {
	
	//properties 
	private int duration_in_months;
	private Date start_date;
	private double interest_rate;
	private double loan;
	private Amortization_table amortization;
		
	//constructor
	public Credit(int duration_in_months, Date start_date, double interest_rate, double insurance_rate, 
			double loan) {
		this.setDuration_in_months(duration_in_months);
		this.setStart_date(start_date);
		this.setInterest_rate(interest_rate);
		this.setLoan(loan);
		this.setAmortization(new Amortization_table(loan, interest_rate,insurance_rate, duration_in_months));
		
		
	}
	//methods
	public double getTotal_interests_paid(){
		double sum=0;
		for (int i = 0; i < this.duration_in_months; i++) {
			sum=sum+this.amortization.getInterest_monthly()[i];
		}
		return sum; 
	}
	public double getInterests_proportion(){
		return getTotal_interests_paid()/(this.getTotal_interests_paid()+this.loan);
	}
	public double getPrincipal_proportion(){
		return 1 - (getTotal_interests_paid()/(this.getTotal_interests_paid()+this.loan));
	}
	
	//set&get

	public int getDuration_in_months() {
		return duration_in_months;
	}

	private void setDuration_in_months(int duration_in_months) {
		this.duration_in_months = duration_in_months;
	}
	public Date getStart_date() {
		return start_date;
	}
	private void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public double getInterest_rate() {
		return interest_rate;
	}
	private void setInterest_rate(double interest_rate2) {
		this.interest_rate = interest_rate2;
	}
	public double getLoan() {
		return loan;
	}
	private void setLoan(double loan) {
		this.loan = loan;
	}
	public Amortization_table getAmortization() {
		return amortization;
	}
	private void setAmortization(Amortization_table amortization) {
		this.amortization = amortization;
	}
	

}
