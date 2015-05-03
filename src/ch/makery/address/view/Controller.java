package ch.makery.address.view;

import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class Controller implements Initializable {
	
	@FXML
	private ComboBox monthBox;
	
	@FXML
	private ComboBox dayBox;
	
	@FXML
	private ComboBox yearBox;
	
	private void loadMonths(){
		
		ObservableList<String> months = 
			    FXCollections.observableArrayList(
			        "January",
			        "February",
			        "March",
			        "April",
			        "May",
			        "June",
			        "July",
			        "August",
			        "September",
			        "October",
			        "November",
			        "December");
		
		monthBox.setItems(months);
	}
	
	private boolean leapYear(){
		
		boolean leapYear = ((Integer.parseInt(yearBox.getValue().toString()) % 4 == 0) && (Integer.parseInt(yearBox.getValue().toString()) % 100 != 0) || (Integer.parseInt(yearBox.getValue().toString()) % 400 == 0));
		return leapYear;
	}

	@FXML
	private void loadDays() {

		ObservableList<String> days28 = FXCollections.observableArrayList("1",
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28");

		ObservableList<String> days29 = FXCollections.observableArrayList("1",
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29");

		ObservableList<String> days30 = FXCollections.observableArrayList("1",
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30");

		ObservableList<String> days31 = FXCollections.observableArrayList("1",
				"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
				"14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
				"24", "25", "26", "27", "28", "29", "30", "31");

		if (monthBox.getValue().toString().equals("February")) {

			if (yearBox.getValue().equals(null)) {

				monthBox.setItems(days29);

			} else {

				if (leapYear()) {

					monthBox.setItems(days29);

				} else {

					monthBox.setItems(days28);
				}
			}

			if (monthBox.getValue().toString().equals("January")) {
				monthBox.setItems(days31);
			}
			if (monthBox.getValue().toString().equals("March")) {
				monthBox.setItems(days31);
			}
			if (monthBox.getValue().toString().equals("May")) {
				monthBox.setItems(days31);
			}
			if (monthBox.getValue().toString().equals("July")) {
				monthBox.setItems(days31);
			}
			if (monthBox.getValue().toString().equals("August")) {
				monthBox.setItems(days31);
			}
			if (monthBox.getValue().toString().equals("October")) {
				monthBox.setItems(days31);
			}
			if (monthBox.getValue().toString().equals("December")) {
				monthBox.setItems(days31);
			} else {
				monthBox.setItems(days30);
			}

		}
	}
	
	public void loadYear(){
	ObservableList<String> years = FXCollections.observableArrayList("2015");
	yearBox.setItems(years);	
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		loadYear();
		loadMonths();
		//loadDays();
		
	}
	
	

}
