package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;

import business.StaffMember;
import dataaccess.PersonData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	public static final String OUTPUT_DIR = System.getProperty("user.dir")
			+ "\\src\\Docs\\personData";
	@FXML GridPane mainLayout;
	@FXML Text userNameField;
	@FXML Button loginBtn;
	@FXML Button registerBtn;
	@FXML Label lbl1;
	@FXML Label registerlbl;
	Stage stage;
	static Helper helper = new Helper();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Hello");

	}
	@FXML private void clickedLogin(ActionEvent event){
		String adminView = "../application/AdminView.fxml";
		String viewTitle = "Library System";
		helper.loadNewStage(stage, lbl1, adminView, viewTitle, false);

	}


}
