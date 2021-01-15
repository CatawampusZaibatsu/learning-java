package application;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Program1 extends Application {
	private boolean taxable;
	private double shipping = 0;
	
	// text fields
	private TextField itemFld = new TextField();
	private TextField priceFld = new TextField();
	private TextField quantityFld = new TextField();
	
	// labels
	private Label totalLbl = new Label("N/A");
	
	// CheckBox
	private CheckBox chkTaxable = new CheckBox("Taxable?");
	
	// RadioButtons
	private RadioButton nextDayRB = new RadioButton("$20");
	private RadioButton thisWeekRB = new RadioButton("$12");
	private RadioButton someDayRB = new RadioButton("$5");
	
	// buttons
	private Button calculateBtn = new Button("Process");
	private Button resetBtn = new Button("Reset");
	
	@Override
	public void start(Stage primaryStage) {
		// labels
		Label itemLbl = new Label("Item: ");
		Label priceLbl = new Label("Price: ");
		Label quantityLbl = new Label("Quantity: ");
		Label shipingLbl = new Label("Shipping");
		Label nextDayLbl = new Label("Next Day ");
		Label thisWeekLbl = new Label("This Week ");
		Label someDayLbl = new Label("Some Day ");
		Label totalDueLbl = new Label("Total Due: ");
		
		// RadioButtons added to a ToggleGroup
		ToggleGroup shippingGroup = new ToggleGroup();
		nextDayRB.setToggleGroup(shippingGroup);
		thisWeekRB.setToggleGroup(shippingGroup);		
		someDayRB.setToggleGroup(shippingGroup);

		// GridPane Layout
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5));
		
		// labels layout in the grid pane
		GridPane.setHalignment(itemLbl, HPos.LEFT);
		pane.add(itemLbl, 0, 0);
		GridPane.setHalignment(priceLbl, HPos.LEFT);
		pane.add(priceLbl, 0, 1);
		GridPane.setHalignment(quantityLbl, HPos.LEFT);
		pane.add(quantityLbl, 0, 2);
		GridPane.setHalignment(shipingLbl, HPos.LEFT);
		pane.add(shipingLbl, 0, 4);
		GridPane.setHalignment(nextDayLbl, HPos.LEFT);
		pane.add(nextDayLbl, 0, 5); 
		GridPane.setHalignment(thisWeekLbl, HPos.LEFT);
		pane.add(thisWeekLbl, 0, 6); 
		GridPane.setHalignment(someDayLbl, HPos.LEFT);
		pane.add(someDayLbl, 0, 7); 
		GridPane.setHalignment(totalDueLbl, HPos.LEFT);
		pane.add(totalDueLbl, 0, 8);
		GridPane.setHalignment(totalLbl, HPos.LEFT);
		pane.add(totalLbl, 1, 8);
		
		// TextFields layout in the grid pane
		GridPane.setHalignment(itemFld, HPos.LEFT);
		pane.add(itemFld, 1, 0);
		GridPane.setHalignment(priceFld, HPos.LEFT);
		pane.add(priceFld, 1, 1);
		GridPane.setHalignment(quantityFld, HPos.LEFT);
		pane.add(quantityFld, 1, 2);
		
		// CheckBox layout in the grid pane
		pane.add(chkTaxable, 1, 3);
				
		// RadioButton layout in the grid pane
		GridPane.setHalignment(nextDayRB, HPos.LEFT);
		pane.add(nextDayRB, 1, 5);
		GridPane.setHalignment(thisWeekRB, HPos.LEFT);
		pane.add(thisWeekRB, 1, 6);
		GridPane.setHalignment(someDayRB, HPos.LEFT);
		pane.add(someDayRB, 1, 7);
		
		// button layout in StackPane
		HBox buttonPane = new HBox(5);
		buttonPane.setPadding(new Insets(1));
		buttonPane.getChildren().add(calculateBtn);
		buttonPane.getChildren().add(resetBtn);
		
		// CheckBox Logic
		chkTaxable.setOnAction(e -> {
			if (chkTaxable.isSelected()) {
				taxable = true;
			}
			else {
				taxable = false;
			}
		});
		
		
		// RadioButton Logic
		nextDayRB.setOnAction(e -> {
			if (nextDayRB.isSelected()) {
				shipping = 20;
			}
		});
		
		thisWeekRB.setOnAction(e -> {
			if (thisWeekRB.isSelected()) {
				shipping = 12;
			}
		});
		
		someDayRB.setOnAction(e -> { 
			if (someDayRB.isSelected()) {
				shipping = 5;
			}
		});
		
		// button event handler
		calculateBtn.setOnAction(e -> calculateTotal());
		resetBtn.setOnAction(e -> resetFields());
		
		// create BorderPane and set zones
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(buttonPane);
		
		// create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 275, 265);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Orinoco"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
	
	// calculates the total
	public void calculateTotal() {
		double price = Double.parseDouble(priceFld.getText());
		double quantity = Double.parseDouble(quantityFld.getText());
		double total;
	
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
		
		if (taxable) {
			total = price * quantity + shipping + ((price * quantity) * .07);	
		}
		else {
			total = price * quantity + shipping;
		}
		
		totalLbl.setText(currencyFormatter.format(total));
	}
	
	
	// resets all TextFields, CheckBoxs, and RadioButtons  
	public void resetFields() {
		itemFld.setText("");
		priceFld.setText("");
		quantityFld.setText("");
		chkTaxable.setSelected(false);
		nextDayRB.setSelected(false);
		thisWeekRB.setSelected(false);
		someDayRB.setSelected(false);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
