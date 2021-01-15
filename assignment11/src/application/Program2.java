package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Program2 extends Application {
	// text fields
	private TextField investmentAmountFld = new TextField();
	private TextField numberOfYearsFld = new TextField();
	private TextField annualInterestRateFld = new TextField();
	
	// label for answer
	private Label futureValueLbl = new Label("N/A");
	
	// button
	private Button calculateBtn = new Button("Calculate");

	@Override
	public void start(Stage primaryStage) {
		// labels
		Label investmentAmountLbl = new Label("Investment Amount: ");
		Label numberOfYearsLbl = new Label("Number of Years: ");
		Label annualInterestRateLbl = new Label("Annual Interest Rate: ");
		Label futureLbl = new Label("Future Value: ");

		
		// GridPane Layout
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5));
		
		// labels layout in the grid pane
		GridPane.setHalignment(investmentAmountLbl, HPos.LEFT);
		pane.add(investmentAmountLbl, 0, 0);
		GridPane.setHalignment(numberOfYearsLbl, HPos.LEFT);
		pane.add(numberOfYearsLbl, 0, 1);
		GridPane.setHalignment(annualInterestRateLbl, HPos.LEFT);
		pane.add(annualInterestRateLbl, 0, 2);
		GridPane.setHalignment(futureLbl, HPos.LEFT);
		pane.add(futureLbl, 0, 3);
		GridPane.setHalignment(futureValueLbl, HPos.RIGHT);
		pane.add(futureValueLbl, 1, 3);
		
		// TextFields layout in the grid pane
		GridPane.setHalignment(investmentAmountFld, HPos.LEFT);
		pane.add(investmentAmountFld, 1, 0);
		GridPane.setHalignment(numberOfYearsFld, HPos.LEFT);
		pane.add(numberOfYearsFld, 1, 1);
		GridPane.setHalignment(annualInterestRateFld, HPos.LEFT);
		pane.add(annualInterestRateFld, 1, 2);
		
		// button layout in StackPane
		StackPane buttonPane = new StackPane();
		buttonPane.setPadding(new Insets(5));
		buttonPane.getChildren().add(calculateBtn);
		
		// button event handler
		calculateBtn.setOnAction(e -> calculateFutureValue());
		
		// create BorderPane and set zones
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(buttonPane);
		
		// create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 350, 165);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Value Calculator"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
	
	public void calculateFutureValue() {
		double investmentAmount = Double.parseDouble(investmentAmountFld.getText());
		double numberOfYears = Double.parseDouble(numberOfYearsFld.getText());
		double annualInterestRate = Double.parseDouble(annualInterestRateFld.getText());
		double futureValue = investmentAmount * (1 + numberOfYears * (annualInterestRate / 100));
		System.out.print(annualInterestRate);
		
		futureValueLbl.setText(String.format("$%.2f", futureValue));
	}

	public static void main(String[] args) {
		launch(args);
	}
}
