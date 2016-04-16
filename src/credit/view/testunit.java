package credit.view;

import java.util.Date;
import pret.controller.*;

public class testunit {
	public static void main(String[] args) {
				Date today = new Date();
		Credit pret_02 = new Credit(120, today, 0.9, 0.1, 160000);
		System.out.println(pret_02.getAmortization().getMonthly_global_payment()+" "+pret_02.getAmortization().getPrincipal_monthly()[0]+" "+pret_02.getAmortization().getInterest_monthly()[0]);
		for (int i = 0; i < 120; i++) {
			System.out.println("Month "+(i+1)+" Monthly due : "+pret_02.getAmortization().getMonthly_global_payment()+" Principal : "+pret_02.getAmortization().getPrincipal_monthly()[i]+" Interests : "+pret_02.getAmortization().getInterest_monthly()[i]+"Insurances :"+pret_02.getAmortization().getInsurance_monthly());
			
		}
	}

}
