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
        if (getItem.isEmpty() || itemCost.getText().isEmpty() || numMonths.getText().isEmpty()) {
            calcText.setText("complete the form dont leave anything blank");
        }
        else{
            itemCost.getText();
            double getCost = Double.parseDouble(itemCost.getText());

            numMonths.getText();
            double getMonth = Double.parseDouble(numMonths.getText());



            double perMonth = getCost / getMonth;
            calcText.setText("To buy a " + getItem + " you need to save " + "$" + perMonth + " per month ");
        }

    }

}