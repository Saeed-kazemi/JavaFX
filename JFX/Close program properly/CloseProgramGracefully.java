package Bucky;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CloseProgramGracefully extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("JavaFx-Close program gracefully");

        //when user wants to close the window , this line will invoke our method e->closeProgram()
        window.setOnCloseRequest(e-> {
            //consume the event
            e.consume();
            closeProgram();
        });

        button = new Button("Close program");
        button.setOnAction(e->closeProgram());


        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout,300,200);
        window.setScene(scene);
        window.show();

    }

    private void closeProgram(){
        Boolean answer = ConfirmBox.display("your title","Are you sure?");
        if (answer) window.close();

    }

}
