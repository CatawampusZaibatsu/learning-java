package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Program2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		// create pane
		Pane pane = new Pane();
		
		// create shapes for emoji
		Circle body = new Circle(150, 150, 100);
		body.setFill(Color.YELLOW);
		
		Line brow1 = new Line(90, 90, 130, 100);
		brow1.setStrokeWidth(5);
		Line brow2 = new Line(170, 100, 210, 90);
		brow2.setStrokeWidth(5);
		
		Circle eye1 = new Circle(100, 125, 10);
		Circle eye2 = new Circle(200, 125, 10);
		
		Line mouth = new Line(125, 200, 175, 190);
		mouth.setStrokeWidth(8);
		
		// add shapes to pane
		pane.getChildren().addAll(body, eye1, eye2, mouth, brow1, brow2);

		// create scene and place it in stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Angry");
		primaryStage.setScene(scene);
		primaryStage.setHeight(300);
		primaryStage.setWidth(300);
		primaryStage.show();	
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
