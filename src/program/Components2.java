
package program;

import java.security.SecureRandom;
import java.util.ArrayList;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Components2 {
    
    
    Components3 c3 = new Components3();
    
    public Scene getScene2(Stage primaryStage) {
    
        GridPane grid = new GridPane();
        
        Button door1 = new Button();
        Button door2 = new Button();
        Button door3 = new Button();
        
        
        Text txt = new Text("pick a door.");
        txt.setId("txt");
        
        FadeTransition ft = new FadeTransition(Duration.millis(800), txt);
        ft.setFromValue(1.0);
        ft.setToValue(0.1);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();
        
        
        GridPane.setHalignment(txt, HPos.CENTER);
        
        door1.setMaxSize(180, 180);
        door2.setMaxSize(180, 180);
        door3.setMaxSize(180, 180);
         
        
        //hidden next button
        Button hehe = new Button("hehe");
        hehe.setId("hehe");
        GridPane.setHalignment(hehe, HPos.CENTER);
        
        Image nextB = new Image("css/picsart.png");
        ImageView nextBV = new ImageView(nextB);
        nextBV.setFitHeight(200);
        nextBV.setPreserveRatio(true);
        hehe.setGraphic(nextBV);
        hehe.setMaxSize(200, 200);
        
        hehe.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e) {
                primaryStage.setScene(c3.getScene3());
            }
        }
        );
        
        ArrayList<Button> arraylist = new ArrayList<Button>();
        arraylist.add(0, door1);
        arraylist.add(1, door2);
        arraylist.add(2, door3);
        SecureRandom rand = new SecureRandom();
        int index = rand.nextInt(arraylist.size());
        
        if (index == 0) {
            grid.add(hehe, 0, 1);
            hehe.setTranslateX(25);
           
        } else if (index == 1) {
            grid.add(hehe, 1, 1);
            hehe.setTranslateX(25);
            
        } else if (index == 2) {
            grid.add(hehe, 2, 1);
            hehe.setTranslateX(25);
            
        }
        
        
        //Adding doors after the hidden button so that it overlaps
        grid.add(txt, 1, 0);
        grid.add(door1, 0, 1);
        grid.add(door2, 1, 1);
        grid.add(door3, 2, 1);
        
        ColumnConstraints column1 = new ColumnConstraints(140); 
        ColumnConstraints column2 = new ColumnConstraints(140); 
        ColumnConstraints column3 = new ColumnConstraints(140); 
        grid.getColumnConstraints().addAll(column1, column2, column3); 
        RowConstraints row1 = new RowConstraints(20); 
        RowConstraints row2 = new RowConstraints(180);
        grid.getRowConstraints().addAll(row1, row2);
        
        Image imgdoor1 = new Image("css/closed_door_wobg.png");
        ImageView imgVdoor1 = new ImageView(imgdoor1);
        imgVdoor1.setFitHeight(170);
        imgVdoor1.setPreserveRatio(true);
        door1.setGraphic(imgVdoor1);
        
        Image imgdoor2 = new Image("css/closed_door_wobg.png");
        ImageView imgVdoor2 = new ImageView(imgdoor2);
        imgVdoor2.setFitHeight(170);
        imgVdoor2.setPreserveRatio(true);
        door2.setGraphic(imgVdoor2);
        
        Image imgdoor3 = new Image("css/closed_door_wobg.png");
        ImageView imgVdoor3 = new ImageView(imgdoor3);
        imgVdoor3.setFitHeight(170);
        imgVdoor3.setPreserveRatio(true);
        door3.setGraphic(imgVdoor3);
        
        Image imgdoor1_open = new Image("css/open_door_wobg.png");
        ImageView imgVopen1 = new ImageView(imgdoor1_open);
        imgVopen1.setFitHeight(170);
        imgVopen1.setPreserveRatio(true);
       
        Image imgdoor2_open = new Image("css/open_door_wobg.png");
        ImageView imgVopen2 = new ImageView(imgdoor2_open);
        imgVopen2.setFitHeight(170);
        imgVopen2.setPreserveRatio(true);
        
        Image imgdoor3_open = new Image("css/open_door_wobg.png");
        ImageView imgVopen3 = new ImageView(imgdoor3_open);
        imgVopen3.setFitHeight(170);
        imgVopen3.setPreserveRatio(true);
        
        
        door1.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e) {
                door1.setGraphic(imgVopen1);
                door1.setMouseTransparent(true);
            }
        }
        );
        
        door2.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e) {
                door2.setGraphic(imgVopen2);
                door2.setMouseTransparent(true);
            }
        }
        );
        
        door3.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e) {
                door3.setGraphic(imgVopen3);
                door3.setMouseTransparent(true);
            }
        }
        );
        
        
        
    grid.setVgap(50);     
    grid.setAlignment(Pos.CENTER);    
    grid.setGridLinesVisible(false);
   
    
    final Scene scene2 = new Scene(grid, 500, 500);
    
    Image image = new Image("css/cc2.png");  
    scene2.setCursor(new ImageCursor(image));
    
    scene2.getStylesheets().add("css/scene2css.css");
    return scene2;
    }
    
}
