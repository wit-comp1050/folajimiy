package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Goldilocks extends Application {

    private Label outputLabel; 

    @Override
    public void start(Stage s1) throws Exception {
        final HBox pane = new HBox(100);
        pane.setAlignment(Pos.CENTER);
        final Button btnP = new Button("Papa");
        final Button btnM = new Button("Mama");
        final Button btnB = new Button("Baby");

        // Initialize the output label
        outputLabel = new Label();
        pane.getChildren().addAll(btnP, btnM, btnB, outputLabel);

        s1.setTitle("Goldilocks and the Three Buttons");
        s1.setScene(new Scene(pane));
        s1.show();

        btnP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                outputLabel.setText("Too Hot!");
            }
        });

        btnM.setOnAction(e -> {
            outputLabel.setText("Too Cold!");
        });

        btnB.setOnAction(new JustRight());
    }

    private class JustRight implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            outputLabel.setText("Just right :)");
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
