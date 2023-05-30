module com.student_registration {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.student_registration.data to javafx.fxml;
    exports com.student_registration.data;
    opens com.student_registration.control to javafx.fxml;
    exports com.student_registration.control;
}