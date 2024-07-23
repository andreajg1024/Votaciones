module cue.edu.co.vote {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens cue.edu.co.vote to javafx.fxml;
    exports cue.edu.co.vote;
}