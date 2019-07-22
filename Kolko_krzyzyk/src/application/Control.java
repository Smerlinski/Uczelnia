package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class Control {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;
    
    @FXML
    private Label okno;
    
    @FXML
    private Button btnRes;
    
    int counter = 0;
    
    @FXML
    void click(ActionEvent event) {
    		okno.setText("Nastêpny ruch: X");
    		Button b = (Button) event.getSource();
    		if(b.getText()=="") {
    		if(counter%2==0) {
    			b.setText("X");
    			okno.setText("Nastêpny ruch: o");
    			}
    		else {
    			b.setText("o");
    			okno.setText("Nastêpny ruch: X");
    			}
    		
    		if(counter == 8) {
    			okno.setText("Remis"); Koniec();
    		}
    		if(btn1.getText()=="X"&&btn2.getText()=="X"&&btn3.getText()=="X") {
    			okno.setText("Wygrana: X"); Koniec();
    		}
    		if(btn1.getText()=="o"&&btn2.getText()=="o"&&btn3.getText()=="o") {
    			okno.setText("Wygrana: o"); Koniec();
    		}
    		if(btn4.getText()=="X"&&btn5.getText()=="X"&&btn6.getText()=="X") {
    			okno.setText("Wygrana: X"); Koniec();
    		}
    		if(btn4.getText()=="o"&&btn5.getText()=="o"&&btn6.getText()=="o") {
    			okno.setText("Wygrana: o"); Koniec();
    		}
    		if(btn7.getText()=="X"&&btn8.getText()=="X"&&btn9.getText()=="X") {
    			okno.setText("Wygrana: X"); Koniec();
    		}
    		if(btn7.getText()=="o"&&btn8.getText()=="o"&&btn9.getText()=="o") {
    			okno.setText("Wygrana: o"); Koniec();
    		}
    		if(btn1.getText()=="X"&&btn4.getText()=="X"&&btn7.getText()=="X") {
    			okno.setText("Wygrana: X"); Koniec();
    		}
    		if(btn1.getText()=="o"&&btn4.getText()=="o"&&btn7.getText()=="o") {
    			okno.setText("Wygrana: o"); Koniec();
    		}
    		if(btn2.getText()=="X"&&btn5.getText()=="X"&&btn8.getText()=="X") {
    			okno.setText("Wygrana: X"); Koniec();
    		}
    		if(btn2.getText()=="o"&&btn5.getText()=="o"&&btn8.getText()=="o") {
    			okno.setText("Wygrana: o"); Koniec();
    		}
    		if(btn3.getText()=="X"&&btn6.getText()=="X"&&btn9.getText()=="X") {
    			okno.setText("Wygrana: X"); Koniec();
    		}
    		if(btn3.getText()=="o"&&btn6.getText()=="o"&&btn9.getText()=="o") {
    			okno.setText("Wygrana: o"); Koniec();
    		}
    		if(btn1.getText()=="X"&&btn5.getText()=="X"&&btn9.getText()=="X") {
    			okno.setText("Wygrana: X"); Koniec();
    		}
    		if(btn1.getText()=="o"&&btn5.getText()=="o"&&btn9.getText()=="o") {
    			okno.setText("Wygrana: o"); Koniec();
    		}
    		if(btn3.getText()=="X"&&btn5.getText()=="X"&&btn7.getText()=="X") {
    			okno.setText("Wygrana: X"); Koniec();
    		}
    		if(btn3.getText()=="o"&&btn5.getText()=="o"&&btn7.getText()=="o") {
    			okno.setText("Wygrana: o"); Koniec();
    		}
    		
    		counter++;
    		}
    		else {
    			if((counter-1)%2==0) {
        			okno.setText("Nastêpny ruch: o");
        			}
        		else {
        			okno.setText("Nastêpny ruch: X");
        			}
    		}    		
    	
    }
    @FXML
    void Reset(ActionEvent event) {
    	okno.setText("Nastêpny ruch: X");
    	btn1.setText(""); btn1.setDisable(false);
    	btn2.setText(""); btn2.setDisable(false);
    	btn3.setText(""); btn3.setDisable(false);
    	btn4.setText(""); btn4.setDisable(false);
    	btn5.setText(""); btn5.setDisable(false);
    	btn6.setText(""); btn6.setDisable(false);
    	btn7.setText(""); btn7.setDisable(false);
    	btn8.setText(""); btn8.setDisable(false);
    	btn9.setText(""); btn9.setDisable(false);
    	counter = 0;
    }
    
    void Koniec() {
    	btn1.setDisable(true);
    	btn2.setDisable(true);
    	btn3.setDisable(true);
    	btn4.setDisable(true);
    	btn5.setDisable(true);
    	btn6.setDisable(true);
    	btn7.setDisable(true);
    	btn8.setDisable(true);
    	btn9.setDisable(true);
    }

}