/*
* File: MainModel.java
* Author: Fehér Mátyás
* Copyright: 2023, Fehér Mátyás
* Group: Szoft I 1 N
* Date: 2023-04-04
* Github: https://github.com/MatiasX/
* Licenc: GNU GPL
*/

package model;

public class MainModel {
    public double calcVolume(double testAtlo){
        double volume = (Math.pow(testAtlo, 3.)/(Math.pow(27., 1./2.)));
        return volume;
    }
}
