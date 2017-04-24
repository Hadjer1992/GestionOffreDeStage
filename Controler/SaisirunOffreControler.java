package Controler;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import Metier.Connexion;
import Metier.Entreprise;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class SaisirunOffreControler  {
	@FXML
	TextField NomE;
	@FXML
	TextField Domain;
	@FXML
	TextField Libell;
	@FXML
	TextField Dated;
	@FXML
	TextField Dur;
	@FXML
	TextArea Desc;
	@FXML
	Button btnajouter=new Button();
	@FXML
	Button btnannuler = new Button();
	
	
	Connection connection;
	@SuppressWarnings("null")
	public void ajouteroffre(){
		btnajouter.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			
		
			Alert dialogC = new Alert(AlertType.CONFIRMATION);
   		 dialogC.setTitle("A confirmation ");
   		 dialogC.setHeaderText(null);
   		 dialogC.setContentText("confirmation");
   		 Optional<ButtonType> answer = dialogC.showAndWait();
   		 if (answer.get() == ButtonType.OK) {	
			PreparedStatement st =null;
			
			connection = (Connection) Connexion.connection();

			try {

				Class.forName("com.mysql.jdbc.Driver");
				System.out.print("ok");
			}catch (Exception e1) {
				System.out.println("no");
			}
   			
		try {
			String sql =" INSERT INTO `offredestage`(`id`, `nomE`, `domaine`, `titre`, `description`, `datedebut`, `duree`, `placedispo`) "
					+ " VALUES (NULL,'" + NomE.getText() +"','" + Domain.getText() +"','" + Libell.getText() +"','" + Desc.getText() +"','" + Dated.getText() +"' ,'" + Dur.getText() +"', '1')";
			st = (PreparedStatement)connection.prepareStatement(sql);
			st.executeUpdate();	  
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}finally{}
   			 
   		 
   		 }
   		 else {
   			 NomE.setText("");
 			Domain.setText("");
 			//fill.setText("");
 			//lvl.setText("");
   		
   		 }
	
			}});


}

     public void annuleroffre(){
    	
    	 
    		btnannuler.setOnAction(new EventHandler<ActionEvent>() {
    			
    			@Override
    			public void handle(ActionEvent arg0) {
    				// TODO Auto-generated method stub
    				System.exit(0);

}
    		});}
}
