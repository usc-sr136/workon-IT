package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Main extends Application implements EventHandler<ActionEvent> {

    Button button;

    public static void main(String[]args){
        launch(args);
    }
    @Override
    public void start (Stage primaryStage)throws Exception {
        primaryStage.setTitle("Title of the window");
        button = new Button();
        button.setText("Touch me baby ooooo");
        button.setOnAction(this);


        //This is Anonymous inner class
       /* button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("i am Anonymous inner class");

            }
        });
        */

       //this class handle lambda expressions
       /*button.setOnAction(e ->){
            System.out.println("Hey i am your ex");
            System.out.println("Hey ugly face");

        }
        */

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
         System.out.println("ooooooooooooo i love this game");
        }

    }


}