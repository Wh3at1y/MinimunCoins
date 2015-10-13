package coins.operations;

import javax.swing.JOptionPane;

public class CoinsConfirmOptions {

	public int yesOption()
	{
		int answer = 0;
			answer = JOptionPane.YES_OPTION;
		return answer;
	}
	
	public int noOption()
	{
		int answer = 0;
			answer = JOptionPane.NO_OPTION;
		return answer;
	}
	
}
