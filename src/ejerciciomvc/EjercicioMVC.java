/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomvc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author hquiroga
 */
public class EjercicioMVC extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox();
        vbox.getChildren().add(getMenuBar());
        
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private MenuBar getMenuBar(){
        Menu fileMenu = new Menu("File");
        Menu settingsMenu = new Menu("Settings");
        
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem display = new MenuItem("Display");
        
        
        fileMenu.getItems().add(open);
        fileMenu.getItems().add(save);
        settingsMenu.getItems().add(display);
        
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(fileMenu);
        menuBar.getMenus().add(settingsMenu);
        return menuBar;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
