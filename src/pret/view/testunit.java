package pret.view;

import java.util.Date;

import pret.controller.*;

public class testunit {
	public static void main(String[] args) {
		Date today = new Date();
		pret pret_02 = new pret(240,today,2,140000);
		
		for (int i = 0; i < 240; i++) {
			double monthly_due= pret_02.getAmortization().getInterest_monthly()[i]+pret_02.getAmortization().getPrincipal_monthly() ;

			System.out.println("Month "+i+" Monthly due : "+monthly_due+" Principal : "+pret_02.getAmortization().getPrincipal_monthly()+" Interests : "+pret_02.getAmortization().getInterest_monthly()[i]);
			
		}
	}

}
