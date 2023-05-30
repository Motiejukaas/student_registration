package com.student_registration.control;

import com.student_registration.data.Groups;
import com.student_registration.data.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
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
        Student student = new Student(name_text_field.getText(), surname_text_field.getText(), student_id_text_field.getText());


    }

    //sukuria studenta, prideda prie pasirinktos grupes



}
