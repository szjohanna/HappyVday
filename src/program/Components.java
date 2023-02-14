
package program;

import static java.lang.Math.random;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Components {
    int counter = 0;
    Components2 c = new Components2();
  
    public GridPane getGrid(Stage primaryStage) {
    
        GridPane grid = new GridPane();
        Button button = new Button();
        Image cloud = new Image("css/cloud4.png");
        ImageView cloudV = new ImageView(cloud);
        cloudV.setFitHeight(75);
        cloudV.setPreserveRatio(true);
        button.setGraphic(cloudV);
        
       
    
    //if cursor gets close, move + condition
    button.setOnMouseEntered(new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouseEvent) {                
            
            button.setOnMousePressed(new EventHandler<MouseEvent>() {
            
            @Override
            public void handle(MouseEvent event) {
                
                primaryStage.setScene(c.getScene2(primaryStage));
            }
        });
            
                if (counter <= 10) {
                getTimeline(button);
                }  
                else if (counter > 10 & counter <= 20) {
                    
                    getSlowerTimeline(button);  
              
                } else if (counter > 20) {
                    
                    getEvenSlowerTimeline(button);
                }
            counter += 1;
            
            
        }
    });
    
    grid.getChildren().add(button);
    return grid;
    }
    
public Timeline getTimeline(Button button) {
    
         //ANIMATION
        Timeline timeline = new Timeline();
       
    timeline.getKeyFrames().addAll(
        new KeyFrame(Duration.ZERO, 
            new KeyValue(button.translateXProperty(), random() * 450),
            new KeyValue(button.translateYProperty(), random() * 450)
        ),
        new KeyFrame(new Duration(500), 
            new KeyValue(button.translateXProperty(), random() * 450),
            new KeyValue(button.translateYProperty(), random() * 450)
        )
    );
   
    timeline.setAutoReverse(false);
    timeline.setCycleCount(1);
    timeline.play();
    return timeline;
} 

public Timeline getSlowerTimeline(Button button) {
    
         //ANIMATION
        Timeline timeline = new Timeline();
       
    timeline.getKeyFrames().addAll(
        new KeyFrame(Duration.seconds(2), 
            new KeyValue(button.translateXProperty(), random() * 450),
            new KeyValue(button.translateYProperty(), random() * 450)
        ),
        new KeyFrame(new Duration(500), 
            new KeyValue(button.translateXProperty(), random() * 450),
            new KeyValue(button.translateYProperty(), random() * 450)
        )
    );
   
    timeline.setAutoReverse(false);
    timeline.setCycleCount(1);
    timeline.play();
    return timeline;
} 

public Timeline getEvenSlowerTimeline(Button button) {
    
         //ANIMATION
        Timeline timeline = new Timeline();
       
    timeline.getKeyFrames().addAll(
        new KeyFrame(Duration.seconds(3), 
            new KeyValue(button.translateXProperty(), random() * 450),
            new KeyValue(button.translateYProperty(), random() * 450)
        ),
        new KeyFrame(new Duration(500), 
            new KeyValue(button.translateXProperty(), random() * 450),
            new KeyValue(button.translateYProperty(), random() * 450)
        )
    );
   
    timeline.setAutoReverse(false);
    timeline.setCycleCount(1);
    timeline.play();
    return timeline;
} 
    
}
