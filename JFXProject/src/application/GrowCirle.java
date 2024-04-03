package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GrowCirle extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		Circle c = new Circle(50);
		c.setStroke(Color.BLACK);
		c.setFill(Color.YELLOW);
		
		Button grow = new Button("Grow");
		
		Button shrink = new Button("Shrink");
	
		HBox hb = new HBox();
		hb.getChildren().add(grow);
		hb.getChildren().add(shrink);
		hb.setSpacing(10);
		hb.setPadding(new Insets(10));
		hb.setAlignment(Pos.CENTER);
		
		VBox vb = new VBox();
		vb.getChildren().add(c);
		vb.getChildren().add(hb);
		vb.setAlignment(Pos.CENTER);

		primaryStage.setTitle("Circle");
		primaryStage.setScene(new Scene(vb, 200, 200));
		primaryStage.show();
		
		
		
		grow.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				c.setRadius(c.getRadius()+3);
			}
		});
		
		
		
		
		shrink.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				c.setRadius(c.getRadius()-3);
			}
		});

		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

