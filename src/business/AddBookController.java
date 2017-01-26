package business;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddBookController implements Initializable{
	public static final String OUTPUT_DIR = System.getProperty("user.dir")
			+ "\\src\\Docs\\personData";
	@FXML Label addBookLbl;
	@FXML TextField isbn;
	@FXML TextField title;
	@FXML TextField authors;
	@FXML TextField maxCheckoutLength;
	@FXML TextField numberOfCopies;
	@FXML TextField authorFirstName;
	@FXML TextField AuthorPhoneNumber;
	@FXML TextField AuthorLastName;
	@FXML TextField AuthorStreet;
	@FXML TextField AuthorCity;
	@FXML TextField AuthorState;
	@FXML TextField AuthorZip;

	@FXML Button addBtn;
	@FXML Button backBtn;
	Stage stage;
	static Helper helper = new Helper();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Hello");

	}
	@FXML private void clickedBack(ActionEvent event){
		String adminView = "../ui/AdminView.fxml";
		String viewTitle = "Library System";
		helper.loadNewStage(stage, addBookLbl, adminView, viewTitle, false);
	}
}
