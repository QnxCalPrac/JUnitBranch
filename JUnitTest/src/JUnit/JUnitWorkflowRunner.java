package JUnit;

import calypsox.tk.bo.workflow.rule.CheckCustomSwapTradeRule;

public class JUnitWorkflowRunner{
	
	  public static boolean notionalValidation(double notional) { 
		  double Nominal = 0D;
		  CheckCustomSwapTradeRule cstr = new CheckCustomSwapTradeRule();
			Nominal = cstr.Nominal;
		  return (notional < Nominal);
		  }
	 

}


