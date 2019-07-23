package application;

import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Control {

    @FXML
    private TextField imie;

    @FXML
    private TextField nazwisko;

    @FXML
    private TextField wiek;

    @FXML
    private Button dodaj;

    @FXML
    private Button wydruk;

    @FXML
    private ChoiceBox<?> wybor;
    
    List<Pacjent> list = new ArrayList<>();
    int number = 0;
    
    @FXML
    void dodawanie(ActionEvent event) {
    	number=number+1;
    	Pacjent p1 = new Pacjent(imie.getText(),nazwisko.getText(),Integer.parseInt(wiek.getText()), number);
    	list.add(p1);
    	imie.setText("");
    	nazwisko.setText("");
    	wiek.setText("");
    }

    @FXML
    void wydrukowywanie(ActionEvent event) {
    	
    	if(wybor.getValue().equals("Kolejnosci dodania")) {
    		System.out.println("Sortowanie po dodaniu:");
    		Collections.sort(list, Pacjent.PorownanieId);

      	   for(Pacjent str: list){
      			System.out.println(str);
      	   }
    	}
    	
    	if(wybor.getValue().equals("Imienia")) {
        	System.out.println("Sortowanie po imieniu:");
        	Collections.sort(list, Pacjent.PorownanieImienia);

     	   for(Pacjent str: list){
     			System.out.println(str);
     	   }
        }
    	
    	if(wybor.getValue().equals("Nazwiska")) {
        	System.out.println("Sortowanie po nazwisku:");
        	Collections.sort(list, Pacjent.PorownanieNazwiska);

      	   for(Pacjent str: list){
      			System.out.println(str);
      	   }
        }
    	
    	if(wybor.getValue().equals("Wieku")) {
        	System.out.println("Sortowanie po wieku:");
        	Collections.sort(list, Pacjent.PorownanieWieku);

      	   for(Pacjent str: list){
      			System.out.println(str);
      	   }
        }

    }

}
