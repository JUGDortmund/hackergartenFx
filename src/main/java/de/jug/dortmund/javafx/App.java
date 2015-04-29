package de.jug.dortmund.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{


	@Override
	public void start(Stage stage){
		StackPane root = new StackPane();
		stage.setTitle("Hallo Word");
		stage.setScene(new Scene(root));
		stage.show();
	}

 }
