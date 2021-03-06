package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Optional;

import Metier.Connexion;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class CreationEtudiantControler {
	@FXML
	TextField Nom;
	@FXML
	TextField prenom;
	@FXML
	TextField fill;
	@FXML
	TextField lvl;
	@FXML
	PasswordField pass;
	@FXML
	TextField mail;
	@FXML
	TextField tel;
    @FXML
	Button btnajouter=new Button();
	@FXML
	Button btnannuler = new Button();
	@FXML
	ImageView  students;
	Connection connection;
	
	//@SuppressWarnings("null")
	public void ajout(){
		btnajouter.setOnAction(e->{
			Alert dialogC = new Alert(AlertType.CONFIRMATION);
   		 dialogC.setTitle("A confirmation ");
   		 dialogC.setHeaderText(null);
   		 dialogC.setContentText("confirmation");
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
			String sql =" INSERT INTO etudiant (`id`, `name`, `passwrd`, `tel`, `mail`, `firstName`, `fill`, `lvl`) VALUES (NULL,'" + Nom.getText() +"','" + pass.getText() +"','" + tel.getText() +"','" + mail.getText() +"','" + prenom.getText() +"','" + fill.getText() +"','" + lvl.getText()+"')";
			st = (PreparedStatement)connection.prepareStatement(sql);
			st.executeUpdate();	 
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}finally{}
   			 
   		 
   		 }
   		 else {
   			 Nom.setText("");
 			prenom.setText("");
 			fill.setText("");
 			lvl.setText("");
   		
   		 }
	
});


}

     public void annuler(){
    	
    	 
    	 btnannuler.setOnAction(e->{ Nom.setText("");
			prenom.setText("");
			fill.setText("");
			lvl.setText("");
    		 
	});
	

}
	
}
