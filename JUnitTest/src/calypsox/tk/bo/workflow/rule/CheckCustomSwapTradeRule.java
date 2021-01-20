package calypsox.tk.bo.workflow.rule;

import java.util.Vector;

import com.calypso.tk.bo.Task;
import com.calypso.tk.bo.TaskWorkflowConfig;
import com.calypso.tk.bo.workflow.WfTradeRule;
import com.calypso.tk.core.Log;
import com.calypso.tk.core.Trade;
import com.calypso.tk.service.DSConnection;

public class CheckCustomSwapTradeRule implements WfTradeRule{
	private static final String LOG= CheckCustomSwapTradeRule.class.getSimpleName();
	private static final String MESSAGE= "Notional less than 5 millions";
	public static final double Nominal=5000000.0;
	
	@Override
	public boolean check(TaskWorkflowConfig wc, Trade trade, Trade oldTrade, Vector messages, DSConnection dsCon,
			Vector excps, Task task, Object dbCon, Vector events) 
	{
		Log.system(LOG,"This is check method()");
		//Logic to check if notional is less than 5 millions
		if(trade.getProduct().getPrincipal()<Nominal)
		{
			messages.add(MESSAGE);
			System.out.println("5M check");
			return false ;
			
		}
		return true;
	}

	@Override
	public boolean update(TaskWorkflowConfig wc, Trade trade, Trade oldTrade, Vector messages, DSConnection dsCon,
			Vector excps, Task task, Object dbCon, Vector events) 
	{
		Log.system(LOG,"This is update method");
		return true;
	}

	@Override
	public String getDescription() {		
		Log.system(LOG,"This is custom workflow rule and Description method()");
		return "This rule is for SWAP trades Please enter amount grater than 5M";
		
	}

}
