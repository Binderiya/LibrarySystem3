package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Helper {

	public void loadView(Stage stage, String viewName, String viewTitle, boolean maximized) {
		try{
		Parent root = FXMLLoader.load(getClass().getResource(viewName));
		stage.setTitle(viewTitle);
		stage.setMaximized(maximized);
		stage.setTitle(viewTitle);
		stage.setScene(new Scene(root));
		stage.show();
		}catch(Exception e){
			System.out.println("Helper error : " + e.getMessage());
		}
	}

	public void loadNewStage(Stage stage, Label lb, String viewName, String viewTitle, boolean maximized) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource(viewName));
			stage = (Stage) lb.getScene().getWindow();
			Stage newStage = new Stage();

			newStage.setTitle(viewTitle);
			newStage.setMaximized(maximized);
			newStage.setScene(new Scene(root));
			newStage.show();

			stage.close();

		} catch (Exception e) {
			System.out.print("Helper:" +e.getMessage());
			e.printStackTrace();
		}
	}


	public void backToHome(Stage stage, Label lblClose, String memberView) {
		String viewTitle = "Library Member";
		loadNewStage(stage, lblClose, memberView, viewTitle, false);
	}

	public void showErroDialog(String msg, String title) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle(title);
		alert.setContentText(msg);
		alert.showAndWait();
	}

	public void showSuccessDialog(String msg, String title) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(title);
		alert.setContentText(msg);
		alert.showAndWait();
	}
}
