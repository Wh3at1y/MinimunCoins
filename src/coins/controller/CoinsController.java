package coins.controller;

import coins.display.CoinsView;
import coins.operations.*;

public class CoinsController {

	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	private int userNumber;
	private int Confirm;
	private String tempNumber;
	
	private CoinsConfirmOptions userOptions;
	private CoinsView popUp;
	
	public CoinsController()
	{
		userOptions = new CoinsConfirmOptions();
		popUp = new CoinsView();
		
		quarters = 0; dimes = 0; nickels = 0; pennies = 0;
	}
	
	public void start()
	{
		Confirm = popUp.userConfirm("Ready to start Minimun Coins Application?");
		if(Confirm == userOptions.yesOption())
		{
			
		}
		else
		{
			System.exit(0);
		}
	}
	
	public void findMinCoins()
	{
		
	}
}
