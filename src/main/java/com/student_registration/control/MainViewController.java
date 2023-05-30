package com.student_registration.control;

import com.student_registration.data.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    @FXML
    private Button import_data, export_data, add_group, add_student, edit_student, attendance_date;

    @FXML
    private TableView<?> student_data;

    @FXML
    private TableColumn<Student, String> group, name, surname, student_id, attendance, date;

    private FileChooser file_chooser;;

    @FXML
    private void addAttendanceDate(ActionEvent event) {

    }

    @FXML
    private void addGroup(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/student_registration/add_group_view.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Add Group");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        add_student.setDisable(false);
    }

    @FXML
    private void addStudent(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/student_registration/add_student_view.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Add Student");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        edit_student.setDisable(false);
    }

    @FXML
    private void editStudent(ActionEvent event) {

    }

    @FXML
    private void exportData(ActionEvent event) {

    }

    @FXML
    private void importData(ActionEvent event) {
        Stage stage = (Stage) import_data.getScene().getWindow();
        File selectedFile = file_chooser.showOpenDialog(stage);

        // Process the selected file
        if (selectedFile != null) {
            String fileName = selectedFile.getName();
            String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);

            if (fileExtension.equals("csv")) {
                // Handle CSV file parsing
                parseCSVFile(selectedFile);
            } else if (fileExtension.equals("xlsx") || fileExtension.equals("xls")) {
                // Handle Excel file parsing
                parseExcelFile(selectedFile);
            } else {
                // Display an alert for unsupported file types
                showAlert("Unsupported File Type", "Please select a CSV or Excel file.");
            }
        }
    }

    private void parseCSVFile(File file) {
        // Logic to parse CSV file
        System.out.println("Parsing CSV file: " + file.getAbsolutePath());
    }

    private void parseExcelFile(File file) {
        // Logic to parse Excel file
        System.out.println("Parsing Excel file: " + file.getAbsolutePath());
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        group.setCellValueFactory(new PropertyValueFactory<Student, String>("group"));
//        name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
//        surname.setCellValueFactory(new PropertyValueFactory<Student, String>("surname"));
//        student_id.setCellValueFactory(new PropertyValueFactory<Student, String>("student_id"));
//        attendance.setCellValueFactory(new PropertyValueFactory<Student, String>("attendance"));
//        date.setCellValueFactory(new PropertyValueFactory<Student, String>("date"));

        file_chooser = new FileChooser();

        // Set the extension filters
        FileChooser.ExtensionFilter csvFilter = new FileChooser.ExtensionFilter("CSV Files (*.csv)", "*.csv");
        FileChooser.ExtensionFilter excelFilter = new FileChooser.ExtensionFilter("Excel Files (*.xlsx)", "*.xlsx");
        FileChooser.ExtensionFilter excelFilter2 = new FileChooser.ExtensionFilter("Excel Files (*.xls)", "*.xls");


        file_chooser.getExtensionFilters().addAll(csvFilter, excelFilter, excelFilter2);
    }
}
