package View;


import Controler.accueilControler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	
	static accueilControler home = new accueilControler();

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("View/Home.fxml"));
			
			Scene scene = new Scene(root,700,700);
		
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
