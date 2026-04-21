/*
* File: MainController.java
* Author: Csorba Péter
* Copyright: 2026, Csorba Péter
* Group: Szoft I/N
* Date: 2026-04-21
* Github: https://github.com/Gunkhu
* Licenc: MIT
*/
package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField radius1Field;

    @FXML
    private TextField radius2Field;

    @FXML
    private TextField volumeField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    void startCalc(){
        double radius1 = Double.parseDouble(radius1Field.getText());
        double radius2 = Double.parseDouble(radius2Field.getText());
        double height = Double.parseDouble(heightField.getText());

        double volume = Solution.calcVolume(radius1, radius2, height);
        String roundedVolume = String.format("%.3f", volume);
        volumeField.setText((roundedVolume));
    }

}
