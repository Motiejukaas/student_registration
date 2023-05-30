package com.student_registration.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class AddStudentController {
    @FXML
    private ChoiceBox<String> group_choice_box;
    @FXML
    private TextField name_text_field, surname_text_field, student_id_text_field;
    @FXML
    private Button submit_button;

    @FXML
    private void submitData(ActionEvent actionEvent) {
    }
}
