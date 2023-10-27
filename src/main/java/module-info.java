module org.vilmer.audioarchive {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.vilmer.audioarchive to javafx.fxml;
    exports org.vilmer.audioarchive;
}