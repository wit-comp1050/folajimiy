package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Waldo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p = new Pane();
		Text waldo = new Text("Waldo");
		waldo.setX(100);
		waldo.setY(100);
		waldo.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.UP) {
					waldo.setY(waldo.getY()-2);
				} else if (event.getCode() == KeyCode.DOWN) {
					waldo.setY(waldo.getY()+2);
				} else if (event.getCode() == KeyCode.LEFT) {
					waldo.setX(waldo.getX()-2);
				} else if (event.getCode() == KeyCode.RIGHT) {
					waldo.setX(waldo.getX()+2);
				}
			}
		});
		p.getChildren().add(waldo);
		primaryStage.setTitle("Where's Waldo?");
		primaryStage.setScene(new Scene(p, 200, 200));
		primaryStage.show();
		waldo.requestFocus();

		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
