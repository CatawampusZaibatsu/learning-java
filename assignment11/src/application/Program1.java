package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Program1 extends Application {
	private RectPane rectPane = new RectPane();
	
	@Override
	public void start(Stage primaryStage) {

		// create an hbox and buttons and add them to the hbox
		HBox hBox = new HBox();
		hBox.setSpacing(5);
		hBox.setAlignment(Pos.CENTER);
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		hBox.getChildren().addAll(btUp, btDown, btLeft, btRight);
		
		// Create and register the handlers
		btLeft.setOnAction(new LeftHandler());
		btRight.setOnAction(new RightHandler());
		btUp.setOnAction(new UpHandler());
		btDown.setOnAction(new DownHandler());
		
		// create BorderPane and set zones
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(rectPane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		// create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 270, 270);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Control Rectangle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
			
	}
	
	// main method
	public static void main(String[] args) {
		launch(args);
	}
	
	// left button event handler
	class LeftHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method
		public void handle(ActionEvent e) {
			rectPane.moveLeft();
		}
	}	
	
	// right button even handler
	class RightHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method
		public void handle(ActionEvent e) {
			rectPane.moveRight();
		}
	}		
	
	// up button handler
	class UpHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method
		public void handle(ActionEvent e) {
			rectPane.moveUp();
		}
	}
	
	// down button handler 
	class DownHandler implements EventHandler<ActionEvent> {
		@Override // Override the handle method
		public void handle(ActionEvent e) {
			rectPane.moveDown();
		}
	}		
	
}


// custom pane class that holds the rectangle
class RectPane extends Pane {
	private Rectangle rect = new Rectangle(120, 120, 30, 30);
	
	// constructor for RectPane class
	public RectPane() {
		getChildren().add(rect);
		rect.setFill(Color.ORANGE);
	}
	
	// moves the rectPane Left
	public void moveLeft() {
		if(rect.getX() > 0) {
			rect.setX(rect.getX() - 5);
		}
		else {
			rect.setX(0);
		}
	}
	
	// moves the rectPane Right
	public void moveRight() {
		if(rect.getX() < 240) {
			rect.setX(rect.getX() + 5);
		}
		else {
			rect.setX(240);
		}
	}
	
	// moves the rectPane Up
	public void moveUp() {
		if(rect.getY() > 0) {
			rect.setY(rect.getY() - 5);
		}
		else {
			rect.setY(0);
		}
	}
	
	// moves the rectPane down
	public void moveDown() {
		if(rect.getY() < 240) {
			rect.setY(rect.getY() + 5);
		}
		else {
			rect.setY(240);
		}
	}
}

