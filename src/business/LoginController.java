package business;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;

import dataaccess.Person;
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
			+ "\\src\\Docs\\PersonData";
	@FXML GridPane mainLayout;
	@FXML TextField txtUserName;
	@FXML TextField txtPassword;
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

		if (txtUserName.getText().equals("Admin") &&(txtPassword.getText().equals("123bz")) ){
		String adminView = "../ui/AdminView.fxml";
		String viewTitle = "Library System_Admin";
		helper.loadNewStage(stage, lbl1, adminView, viewTitle, false);
		}
		else
			if (txtUserName.getText().equals("Librarian") &&(txtPassword.getText().equals("123zaid")) )
		{
			String librarianView = "../ui/LibrarianView.fxml";
			String viewTitle = "Welcome Librarian";
			helper.loadNewStage(stage, lbl1, librarianView, viewTitle, false);
		}
			else{
				String loginview = "../ui/LoginView.fxml";
				String viewTitle = "Library System_Login";
				helper.loadNewStage(stage, lbl1, loginview, viewTitle, false);

			}

	}


}
