package com.student_registration.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ExportController implements Initializable {
    @FXML
    public Button export_button;
    @FXML
    private ChoiceBox<String> file_type_choice_box;

    @FXML
    private void exportData(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        file_type_choice_box.getItems().addAll("csv", "xlsx", "pdf");
        file_type_choice_box.getSelectionModel().selectFirst();
    }
}
