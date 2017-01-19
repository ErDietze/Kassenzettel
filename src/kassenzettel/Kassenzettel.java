/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kassenzettel;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Teilnehmer
 */
public class Kassenzettel extends Application {
    
    Stage window;
    Button button;
    Scene scene;
    
    int stueck1 = 1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        window = primaryStage;
        window.setTitle("Warenkorb");
        
        GridPane grid = new GridPane();
//        grid.autosize();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(30, 30, 30, 30));

//         die DropDown Menüs werden einzeln erstellt
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("0", "1", "2", "3", "4", "5");
        choiceBox.setValue("0");
        grid.add(choiceBox, 0, 1);
        
        ChoiceBox<String> choiceBox1 = new ChoiceBox<>();
        choiceBox1.getItems().addAll("0", "1", "2", "3", "4", "5");
        choiceBox1.setValue("0");
        grid.add(choiceBox1, 0, 2);
        
        ChoiceBox<String> choiceBox2 = new ChoiceBox<>();
        choiceBox2.getItems().addAll("0", "1", "2", "3", "4", "5");
        choiceBox2.setValue("0");
        grid.add(choiceBox2, 0, 3);
        
        ChoiceBox<String> choiceBox3 = new ChoiceBox<>();
        choiceBox3.getItems().addAll("0", "1", "2", "3", "4", "5");
        choiceBox3.setValue("0");
        grid.add(choiceBox3, 0, 4);
        
        ChoiceBox<String> choiceBox4 = new ChoiceBox<>();
        choiceBox4.getItems().addAll("0", "1", "2", "3", "4", "5");
        choiceBox4.setValue("0");
        grid.add(choiceBox4, 0, 5);
        
        ChoiceBox<String> choiceBox5 = new ChoiceBox<>();
        choiceBox5.getItems().addAll("0", "1", "2", "3", "4", "5");
        choiceBox5.setValue("0");
        grid.add(choiceBox5, 0, 6);
        
        ChoiceBox<String> choiceBox6 = new ChoiceBox<>();
        choiceBox6.getItems().addAll("0", "1", "2", "3", "4", "5");
        choiceBox6.setValue("0");
        grid.add(choiceBox6, 0, 7);

        // Artikel werden hinzugefügt
        Label milch = new Label("Milch");
        grid.add(milch, 1, 1);
        Label butter = new Label("Butter");
        grid.add(butter, 1, 2);
        Label zigaretten = new Label("Zigaretten:");
        grid.add(zigaretten, 1,3);
        Label essig = new Label("Essig");
        grid.add(essig, 1, 4);
        Label schokolade = new Label("Schokolade");
        grid.add(schokolade, 1, 5);
        Label mehl = new Label("Mehl");
        grid.add(mehl, 1, 6);
        Label bier = new Label("Bier");
        grid.add(bier, 1, 7);

        // neuer Button wird erstellt
        button = new Button("Gesamt");
        grid.add(button, 2, 9);
        
        button.setOnAction(e -> getChoice(choiceBox));
//        VBox layout = new VBox(10);
//        layout.setPadding(new Insets(20, 20, 20, 20));
//        layout.getChildren().addAll(choiceBox,userName,choiceBox1,choiceBox2,choiceBox3,choiceBox6,button);
        scene = new Scene(grid, 400, 350);
        window.setScene(scene);
        window.show();
        
    }
    
    public void getChoice(ChoiceBox<String> choiceBox) {
        String amount = choiceBox.getValue() ;
        System.out.println(amount);
    }
    //zu hause
    
    
    
}
