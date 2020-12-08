package Bucky;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Alert Box");

        button = new Button("Click me");
        button.setOnAction(e -> {
           boolean result =  ConfirmBox.display("Title of windows", " your message ?");
           System.out.println(result);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene =  new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();




    }
}
