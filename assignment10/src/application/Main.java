package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.geometry.*;
import javafx.scene.shape.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		// create grid and set its properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(5));
		
		// create nodes and place in pane
		pane.add(new Rectangle(60, 40, Color.BLUE), 0, 0);
		pane.add(new Circle(30), 1, 1);
		Line line1 = new Line(5, 5, 50, 5);
		Line line2 = new Line(25, 5, 25, 50);
		line1.setStrokeWidth(5);
		line2.setStrokeWidth(5);
		StackPane lines = new StackPane(line1, line2);
		pane.add(lines, 2, 2);

		// create scene and place it in stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Shapes in a grid");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
