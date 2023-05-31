package com.student_registration.control;

import com.student_registration.data.Group;
import com.student_registration.data.Groups;
import com.student_registration.data.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AddStudentController implements Initializable {
    @FXML
    private ChoiceBox<String> group_choice_box;
    @FXML
    private TextField name_text_field, surname_text_field, student_id_text_field;
    @FXML
    private Button submit_button;

    @FXML
    private void submitData(ActionEvent event) {
        String groupName = group_choice_box.getValue();
        String name = name_text_field.getText();
        String surname = surname_text_field.getText();
        String studentId = student_id_text_field.getText();

        Student student = new Student(name_text_field.getText(), surname_text_field.getText(), student_id_text_field.getText());
        Groups.getInstance().findGroupByName(groupName).addStudent(student);

        Stage stage = (Stage) submit_button.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (Groups.getInstance() != null && !Groups.getInstance().getGroups().isEmpty()) {
            group_choice_box.getItems().addAll(Groups.getInstance().getGroups().stream().map(Group::getName).toArray(String[]::new));
        } else {
            group_choice_box.setValue("No groups exist");
        }
        group_choice_box.getSelectionModel().selectFirst();
    }
}
