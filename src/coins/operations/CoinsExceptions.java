package coins.operations;

import coins.display.CoinsView;

public class CoinsExceptions {

	CoinsView popUp = new CoinsView();
	
	public boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInt = Integer.parseInt(input);
			isInt = true;
		}
		catch(NumberFormatException error)
		{
			popUp.showSomething("Input not valid. Please try again.");
		}
		return isInt;
	}
}
