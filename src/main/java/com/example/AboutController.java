/*
* File: AboutController.java
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

public class AboutController {

    @FXML
    void goMainSceneButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

}
