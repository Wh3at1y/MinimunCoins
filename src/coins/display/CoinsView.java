package coins.display;

import javax.swing.JOptionPane;

public class CoinsView {

	public String userInput(String input)
	{
		String answer = "";
			answer = JOptionPane.showInputDialog(input);
		return answer;
	}
	
	public void showSomething(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
	
	public int userConfirm(String input)
	{
		int answer = 1;
			answer = JOptionPane.showConfirmDialog(null, answer);
		return answer;
	}
}
