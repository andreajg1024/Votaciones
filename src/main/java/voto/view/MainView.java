package cue.edu.co.vote.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainView extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(20);
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setAlignment(Pos.CENTER);

        Button registerButton = new Button("Registrar Votante");
        Button voteButton = new Button("Vota");

        // Hacer los botones más grandes
        registerButton.setPrefSize(200, 40);
        voteButton.setPrefSize(200, 40);

        registerButton.setOnAction(event -> {
            RegisterView registerView = new RegisterView();
            registerView.start(primaryStage);
        });

        voteButton.setOnAction(event -> {
            VoteSelectionView voteSelectionView = new VoteSelectionView();
            voteSelectionView.start(primaryStage);
        });

        root.getChildren().addAll(registerButton, voteButton);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Sistema de votación del colegio");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
