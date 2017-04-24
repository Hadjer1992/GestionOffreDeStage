package Controler;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

import com.mysql.jdbc.PreparedStatement;

import Metier.Connexion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

public class CreationEntrepriseContoler {
	@FXML
	TextField NomE;
	@FXML
	TextField Rue;
	@FXML
	TextField code;
	@FXML
	TextField Ville;
	@FXML
	TextField mail;
	@FXML
	TextField tel;
	@FXML
	TextField secteur;
	@FXML
	TextField motpass;
	@FXML
	Button btnajouter=new Button();
	@FXML
	Button btnannuler = new Button();
	@FXML
	ImageView  company;
	Connection connection;
	
	

	
	@SuppressWarnings("null")
	public void ajout(){
		btnajouter.setOnAction(e->{
			Alert dialogC = new Alert(AlertType.CONFIRMATION);
	   		 dialogC.setTitle("A confirmation ");
	   		 dialogC.setHeaderText(null);
	   		 dialogC.setContentText("Ajouter entreprise ?");
	   		 Optional<ButtonType> answer = dialogC.showAndWait();
	   		 if (answer.get() == ButtonType.OK) {
			
	   			PreparedStatement st =null;
				//cn = (Connection) connexion.connection();
				connection = (Connection) Connexion.connection();

			try {

				Class.forName("com.mysql.jdbc.Driver");
				


				
				
				System.out.print("ok");
			}catch (Exception e1) {
				System.out.println("no");
			}
			
			
		try {
			
			
			
			String sql =" INSERT INTO entreprise (`id`, `name`, `passwrd`, `tel`, `mail`, `ville`, `rue`, `postale`, `domaine) VALUES (NULL,'"+ NomE.getText() +"','"+ motpass.getText() +"','" + tel.getText() +"','" + Rue.getText() +"','" + code.getText() +"','" + secteur.getText() +"','" + tel.getText() +"','" + mail.getText() +"')";
			st = (PreparedStatement)connection.prepareStatement(sql);			 
			st.executeUpdate();
						 
						 
			
		 
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}finally{}
	   		 }
		else {
			NomE.setText("");
			Ville.setText("");
			Rue.setText("");
			secteur.setText("");
			tel.setText("");
			code.setText("");
			mail.setText("");
  		 }
	
	
});


}

     public void annuler(){
    	
    	 
    	 btnannuler.setOnAction(e->{ NomE.setText("");
			Ville.setText("");
			Rue.setText("");
			secteur.setText("");
			tel.setText("");
			code.setText("");
			mail.setText("");
			
		
	
	

});}
     }
