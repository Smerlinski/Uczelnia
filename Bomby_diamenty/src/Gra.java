import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class Gra extends JFrame {
	int wynik = 0;
	int szanse = 20;
	public Gra() {
		Scanner user_input = new Scanner( System.in );
		String first_name;
		System.out.print("Podaj swoje imie: ");
		first_name = user_input.next( );
		setTitle("Bomby&Diamenty Gra: " + first_name);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JButton button1 = new JButton("Opcja pierwsza");
        JButton button2 = new JButton("Opcja druga");
        JTextArea info = new JTextArea();
        JLabel tekst = new JLabel("Pozosta³ych prób: 20 Wynik: 0",JLabel.CENTER);
        Container panel = getContentPane();
        panel.setLayout(new GridLayout(2, 2, 10, 10));        
        panel.add(button1);
        panel.add(button2);
        panel.add(info);
        panel.add(tekst);     
        setContentPane(panel);
        this.setVisible(true);
        
        button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				szanse--;
				Random rand=new Random();
				int x=rand.nextInt(2); 
				if(x%2==1) {
				info.setText("Gratulacje! To diament :)");
				wynik++;}
				else {
					info.setText("Niestety to bomba :(");
				}

			    tekst.setText("Pozosta³ych prób: "+ szanse + " Wynik: " + wynik);
			    if(szanse==0) {
		        	tekst.setText("Koniec gry! Twój wynik: " + wynik);
		        	button1.setEnabled(false);
		        	button2.setEnabled(false);
		        }
			
			}
		});
        
        button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				szanse--;
				Random rand=new Random(); 
				int x=rand.nextInt(2); 
				if(x%2==0) {
				info.setText("Gratulacje! To diament :)");
				wynik++;}
				else {
					info.setText("Niestety to bomba :(");
				}

			    tekst.setText("Pozosta³ych prób: "+ szanse + " Wynik: " + wynik);
			    if(szanse==0) {
		        	tekst.setText("Koniec gry! Twój wynik: " + wynik);
		        	button1.setEnabled(false);
		        	button2.setEnabled(false);
		        }
			
			}
		});
       
        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Gra();
	}

}
