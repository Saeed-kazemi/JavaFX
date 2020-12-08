package Bucky;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {

    public static void display(String title, String message){
        Stage window = new Stage();

        //block user interactions with other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("AlertBox");
        window.setMinWidth(300);

        //label and button
        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("Close the window");
        closeButton.setOnAction(e-> window.close());

        //layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,closeButton);

        // set alignment
        layout.setAlignment(Pos.CENTER);

        //Create scene and add to stage
        Scene scene = new Scene(layout);
        window.setScene(scene);
        //window.show();
        window.showAndWait();







    }

}
