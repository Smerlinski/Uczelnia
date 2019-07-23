package application;

import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Control {
	
	int i = 0;

    @FXML
    private ImageView pole;

    @FXML
    private Button btn;

    @FXML
    private Label napis;

    @FXML
    void klik(ActionEvent event) throws FileNotFoundException {
    	
    	napis.setText("Obraz " + (i+1));    	
    	Image img = new Image(i + ".jpg");
    	pole.setImage(img);
    	i++;
    	
    	if(i==4) {
    		i = 0;
    		}
    	
    	}
}