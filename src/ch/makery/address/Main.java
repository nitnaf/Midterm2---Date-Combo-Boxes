package ch.makery.address;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private Stage primaryStage;
	private AnchorPane dateComboBoxesUI;
	
	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Customer Information");
      
        // Somehow Load Months and Years comboBoxes
        
        showDateComboBoxesUI();
    }

	public void showDateComboBoxesUI(){
		
	    try {
	        
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("view/DateComboBoxesUI.fxml"));
	        dateComboBoxesUI = (AnchorPane) loader.load();

	       
	        Scene scene = new Scene(dateComboBoxesUI);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
