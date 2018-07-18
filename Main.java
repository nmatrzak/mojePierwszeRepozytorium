package application;
	


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Main extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	private Object swich;
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Window.fxml"));
		// to lub to poniżej
		//loader.setLocation(Main.class.getResource("Window.fxml"));
		AnchorPane okno = (AnchorPane) loader.load();
		Scene scene = new Scene(okno, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Okno nr 1");
		primaryStage.show();
		
		Controller controller = loader.getController();
		controller.setParameter();
	
		
	}
	
}
