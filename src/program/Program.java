
package program;

import javafx.application.Application;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Program extends Application {
    
    Components c = new Components();
    
    @Override
    public void start(Stage primaryStage) {
       
        Scene scene = new Scene(c.getGrid(primaryStage), 500, 500);
        scene.getStylesheets().add("css/scene1css.css");
        Image image = new Image("css/cgif.gif");  
        scene.setCursor(new ImageCursor(image));
        
        primaryStage.setTitle("<3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
}
