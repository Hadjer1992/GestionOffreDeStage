package View;

import Controler.CreationEntrepriseContoler;
import Controler.CreationEtudiantControler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	static CreationEtudiantControler ce = new CreationEtudiantControler();
	static CreationEntrepriseContoler cn = new CreationEntrepriseContoler();

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			//Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("View/createStudentScene.fxml"));
			Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("View/createCompanyScene.fxml"));
			//Scene scene = new Scene(root,700,700);
			Scene scene = new Scene(root,650,400);
		//	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
