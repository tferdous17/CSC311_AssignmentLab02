package com.example.csc311_lab02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Lab2Controller {
    // FXML fields such as buttons and text fields
    @FXML
    public Button calculateBtn;
    @FXML
    public TextField annualInterestTextField;
    @FXML
    public TextField numYearsTextField;
    @FXML
    public TextField loanAmtTextField;
    @FXML
    public TextField monthlyPayTextField;
    @FXML
    public TextField totalPayTextField;


    @FXML
    public void onCalculateButtonClick(ActionEvent actionEvent) {
        // Store the values that are entered into the interest rate, num years, and loan amt textboxes
        double annualInterest = Double.parseDouble(annualInterestTextField.getText());
        int numYears = Integer.parseInt(numYearsTextField.getText());
        int loanAmt = Integer.parseInt(loanAmtTextField.getText());

        // Calculate monthly pay using formula: Monthly Payment = (P * r) / n
        // P = loan amt, r = annual interest rate, n = number of payments per year
        // On btn click, set monthly pay textbox to display the amount
        double monthlyPay = loanAmt * ((annualInterest / 100) / 12);
        monthlyPayTextField.setText("$" + monthlyPay);

        // Total payment = loan amount + the monthly pay across total num of months (12 * numYears)
        // Text box will display the amount
        double totalPayment = loanAmt + (monthlyPay * (numYears * 12));
        totalPayTextField.setText("$" + totalPayment);
    }
}