package dataaccess;

import java.io.*;

public class Main {
	public static final String OUTPUT_DIR = System.getProperty("user.dir")
			+ "\\src\\Docs\\personData";
	public static void main(String[] args) {


		try {

			// Store Serialized User Object in File
			FileOutputStream fileOutputStream = new FileOutputStream(
					OUTPUT_DIR);
			PersonData personData = new PersonData("binderiya", "zaid",12345);
			ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
			output.writeObject(personData);
			output.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {

			//Read from the stored file
			FileInputStream fileInputStream = new FileInputStream(new File(
					OUTPUT_DIR));
			ObjectInputStream input = new ObjectInputStream(fileInputStream);
			PersonData personDataR = (PersonData) input.readObject();
			System.out.println(personDataR.getFirstName() + "  " + personDataR.getLastName() + "  " + personDataR.getPhoneNumber());
			input.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}