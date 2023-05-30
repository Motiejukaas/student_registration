package com.student_registration.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class ExportController {
    @FXML
    public Button export_button;
    @FXML
    private ChoiceBox<String> file_type_choice_box;

    @FXML
    private void exportData(ActionEvent actionEvent) {
    }
}
