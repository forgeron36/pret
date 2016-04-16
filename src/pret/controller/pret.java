package pret.controller;

import java.util.Date;

public class pret {
	
	//properties 
	private int duration_in_months;
	private Date start_date;
	private float interest_rate;
	private double loan;
	private amortization_table amortization;
		
	//constructor
	public pret(int duration_in_months, Date start_date, float interest_rate,
			double loan) {
		this.setDuration_in_months(duration_in_months);
		this.setStart_date(start_date);
		this.setInterest_rate(interest_rate);
		this.setLoan(loan);
		this.amortization = new amortization_table(loan, interest_rate, duration_in_months);
		
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

	public void setDuration_in_months(int duration_in_months) {
		this.duration_in_months = duration_in_months;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public float getInterest_rate() {
		return interest_rate;
	}
	public void setInterest_rate(float interest_rate) {
		this.interest_rate = interest_rate;
	}
	public double getLoan() {
		return loan;
	}
	public void setLoan(double loan) {
		this.loan = loan;
	}
	public amortization_table getAmortization() {
		return amortization;
	}
	public void setAmortization(amortization_table amortization) {
		this.amortization = amortization;
	}
	

}
