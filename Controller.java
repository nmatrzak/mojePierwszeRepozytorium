package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class Controller {



	@FXML
	private Button button;
	@FXML
	private TextField tx;
	@FXML
	private TextField tx1;
	@FXML
	private Label lable;
	
	 @FXML
	 private void initialize() {
		
		 
	 }
	 public void setParameter() {
		tx.setText("0.0");
		tx1.setText("0");
		
		
	 }
	 
	 public void multi_Clik(ActionEvent event) {
		 double result = Double.parseDouble(tx.getText())*Double.parseDouble(tx1.getText());
		 lable.setText(Double.toString(result));
	 }
}
