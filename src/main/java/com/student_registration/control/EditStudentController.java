package com.student_registration.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class EditStudentController {
    @FXML
    private ChoiceBox<String> group_choice_box, student_choice_box;

    @FXML
    private Button submit_button;

    @FXML
    private void submitData(ActionEvent actionEvent) {
    }
}
