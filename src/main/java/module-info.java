module com.lms.lms {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lms.lms to javafx.fxml;
    exports com.lms.lms;
    exports com.lms.lms.controllers;
    opens com.lms.lms.controllers to javafx.fxml;
}