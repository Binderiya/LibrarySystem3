package business;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AdminController implements Initializable {
	public static final String OUTPUT_DIR = System.getProperty("user.dir") + "\\src\\Docs\\personData";
	@FXML
	Label adminLbl;
	@FXML
	Text adminViewText;
	@FXML
	Button registerMemberBtn;
	@FXML
	Button addNewBookBtn;
	@FXML
	Button logOutBtn;
	@FXML
	Label registerlbl;
	Stage stage;
	static Helper helper = new Helper();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Hello");

	}

	@FXML
	private void clickedAddNewBook(ActionEvent event) {
		String addBookView = "../ui/AddBookView.fxml";
		String viewTitle = "Library System";
		helper.loadNewStage(stage, adminLbl, addBookView, viewTitle, false);
	}

	@FXML
	private void clickedRegister(ActionEvent event) {
		String registerMemberView = "../ui/RegisterMemberView.fxml";
		String viewTitle = "Library System";
		helper.loadNewStage(stage, adminLbl, registerMemberView, viewTitle, false);
	}

	@FXML
	private void clickedLogOut(ActionEvent event) {
		String LoginView = "../ui/LoginView.fxml";
		String viewTitle = "Library System";
		helper.loadNewStage(stage, adminLbl, LoginView, viewTitle, false);
	}

}
