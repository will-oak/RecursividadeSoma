package view;
import javax.swing.JOptionPane;

import controller.SomaController;

public class Principal {

	public static void main (String[] args) {
		
		
	    int numsoma;
	    SomaController dc = new SomaController();
	    
	    do {
	    	numsoma = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número da Soma",JOptionPane.QUESTION_MESSAGE));
	    }   while (numsoma <= 0 || numsoma > 12 );{
	    	   		    }
	    
	    
	    
	    int fat = dc.soma(numsoma);
		System.out.println(fat);
		
	}

}