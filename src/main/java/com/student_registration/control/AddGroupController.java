package com.student_registration.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AddGroupController implements Initializable {
    @FXML
    private ChoiceBox<String> group_choice_box;
    @FXML
    private TextField group_name_text_field;
    @FXML
    private Button submit_button;

    @FXML
    private void submitData(ActionEvent actionEvent) {
        if (group_choice_box.getValue().equals("New Group")) {
            //TODO add group to list

        } else {
            String groupName = group_name_text_field.getText();
            //TODO rename the selected group
        }

        Stage stage = (Stage) submit_button.getScene().getWindow();
        stage.close();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        group_choice_box.getItems().addAll("New Group"); //TODO add all groups
        group_choice_box.setValue("New Group");
    }
}
