package Controler;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class accueilControler {
	@FXML
	Button btnajouter1=new Button();
	@FXML
	Button btnajouter2 = new Button();
	
	@FXML
	Button btnajouter3=new Button();
	@FXML
	Button btnajouter4 = new Button();
	
	@FXML
	Button btnannuler = new Button();
	
	public void addStudent(){
		btnajouter1.setOnAction(e->{
			
			
				try{
					System.out.println("creation etudiant");
					Parent companyParent = FXMLLoader.load(getClass().getClassLoader().getResource("View/createStudentScene.fxml"));
					Scene companyScene = new Scene(companyParent);
					Stage companyStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
					companyStage.hide();
					companyStage.setScene(companyScene);
					companyStage.show();
				}catch(Exception ee){
					ee.printStackTrace();}});}
	 
  
   public void addCompany (){
	   btnajouter2.setOnAction(e->{
			
			
			try{
				System.out.println("Création d'entreprise");
				Parent companyParent = FXMLLoader.load(getClass().getClassLoader().getResource("View/createCompanyScene.fxml"));
				Scene companyScene = new Scene(companyParent);
				Stage companyStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				companyStage.hide();
				companyStage.setScene(companyScene);
				companyStage.show();
			}catch(Exception ee){
				ee.printStackTrace();}});}

   
   public void showOffre (){
	   btnajouter4.setOnAction(e->{
			
			
			try{
				System.out.println("Consulter les offres");
				Parent companyParent = FXMLLoader.load(getClass().getClassLoader().getResource("View/createStudentScene.fxml"));
				Scene companyScene = new Scene(companyParent);
				Stage companyStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				companyStage.hide();
				companyStage.setScene(companyScene);
				companyStage.show();
			}catch(Exception ee){
				ee.printStackTrace();}});}

   
   public void addOffre (){
	   btnajouter3.setOnAction(e->{
			
			
			try{
				System.out.println("Saisir un offre");
				Parent companyParent = FXMLLoader.load(getClass().getClassLoader().getResource("View/createOffreSce.fxml"));
				Scene companyScene = new Scene(companyParent);
				Stage companyStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
				companyStage.hide();
				companyStage.setScene(companyScene);
				companyStage.show();
			}catch(Exception ee){
				ee.printStackTrace();}});}

   
   public void annuler (){
	   btnannuler.setOnAction(e->{ System.exit(0);
   });}}
   

			
			
				