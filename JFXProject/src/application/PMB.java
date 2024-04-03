package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PMB extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage s1) throws Exception {
		final HBox pane = new HBox(200); 
		pane.setAlignment(Pos.CENTER);
		final Button btnP = new Button("Papa");
		final Button btnM = new Button("Mama");
		final Button btnB = new Button("Baby");

		pane.getChildren().addAll(btnP, btnM, btnB);

		s1.setTitle("Goldilocks and the Three Buttons");
		s1.setScene(new Scene(pane));
		s1.show();
		
		
		btnB.setOnAction(new JustRight());
//		btnP.setOnAction(new TooHot());
//		btnM.setOnAction(new TooCold());
		
		
		btnP.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
			System.out.printf("Too Hot!%n");
			}
			});
//
			btnM.setOnAction(e->{
			System.out.printf("Too Cold!%n");
			});
//

	}
	
	private static class JustRight implements EventHandler<ActionEvent> 
	{
		@Override
		public void handle(ActionEvent event) {
		System.out.printf("Just right :)%n");
		}
	}
	
//	private static class TooCold implements EventHandler<ActionEvent> 
//	{
//		@Override
//		public void handle(ActionEvent event) {
//		System.out.printf("Too cold :)%n");
//		}
//	}
	
//	private static class TooHot implements EventHandler<ActionEvent> 
//	{
//		@Override
//		public void handle(ActionEvent event) {
//		System.out.printf("Too Hot :)%n");
//		}
//	}


}
