package Bucky;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox{

    static boolean answer;

        public static boolean display(String title, String message){

            Stage window = new Stage();

            //block user interactions with other windows
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("AlertBox");
            window.setMinWidth(300);

            //label and button
            Label label = new Label();
            label.setText(message);

            //create 2 buttons
            Button yesBt = new Button("Yes");
            Button noBt = new Button("No");

            //adding functionality
            yesBt.setOnAction(e ->{
                answer = true;
                window.close();

            } );

            noBt.setOnAction(e ->{
                answer = false;
                window.close();

            } );


            //layout
            VBox layout = new VBox(10);
            layout.getChildren().addAll(label,yesBt,noBt);

            // set alignment
            layout.setAlignment(Pos.CENTER);

            //Create scene and add to stage
            Scene scene = new Scene(layout);
            window.setScene(scene);
            //window.show();
            window.showAndWait();

            return answer;
        }

}
