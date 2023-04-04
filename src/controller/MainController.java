/*
* File: MainController.java
* Author: Fehér Mátyás
* Copyright: 2023, Fehér Mátyás
* Group: Szoft I 1 N
* Date: 2023-04-04
* Github: https://github.com/MatiasX/
* Licenc: GNU GPL
*/
package controller;

import javafx.scene.control.Button;
import model.MainModel;
import view.MainPanel;

public class MainController {
    MainPanel mainPanel;  
    MainModel mainModel;

    public MainController(){
        this.mainPanel = new MainPanel();
        this.mainModel = new MainModel();
        this.handleEvent();
    }

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    public void handleEvent(){
        Button calcButton=this.mainPanel.getButtonPanel().getCalcButton();
        calcButton.setOnAction(e -> {
            double spaceDiagonal=Double.parseDouble(this.mainPanel.getSpaceDiagonalPanel().getValue());
            double volume=this.mainModel.calcVolume(spaceDiagonal);
            mainPanel.getVolumePanel().setValue(String.valueOf(volume));
        });
    }
}
