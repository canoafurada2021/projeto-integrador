package controle;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class LogControle implements Initializable {
	 @FXML
	    private Button btnLogin;

	    @FXML
	    private ImageView imgCar;

	    @FXML
	    private Label lblOla;

	    @FXML
	    private Label lblSenha;

	    @FXML
	    private Label lblUser;

	    @FXML
	    private AnchorPane pnlLog;

	    @FXML
	    private TextField txtSenha;

	    @FXML
	    private TextField txtUser;

	    @FXML
	    void onLog(ActionEvent event) {

	    }

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) { //trabalhar configuraç~eos inicias da tela nesse método aqui 
			
			// TODO Auto-generated method stub
			
		}

}
