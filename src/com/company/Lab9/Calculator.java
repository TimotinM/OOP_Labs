package com.company.Lab9;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Calculator {

    public static void onAction(TextField numberOneField, TextField numberTwoField, TextField resultField, Button button) {
        button.setOnAction(actionEvent -> {
            try {
                Calculation(numberOneField, numberTwoField, resultField, button.getText());
            } catch (UnluckyException ex0) {
                resultField.setText(ex0.log);
            } catch (OperandException ex1) {
                resultField.setText(ex1.log);
            } catch (NumberFormatException ex2) {
                resultField.setText("Number Format Is Wrong!");
            }
        });
    }

    private static void Calculation(TextField num1, TextField num2, TextField result, String operand) throws UnluckyException, OperandException {
        float numberFloat1, numberFloat2, res;

        numberFloat1 = Float.parseFloat(num1.getText());
        numberFloat2 = Float.parseFloat(num2.getText());

        res = switch (operand) {
            case "+" -> numberFloat1 + numberFloat2;
            case "-" -> numberFloat1 - numberFloat2;
            case "*" -> numberFloat1 * numberFloat2;
            case "/" -> numberFloat1 / numberFloat2;
            default -> throw new OperandException();
        };

        if (res == 13.0) {
            throw new UnluckyException();
        }
        result.setText(String.valueOf(res));
    }

}
