
package program;

import static java.lang.Math.random;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;
import javafx.util.Duration;


public class Components3 {
    
    boolean heartIsCompleted = false;
    
    
    public Scene getScene3() {
        
        Group group = new Group();
        GridPane grid = new GridPane();
        group.getChildren().add(grid);
        
        Image heart1 = new Image("css/heart1.png");  
        ImageView heart1V = new ImageView(heart1);
        Image heart2 = new Image("css/heart222.png");  
        ImageView heart2V = new ImageView(heart2);
        
        Text mainText = new Text("Happy Valentine's Day!");
        mainText.setId("mainText");
        mainText.setVisible(false);
        
        ColumnConstraints column1 = new ColumnConstraints(125); 
        ColumnConstraints column2 = new ColumnConstraints(125); 
        ColumnConstraints column3 = new ColumnConstraints(125); 
        ColumnConstraints column4 = new ColumnConstraints(125); 
        grid.getColumnConstraints().addAll(column1, column2, column3, column4); 
        RowConstraints row1 = new RowConstraints(250); 
        RowConstraints row2 = new RowConstraints(150);
        RowConstraints row3 = new RowConstraints(100);
        grid.getRowConstraints().addAll(row1, row2, row3);
        
        //Scrollbar
        ScrollBar sb = new ScrollBar();
        grid.add(sb, 1, 2);
        grid.setColumnSpan(sb, 2);
        
        sb.setMin(0);
        sb.setMax(100);
        sb.setValue(100);
        sb.setOrientation(Orientation.HORIZONTAL);
       
        
        sb.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                    Number old_val, Number new_val) {
                heart2V.setTranslateX(new_val.doubleValue()-30);
                
                if (sb.getValue() >= 20 & sb.getValue() <= 30 ) {
                heartIsCompleted = true;
               
                    if (heartIsCompleted) {
        
            //ADD ANIMATION
            Image heart = new Image("css/fullheart.png");  
            ImageView heartV = new ImageView(heart);
            heartV.setFitHeight(20);
            heartV.setFitWidth(20);
            group.getChildren().add(heartV);
            
            ImageView heartV2 = new ImageView(heart);
            heartV2.setFitHeight(20);
            heartV2.setFitWidth(20);
            group.getChildren().add(heartV2);
            
            ImageView heartV3 = new ImageView(heart);
            heartV3.setFitHeight(20);
            heartV3.setFitWidth(20);
            group.getChildren().add(heartV3);
            
            ImageView heartV4 = new ImageView(heart);
            heartV4.setFitHeight(20);
            heartV4.setFitWidth(20);
            group.getChildren().add(heartV4);
            
           
            
    Timeline timeline = new Timeline();
    
    timeline.getKeyFrames().addAll(
        //first    
        new KeyFrame(Duration.ZERO, 
            new KeyValue(heartV.translateXProperty(), random() * 500),
            new KeyValue(heartV.translateYProperty(), 510)
        ),
        new KeyFrame(new Duration(4000), 
            new KeyValue(heartV.translateXProperty(), random() * 500),
            new KeyValue(heartV.translateYProperty(), -30)
        ),
        //second
        new KeyFrame(Duration.ZERO, 
            new KeyValue(heartV2.translateXProperty(), random() * 500),
            new KeyValue(heartV2.translateYProperty(), -30)
        ),
        new KeyFrame(new Duration(5000), 
            new KeyValue(heartV2.translateXProperty(), random() * 500),
            new KeyValue(heartV2.translateYProperty(), -30)
        ),
        //third
        new KeyFrame(Duration.ZERO, 
            new KeyValue(heartV3.translateXProperty(), random() * 500),
            new KeyValue(heartV3.translateYProperty(), -30)
        ),
        new KeyFrame(new Duration(6000), 
            new KeyValue(heartV3.translateXProperty(), random() * 500),
            new KeyValue(heartV3.translateYProperty(), -30)
        ),
        //fourth
        new KeyFrame(Duration.ZERO, 
            new KeyValue(heartV4.translateXProperty(), random() * 500),
            new KeyValue(heartV4.translateYProperty(), -30)
        ),
        new KeyFrame(new Duration(7000), 
            new KeyValue(heartV4.translateXProperty(), random() * 500),
            new KeyValue(heartV4.translateYProperty(), -30)
        )
        
    );
    
    timeline.setAutoReverse(false);
    timeline.setCycleCount(1);
    
     timeline.play();
     mainText.setVisible(true);
        
    }         
   }
  }
 });
        
        grid.add(mainText, 0, 0);
        GridPane.setHalignment(mainText, HPos.CENTER);    
        grid.setColumnSpan(mainText, 4);
        grid.add(heart1V, 1, 1);
        heart2V.setTranslateX(70);
      
        GridPane.setHalignment(mainText, HPos.CENTER);    
        grid.add(heart2V, 2, 1);
        
     
    grid.setAlignment(Pos.CENTER);    
    grid.setGridLinesVisible(false);
    Scene scene3 = new Scene(group, 500, 500);   
    
    
    Image image = new Image("css/cursor5.png");  
    scene3.setCursor(new ImageCursor(image));
    scene3.getStylesheets().add("css/scene3css.css");
    return scene3;
    }
    
}
