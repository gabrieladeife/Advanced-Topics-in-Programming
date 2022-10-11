/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
/**
 *
 * @author TJ
 */
public class Gabriel_Adeife_Lab5 extends Application {

    /**
     * @param args the command line arguments
     */
    
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Checkerboard");
        GridPane pane = new GridPane();
        pane.getColumnConstraints().add(new ColumnConstraints(60));
        pane.getRowConstraints().add(new RowConstraints(60));
        
        
        
        
        for(int i = 0;  i < 10; i++){
            for(int j = 0; j < 10; j++){
                if((i+j) % 2 == 1) {
                    pane.add(new Rectangle(60,60, Color.BLACK), i, j);
                }
                else{
                    pane.add(new Rectangle(60,60, Color.WHITE), i, j);
                }
            }
        }
        primaryStage.setScene(new Scene(pane, 600, 600));
        primaryStage.show(); // Display the stage
    }
    
    public static void main(String[] args) {
        Application.launch();
    }
}
  