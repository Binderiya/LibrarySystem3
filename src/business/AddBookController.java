package business;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;

import dataaccess.Address;
import dataaccess.Person;
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
	/*public void addBook(){

		try {

			// Store Serialized User Object in File
			FileOutputStream fileOutputStream = new FileOutputStream(OUTPUT_DIR);

			Address address = new Address(txtStreet.getText(), txtCity.getText(), txtState.getText(), Integer.parseInt(txtZip.getText()));
			PersonData per = new PersonData(txtFName.getText(), txtLName.getText(),	Integer.parseInt(txtPhone.getText()), address);
			ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
			output.writeObject(per);

			output.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {

			// Read from the stored file
			FileInputStream fileInputStream = new FileInputStream(new File(OUTPUT_DIR));
			ObjectInputStream input = new ObjectInputStream(fileInputStream);
			PersonData personDataR = (PersonData) input.readObject();
			System.out.println(personDataR.getFirstName() + "  " + personDataR.getLastName() + "  "
					+ personDataR.getPhoneNumber() + "  " + personDataR.getAddress() + "  ");
			input.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}*/
}
