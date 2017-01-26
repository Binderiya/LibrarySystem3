package business;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import dataaccess.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RegisterMemberController implements Initializable {
	@FXML
	Button newRegisterBtn;

	@FXML
	TextField txtFName;

	@FXML
	TextField txtLName;

	@FXML
	TextField txtPhone;

	@FXML
	TextField txtCity;

	@FXML
	TextField txtZip;

	@FXML
	TextField txtStreet;

	@FXML
	TextField txtState;

	public static final String OUTPUT_DIR = System.getProperty("user.dir") + "\\src\\docs\\PersonData";
	@FXML
	Label registerMemberlbl;

	Stage stage;
	static Helper helper = new Helper();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Hello");

	}

	@FXML
	private void clickedBack(ActionEvent event) {
		String adminView = "../ui/AdminView.fxml";
		String viewTitle = "Library System";
		helper.loadNewStage(stage, registerMemberlbl, adminView, viewTitle, false);
	}


	public void register() {
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
	}
	// System.out.println("clicked");
}