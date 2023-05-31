package com.student_registration.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ExportController implements Initializable {
    @FXML
    public Button export_button;
    @FXML
    private ChoiceBox<String> file_type_choice_box;

    @FXML
    private void exportData(ActionEvent actionEvent) {
        Stage stage = (Stage) export_button.getScene().getWindow();

        // Create a file chooser with the selected file extension
        FileChooser fileChooser = new FileChooser();
        String selectedExtension = file_type_choice_box.getSelectionModel().getSelectedItem();
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter(selectedExtension.toUpperCase() + " files (*." + selectedExtension + ")", "*." + selectedExtension);
        fileChooser.getExtensionFilters().add(extensionFilter);

        // Show the save dialog
        File file = fileChooser.showSaveDialog(stage);

        // Process the selected file
        if (file != null) {
            String fileName = file.getName();
            String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);

            // Perform export logic based on the file extension
            if (fileExtension.equals(selectedExtension)) {
                try (FileWriter writer = new FileWriter(fileName)) {
                    writer.write("Hello World!");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // Export data to the selected file
                //send object FILE
            } else {
                // Show an error message for unsupported file types
                showAlert("Please select a ." + selectedExtension.toUpperCase() + " file.");
            }
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Unsupported File Type");
        alert.setContentText(message);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        file_type_choice_box.getItems().clear();
        file_type_choice_box.getItems().addAll("csv", "xlsx", "pdf");
        file_type_choice_box.getSelectionModel().selectFirst();
    }
}
