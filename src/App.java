/*
* File: App.java
* Author: Fehér Mátyás
* Copyright: 2023, Fehér Mátyás
* Group: Szoft I 1 N
* Date: 2023-04-04
* Github: https://github.com/MatiasX/
* Licenc: GNU GPL
*/
import controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Szoft I 1 N\nFehér Mátyás\n2023-04-04");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        MainController mainController = new MainController();
        Scene scene = new Scene(mainController.getMainPanel(), 250, 200);
        stage.setScene(scene);
        stage.show();

    }
}
