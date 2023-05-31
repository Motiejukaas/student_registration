package com.student_registration.control;

import com.student_registration.data.Group;
import com.student_registration.data.Groups;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Collection;
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
            String group_name_new = group_name_text_field.getText();
            Groups.getInstance().addGroup(new Group(group_name_new));
        } else {
            Groups.getInstance().findGroupByName(group_choice_box.getValue()).setName(group_name_text_field.getText());
        }

        Stage stage = (Stage) submit_button.getScene().getWindow();
        stage.close();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (Groups.getInstance() != null && !Groups.getInstance().getGroups().isEmpty()) {
            group_choice_box.getItems().addAll(Groups.getInstance().getGroups().stream().map(Group::getName).toArray(String[]::new));
        }
        group_choice_box.setValue("New Group");
    }
}