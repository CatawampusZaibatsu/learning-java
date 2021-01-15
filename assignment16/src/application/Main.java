package application;
	
import java.sql.*;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Main extends Application {
	Stage window;
	TableView<Product> table;

	public static void main(String[] args) {
		launch(args);	
	}
	
    @SuppressWarnings("unchecked")
	@Override
    public void start(Stage stage) {
    	window = stage;
    	window.setTitle("MySQL Java Application");
    	
    	// vim Column
    	TableColumn<Product, String> vimColumn = new TableColumn<>("VIN");
    	vimColumn.setMinWidth(75);
    	vimColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("vin"));
    	
    	// make column
    	TableColumn<Product, String> makeColumn = new TableColumn<>("MAKE");
    	makeColumn.setMinWidth(100);
    	makeColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("make"));

    	// model column
    	TableColumn<Product, String> modelColumn = new TableColumn<>("MODEL");
    	modelColumn.setMinWidth(100);
    	modelColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("model"));
    	
    	// year column
    	TableColumn<Product, String> yearColumn = new TableColumn<>("YEAR");
    	yearColumn.setMinWidth(100);
    	yearColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("year"));
    	
    	// color column
    	TableColumn<Product, String> colorColumn = new TableColumn<>("COLOR");
    	colorColumn.setMinWidth(100);
    	colorColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("color"));
    	
    	// color column
    	TableColumn<Product, String> priceColumn = new TableColumn<>("PRICE");
    	priceColumn.setMinWidth(100);
    	priceColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("price"));

    	
    	// create table using ObservableList and add columns
    	table = new TableView<>();
    	table.setItems(sqlQueryToList("color"));
    	table.getColumns().addAll(vimColumn, makeColumn, modelColumn, yearColumn, colorColumn, priceColumn);
    	
    	// create label for color selector and a combobox to hold color strings in a drop down list
    	Label colorLabel = new Label("Color: ");
    	ObservableList<String> colors = FXCollections.observableArrayList(
    			"any color",
    			"silver",
    			"red",
    			"black",
    			"white",
    			"blue",
    			"green"
    			);
    	ComboBox<String> colorsBox = new ComboBox<String>(colors);
    	
    	// creates a search button then adds label, comboBox, and search button to an HBox
    	Button searchButton = new Button("Search");
     	HBox hBox = new HBox(colorLabel, colorsBox, searchButton);
     	
     	// event handler - when search is clicked change the string passed into sqlQueryToList() which changes the where statement in the sql
     	searchButton.setOnAction(e -> {
     		String searchColor;
     		if (colorsBox.getValue() == "any color" || colorsBox.getValue() == null) {
     			searchColor = "color";
     		}
     		else {
     			searchColor = "'" + colorsBox.getValue() + "'";
     		}
     		
     		table.setItems(sqlQueryToList(searchColor));
     	});
     	
     	// VBox to hold hBox and table
    	VBox vBox = new VBox();
    	vBox.getChildren().addAll(hBox, table);
    	
    	// create scene and show window
    	Scene scene = new Scene(vBox);
    	window.setScene(scene);
    	window.show();
    }
	
	
    // Creates and returns an observableList from an SQL Query
	public ObservableList<Product> sqlQueryToList(String color) {
		ObservableList<Product> products = FXCollections.observableArrayList();
		// Create connection to MySQL Database
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/example", "jaorr", "sesame");
			System.out.println("Database Queried");
			
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select vin, make, model, year, color, price from product where color = " + color);
			
			// loops through resultSet creating a Product object for each row
			while (resultSet.next()) {
				products.add(new Product(
						resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getString(3),
						Integer.parseInt(resultSet.getString(4)),
						resultSet.getString(5),
						Double.parseDouble(resultSet.getString(6))
						));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// return the ObservableList, this gets passed into the TableView.
		return products;
	}
}

