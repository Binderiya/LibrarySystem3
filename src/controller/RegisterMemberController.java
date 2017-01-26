package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RegisterMemberController implements Initializable{
	public static final String OUTPUT_DIR = System.getProperty("user.dir")
			+ "\\src\\Docs\\personData";
	@FXML Label registerMemberlbl;
	@FXML Button newRegisterBtn;
	Stage stage;
	static Helper helper = new Helper();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Hello");

	}
	@FXML private void clickedBack(ActionEvent event){
		String adminView = "../application/AdminView.fxml";
		String viewTitle = "Library System";
		helper.loadNewStage(stage, registerMemberlbl, adminView, viewTitle, false);
	}
}

