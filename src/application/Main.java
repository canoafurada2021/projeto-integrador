package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//configurando alguns dados da tela 
			primaryStage.setTitle("Login");
			primaryStage.resizableProperty().setValue(Boolean.FALSE);
			
			// carregar arquivo da tela scenebuilder
			FXMLLoader loader = new FXMLLoader(getClass().getResource("visao/telaLogin.fxml"));
			Parent arquivoXML = loader.load();
			
			
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
