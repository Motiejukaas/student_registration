package com.student_registration.control;

import com.student_registration.data.Group;
import com.student_registration.data.Groups;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EditStudentController implements Initializable {
    @FXML
    public TextField name_text_field, surname_text_field, student_id_text_field, date_text_field;
    @FXML
    private ChoiceBox<String> group_choice_box, student_choice_box;

    @FXML
    private Button submit_button;

    @FXML
    private void submitData(ActionEvent actionEvent) {
        String name_edit = name_text_field.getText();
        String surname_edit = surname_text_field.getText();
        String student_id_edit = student_id_text_field.getText();
        String date_edit = date_text_field.getText();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (Groups.getInstance() != null && !Groups.getInstance().getGroups().isEmpty()) {
            group_choice_box.getItems().addAll(Groups.getInstance().getGroups().stream().map(Group::getName).toArray(String[]::new));
            group_choice_box.getSelectionModel().selectFirst();
        } else {
            group_choice_box.setValue("No groups exist");
        }

        if (Groups.getInstance() != null
                && !Groups.getInstance().getGroups().isEmpty()
                && Groups.getInstance().getGroups().get(0).getStudents() != null
                && !Groups.getInstance().getGroups().get(0).getStudents().isEmpty()) {
            student_choice_box.getItems().addAll(Groups.getInstance().getGroups().stream().map(Group::getName).toArray(String[]::new));
            //TODO fix choice box selection with students
            student_choice_box.getSelectionModel().selectFirst();
        } else {
            student_choice_box.setValue("No students exist");
        }


    }

//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        groups1 = Groups.getInstance();
//
//        if (groups1 != null && !groups1.getGroups().isEmpty()) {
//            group_choice_box.getItems().addAll(groups1.getGroups().stream().map(Group::getName).toArray(String[]::new));
//            group_choice_box.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
//                if (newValue != null) {
//                    ObservableList<String> studentNames = groups1.findGroupByName(newValue).get(0).getStudents().stream().map(Student::getName).collect(Collectors.toCollection(FXCollections::observableArrayList));
//                    student_choice_box.setItems(studentNames);
//                    student_choice_box.getSelectionModel().selectFirst();
//                } else {
//                    student_choice_box.getItems().clear();
//                }
//            });
//        } else {
//            group_choice_box.setValue("No groups exist");
//        }
//        group_choice_box.getSelectionModel().selectFirst();
//    }

}
