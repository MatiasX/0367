/*
* File: MainPanel.java
* Author: Fehér Mátyás
* Copyright: 2023, Fehér Mátyás
* Group: Szoft I 1 N
* Date: 2023-04-04
* Github: https://github.com/MatiasX/
* Licenc: GNU GPL
*/
package view;

import com.github.suli2022.inputlib.ButtonPanel;
import com.github.suli2022.inputlib.InputPanel;
import com.github.suli2022.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainPanel extends VBox {
    TitlePanel adatok;
    TitlePanel titlePanel;
    InputPanel spaceDiagonalPanel;
    ButtonPanel buttonPanel;
    InputPanel volumePanel;

    public MainPanel() {
        this.titlePanel = new TitlePanel();
        this.spaceDiagonalPanel = new InputPanel();
        this.buttonPanel = new ButtonPanel();
        this.volumePanel = new InputPanel();
        this.adatok = new TitlePanel();

        this.titlePanel.setText("Kocka térfogat számító alkalmazás");
        this.spaceDiagonalPanel.setText("A kocka testátlója");
        this.buttonPanel.setCalcButtonText("Számítás");
        this.volumePanel.setText("Eredmény:");

        this.getChildren().add(this.titlePanel);
        this.getChildren().add(this.spaceDiagonalPanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.volumePanel);
        this.getChildren().add(this.adatok);
    }

    public TitlePanel getTitlePanel() {
        return titlePanel;
    }

    public InputPanel getSpaceDiagonalPanel() {
        return spaceDiagonalPanel;
    }

    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }

    public InputPanel getVolumePanel() {
        return volumePanel;
    }
}
