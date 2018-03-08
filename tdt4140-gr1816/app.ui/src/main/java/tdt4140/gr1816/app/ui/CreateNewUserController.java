package tdt4140.gr1816.app.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class CreateNewUserController {

  @FXML private TextField signupUsernameField;
  @FXML private PasswordField signupPasswordField;
  @FXML private TextField ageField;
  @FXML private RadioButton femaleRadioButton;
  @FXML private RadioButton maleRadioButton;
  @FXML private RadioButton otherGenderRadioButton;
  @FXML private RadioButton isDoctorRadioButton;
  @FXML private Button createUserButton;

  public void handleCreateUser(ActionEvent event) {
    // code for creating new user
  }

  public String getGenderSelected(ActionEvent event) {
    String gender;
    if (femaleRadioButton.isSelected()) {
      gender = "female";
    } else if (maleRadioButton.isSelected()) {
      gender = "male";
    } else {
      gender = "other";
    }
    return gender;
  }
}