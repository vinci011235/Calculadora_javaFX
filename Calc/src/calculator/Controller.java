package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

	@FXML
	private Text output;
	
	@FXML
	private Text output_res;
	
	private double number1 = 0.0;
	private double number2 = 0.0;
	
	private String operator = "";
	private boolean start = true;
	
	private Model model = new Model();
	
	@FXML
	private void processNumpad(ActionEvent event){
		
		if(start){
			output.setText("");
			output_res.setText("");
			start = false;
		}
		
		String value = ((Button)event.getSource()).getText();
		output.setText((output.getText() + value));
	}
	
	@FXML
	private void processOperator(ActionEvent event){
		String value = ((Button)event.getSource()).getText();
	
		if(!"=".equals(value)){
			if(!operator.isEmpty())
				return;
			
			number1 = Double.parseDouble(output.getText());
			operator = value;
			output.setText("");
		}else{
			
			if(operator.isEmpty())
				return;
			

			number2 = Double.parseDouble(output.getText());
			output_res.setText("= "+String.valueOf(model.calculate(number1, number2, operator)));
			output.setText(number1 + " " + operator + " " + number2);
			operator = "";
			start = true;
		}
	}
}