module com.student_registration {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.student_registration to javafx.fxml;
    exports com.student_registration;
}