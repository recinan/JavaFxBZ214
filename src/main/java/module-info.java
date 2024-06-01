module edu.erciyes.FX {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.base;
    requires javafx.fxml;
    requires mysql.connector.j;
    requires java.sql;

    opens edu.erciyes.database;
    opens edu.erciyes.FX;
    opens edu.erciyes.FXControls;


}