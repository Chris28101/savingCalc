package com.example.raceforfirstplace;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class savingCalcApplication {
    @FXML
    private Label calcText;
    @FXML
    private TextField txtItem;
    @FXML
    private TextField itemCost;
    @FXML
    private TextField numMonths;


    @FXML

    protected void onHelloButtonClick() {
        String getItem = txtItem.getText();
        double getCost = Double.parseDouble(itemCost.getText());
        double getMonth = Double.parseDouble(numMonths.getText());
        double perMonth = getCost / getMonth;
        calcText.setText("To buy a " + getItem + " you need to save " + "$" + perMonth + " per month ");
    }
}