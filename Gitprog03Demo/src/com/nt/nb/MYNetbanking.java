package com.nt.nb;

public class MYNetbanking {
	//by default work as a RTGS work
	public String myTransferAmount()
	{
		return "money send successfuly!";
	}

	public String ImpsTrangeaction(String AcountNumber) {
		
		return "Payment By imps Method"+AcountNumber;
	}
	
}
