package business;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MemberController implements Initializable{
	public static final String OUTPUT_DIR = System.getProperty("user.dir")
			+ "\\src\\docs\\PersonData";
	@FXML Label memberLbl;
	Stage stage;
	static Helper helper = new Helper();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Hello");

	}
}
