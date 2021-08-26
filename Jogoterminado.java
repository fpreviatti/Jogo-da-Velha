import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


import javax.swing.*;


import java.awt.Dimension;
import java.awt.event.ActionEvent;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class Jogoterminado extends JPanel implements ActionListener{
    private JMenuBar jcomp1;
    private JButton jcomp2;
    private JButton jcomp3;
    private JButton jcomp4;
    private JButton jcomp5;
    private JButton jcomp6;
    private JButton jcomp7;
    private JButton jcomp8;
    private JButton jcomp9;
    private JButton jcomp10;
    private JButton jcomp11;
    private JButton jcomp12;
    
	int inicio = 1,
	ganhou = 0,
	cont2 = 0,
	vet1[] = new int[8];
	boolean cont = false,
	cont3 = false,
	cont4 = true,
	comp = true,
	pare = false;
	
	
	
	
	
	String letra = "a";
    
    JMenuItem iniciar_jogoItem;
    JMenuItem _x_2Item;
    JMenuItem _x_comItem;
    JMenuItem sairItem;
    JMenuItem sobreItem;

    public Jogoterminado() {
        //construct preComponents
        JMenu jogoMenu = new JMenu ("Jogo");
        iniciar_jogoItem = new JMenuItem ("Iniciar Jogo");
        jogoMenu.add (iniciar_jogoItem);
        _x_2Item = new JMenuItem ("1 x 2");
        jogoMenu.add (_x_2Item);
        _x_comItem = new JMenuItem ("1 x COM");
        jogoMenu.add (_x_comItem);
        sairItem = new JMenuItem ("Sair");
        jogoMenu.add (sairItem);
        JMenu helpMenu = new JMenu ("Ajuda");
        sobreItem = new JMenuItem ("Sobre");
        helpMenu.add (sobreItem);

        //construct components
        
        jcomp1 = new JMenuBar();
        jcomp1.add (jogoMenu);
        jcomp1.add (helpMenu);
        jcomp2 = new JButton ("2");
        jcomp3 = new JButton ("3");
        jcomp4 = new JButton ("4");
        jcomp5 = new JButton ("5");
        jcomp6 = new JButton ("6");
        jcomp7 = new JButton ("7");
        jcomp8 = new JButton ("8");
        jcomp9 = new JButton ("9");
        jcomp10 = new JButton ("10");
        jcomp11 = new JButton ("Iniciar Jogo");
        jcomp12 = new JButton ("Sair");

        //adjust size and set layout
        setPreferredSize (new Dimension (199, 270));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);

        //set component bounds (only needed by Absolute Positioning)
        
        jcomp1.setBounds (0, 0, 80, 25);
        jcomp2.setBounds (5, 30, 60, 60);
        jcomp3.setBounds (5, 95, 60, 60);
        jcomp4.setBounds (5, 160, 60, 60);
        jcomp5.setBounds (70, 30, 60, 60);
        jcomp6.setBounds (70, 95, 60, 60);
        jcomp7.setBounds (70, 160, 60, 60);
        jcomp8.setBounds (135, 30, 60, 60);
        jcomp9.setBounds (135, 95, 60, 60);
        jcomp10.setBounds (135, 160, 60, 60);
        jcomp11.setBounds (0, 245, 100, 20);
        jcomp12.setBounds (100, 245, 100, 20);
        
        jcomp2.addActionListener(this);
        jcomp3.addActionListener(this);
        jcomp4.addActionListener(this);
        jcomp5.addActionListener(this);
        jcomp6.addActionListener(this);
        jcomp7.addActionListener(this);
        jcomp8.addActionListener(this);
        jcomp9.addActionListener(this);
        jcomp10.addActionListener(this);
        jcomp11.addActionListener(this);
        jcomp12.addActionListener(this);
                
        iniciar_jogoItem.addActionListener(this);
        _x_2Item.addActionListener(this);
        _x_comItem.addActionListener(this);
        sairItem.addActionListener(this);
        sobreItem.addActionListener(this);

    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Jogoterminado());
        frame.pack();
        frame.setVisible (true);
    }
    
     
	
    public void actionPerformed(ActionEvent arg0) {
		Object obj = arg0.getSource();
		
		 
		 if (cont == false ){
			letra = "O";
			
		 }else{
			letra = "X";
		 }
		 
		 if (comp == true){
		  if (cont == true){
	    	 cont = false;
	    	 
	      }else {
	    	 cont = true;
	      }
		 }
	  
		
		
		if (obj == _x_2Item){
			reset ();
			comp = true;
			JOptionPane.showMessageDialog(null, "Player 1 contra Player 2!");
			
		}
		
		//codigo controle computador
		
		if (obj == _x_comItem){
			comp = false;
			JOptionPane.showMessageDialog(null, "Player 1 contra a máquina!");
			reset ();
		}	
		  
	
		
		
		
		
		
		//fim do computador
		
		
		
		
		
		


	     
	     
	
				
	//Botões iniciam o jogo.

				
		 if (obj == iniciar_jogoItem ){

			 reset ();
					

		 }else if (obj == jcomp11){

			 reset();
			 
			 
	//Botões fecham o jogo.		 
					
		 }else if (obj == jcomp12){
			 System.exit(0);
				
		 }else if (obj == sairItem){
			 System.exit(0);	 
			
		 }
	 	
			
		 
		 
		 else if (obj == sobreItem){
			 JOptionPane.showMessageDialog(null, "Desenvolvido por Fábio Previatti.");
	     }
	     
	 	
	     
	    
			
	   if (inicio == 1){
		   JOptionPane.showMessageDialog(null, "Inicie o jogo!");
			   
	   }else if (inicio == 0){			
		

			
	    
		   if (obj == jcomp2){
		     jcomp2.setText(this.letra);
		     jcomp2.setEnabled(false);
		     
		     if (comp == false){
		    	 aleatorio ();
		    	 
		    	 if (cont == true){
			    	 cont = false;
			    	 
			    }else {
			    	 cont = true;
			    }
		    	  
		     }
		    
		     	     

			
		   }else if (obj == jcomp3){
		     jcomp3.setText(this.letra);
		     jcomp3.setEnabled(false);
		     if (comp == false){
		    	 aleatorio ();
		    	 
		    	 if (cont == true){
			    	 cont = false;
			    	 
			    }else {
			    	 cont = true;
			    }
		     }

			
		   }else if (obj == jcomp4){
		     jcomp4.setText(this.letra);
		     jcomp4.setEnabled(false);
		     if (comp == false){
		    	 aleatorio ();
		    	 
		    	 if (cont == true){
			    	 cont = false;
			    	 
			    }else {
			    	 cont = true;
			    }
		    	 
		     }

			
		   }else if (obj == jcomp5){
		     jcomp5.setText(this.letra);
		     jcomp5.setEnabled(false);
		     if (comp == false){
		    	 aleatorio ();
		    	 
		    	 if (cont == true){
			    	 cont = false;
			    	 
			    }else {
			    	 cont = true;
			    }
		     }

			
	   	   }else if (obj == jcomp6){
		     jcomp6.setText(this.letra);
		     jcomp6.setEnabled(false);
		     if (comp == false){
		     	 aleatorio ();
		     	
		     	 if (cont == true){
			    	 cont = false;
			    	 
			    }else {
			    	 cont = true;
			    }
		     }		
		     	 
		   }else if (obj == jcomp7){
		     jcomp7.setText(this.letra);
		     jcomp7.setEnabled(false);
		     if (comp == false){
		    	 aleatorio ();
		    	 
		    	 if (cont == true){
			    	 cont = false;
			    	 
			    }else {
			    	 cont = true;
			    }
		     }
		    	 
		   }else if (obj == jcomp8){
		     jcomp8.setText(this.letra);
		     jcomp8.setEnabled(false);
		     if (comp == false){
		    	 aleatorio ();
		    	 
		    	 if (cont == true){
			    	 cont = false;
			    	 
			    }else {
			    	 cont = true;
			    }
		     }
		    	 
		   }else if (obj == jcomp9){
		     jcomp9.setText(this.letra);
		     jcomp9.setEnabled(false);
		     if (comp == false){
		    	 aleatorio ();
		    	 
		    	 if (cont == true){
			    	 cont = false;
			    	 
			    }else {
			    	 cont = true;
			    }
		     }
		     
		   }else if (obj == jcomp10){
		     jcomp10.setText(this.letra);
		     jcomp10.setEnabled(false);
		     if (comp == false){
		    	 aleatorio ();
		    	 
		    	 if (cont == true){
			    	 cont = false;
			    	 
			    }else {
			    	 cont = true;
			    }
		     }
			
		   }
		   vencedor ();
	     


	   }
	   

	   

	   
		
	}
    
	 public void stop (){
		 
		 if(jcomp2.getText() != "" && jcomp3.getText() != "" && jcomp4.getText() != "" && jcomp5.getText() != 
		    "" && jcomp6.getText() != "" && jcomp7.getText() != "" &&  jcomp8.getText() != "" && jcomp9.getText() != 
		    "" && jcomp10.getText() != ""  ){
			 
			 pare = true;
			 
	     }
	 }
    
    public void aleatorio (){
		
    	vencedor ();
    	
    	
    	
    	int i = 0;
    	
    	if (cont == true){
	    	 cont = false;
	    	 
	    }else {
	    	 cont = true;
	    }
    	
    	if (cont == false ){
			letra = "O";
			
		}else{
			letra = "X";
		}
    	

    	
    	while (i == 0  ){
    		
		int random = (int) (Math.random()*9);
    	
    	
    	if (random == 0){
    		if (jcomp2.isEnabled()== true){
    		jcomp2.setText(this.letra);
		    jcomp2.setEnabled(false);
		    i = 1;
    		}
    		
    	}else if (random == 1){
        	if (jcomp3.isEnabled()== true){
        	jcomp3.setText(this.letra);
    		jcomp3.setEnabled(false);
    		i = 1;
    		
        	}
    	}else if (random == 2){
        	if (jcomp4.isEnabled()== true){
        	jcomp4.setText(this.letra);
    		jcomp4.setEnabled(false);
    		i = 1;
    		
        	}
    	}else if (random == 3){
        	if (jcomp5.isEnabled()== true){
        	jcomp5.setText(this.letra);
    		jcomp5.setEnabled(false);
    		i = 1;
    		
        	}
    	}else if (random == 4){
        	if (jcomp6.isEnabled()== true){
        	jcomp6.setText(this.letra);
    		jcomp6.setEnabled(false);
    		i = 1;
    		
        	}
    	}else if (random == 5){
        	if (jcomp7.isEnabled()== true){
        	jcomp7.setText(this.letra);
    		jcomp7.setEnabled(false);
    		i = 1;
    		
        	}
    	}else if (random == 6){
        	if (jcomp8.isEnabled()== true){
        	jcomp8.setText(this.letra);
    		jcomp8.setEnabled(false);
    		i = 1;
    		
        	}
    	}else if (random == 7){
        	if (jcomp9.isEnabled()== true){
        	jcomp9.setText(this.letra);
    		jcomp9.setEnabled(false);
    		i = 1;
    		
        	}
    	}else if (random == 8){
        	if (jcomp10.isEnabled()== true){
        	jcomp10.setText(this.letra);
    		jcomp10.setEnabled(false);
    		i = 1;
    		
        	}
    	}
    	if(jcomp2.getText() != "" && jcomp3.getText() != "" && jcomp4.getText() != "" && jcomp5.getText() != 
			    "" && jcomp6.getText() != "" && jcomp7.getText() != "" &&  jcomp8.getText() != "" && jcomp9.getText() != 
			    "" && jcomp10.getText() != ""  ){
		i = 1;
		
		}if (ganhou == 1){
			i = 1;
		}
    	
			
		    	
    	
        }  
    	
    	
    	
    }

    

	public void reset (){
	  
	 jcomp2.setText("");
	 jcomp3.setText("");
	 jcomp4.setText("");
	 jcomp5.setText("");
	 jcomp6.setText("");
	 jcomp7.setText("");
	 jcomp8.setText("");
	 jcomp9.setText("");
	 jcomp10.setText("");
	 
	 
	 jcomp2.setEnabled(true);
	 jcomp3.setEnabled(true);
	 jcomp4.setEnabled(true);
	 jcomp5.setEnabled(true);
	 jcomp6.setEnabled(true);
	 jcomp7.setEnabled(true);
	 jcomp8.setEnabled(true);
	 jcomp9.setEnabled(true);
	 jcomp10.setEnabled(true);
	 inicio = 0;
	 cont2 = 0;
	 cont = false;
	 cont3 = false;
	 ganhou = 0;
	 
			 
	   //Se 'cont' = 'false', o Player 1 será "O". Se for 'true', será "X".


	}
	
	
	 public void vencedor (){
	    	
	    	
	    	
	 	   if( jcomp2.getText() == jcomp8.getText() && jcomp5.getText() == jcomp8.getText() && jcomp2.getText() != ""){
				
	 		    EnabledOn ();
	 		    ganhou = 1;
	 		  
	 			if (cont3 == true){
	 				if (jcomp2.getText() == "X"){
	 			       JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 			    }else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 			    }
	 			
	 			}else{
	 				if (jcomp2.getText() == "X"){
	 				    JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 				}else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 				}   
	 				
	 				
	 			}
	 			
	 		    
	 		}
	 		else if(jcomp3.getText() == jcomp6.getText() && jcomp6.getText() == jcomp9.getText() && jcomp3.getText() != ""){
	 			
	 			EnabledOn ();
	 			ganhou = 1;
	 			
	 			if (cont3 == true){
	 				if (jcomp3.getText() == "X"){
	 			       JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 			    }else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 			    }
	 				
	 			}else{
	 				if (jcomp3.getText() == "X"){
	 				    JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 				}else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 				}   
	 				
	 				
	 			}

	 		}
	 		else if(jcomp4.getText() == jcomp7.getText() && jcomp7.getText() == jcomp10.getText() && jcomp4.getText() != ""){
	 			
	 			EnabledOn ();
	 			ganhou = 1;
	 			
	 			if (cont3 == true){
	 				if (jcomp4.getText() == "X"){
	 			       JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 			    }else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 			    }
	 				
	 			}else{
	 				if (jcomp4.getText() == "X"){
	 				    JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 				}else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 				}   
	 				
	 				
	 			}
	 		}
	 		        
	 		
	 		else if(jcomp2.getText() == jcomp3.getText() && jcomp3.getText() == jcomp4.getText() && jcomp2.getText() != ""){
	 			
	 			EnabledOn ();
	 			ganhou = 1;
	 			
	 			if (cont3 == true){
	 				if (jcomp2.getText() == "X"){
	 			       JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 			    }else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 			    }
	 				
	 			}else{
	 				if (jcomp2.getText() == "X"){
	 				    JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 				}else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 				}   
	 				
	 				
	 			}
	 		}
	 		else if(jcomp5.getText() == jcomp6.getText() && jcomp6.getText() == jcomp7.getText() && jcomp5.getText() != ""){
	 			
	 			EnabledOn ();
	 			ganhou = 1;
	 			
	 			if (cont3 == true){
	 				if (jcomp5.getText() == "X"){
	 			       JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 			    }else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 			    }
	 				
	 			}else{
	 				if (jcomp5.getText() == "X"){
	 				    JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 				}else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 				}   
	 				
	 				
	 			}
	 		}
	 		else if(jcomp8.getText() == jcomp9.getText() && jcomp9.getText() == jcomp10.getText() && jcomp8.getText() != ""){
	 			
	 			EnabledOn ();
	 			ganhou = 1;
	 			
	 			if (cont3 == true){
	 				if (jcomp8.getText() == "X"){
	 			       JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 			    }else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 			    }
	 				
	 			}else{
	 				if (jcomp8.getText() == "X"){
	 				    JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 				}else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 				}   
	 				
	 				
	 			}
	 		}
	 		        
	 	
	 		else if(jcomp2.getText() == jcomp6.getText() && jcomp6.getText() == jcomp10.getText() && jcomp2.getText() != ""){
	 			
	 			EnabledOn ();
	 			ganhou = 1;
	 			
	 			if (cont3 == true){
	 				if (jcomp2.getText() == "X"){
	 			       JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 			    }else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 			    }
	 				
	 			}else{
	 				if (jcomp2.getText() == "X"){
	 				    JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 				}else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 				}   
	 				
	 				
	 			}
	 		}
	 		else if(jcomp8.getText() == jcomp6.getText() && jcomp6.getText() == jcomp4.getText() && jcomp8.getText() != ""){
	 			
	 			EnabledOn ();
	 			ganhou = 1;
	 			
	 			if (cont3 == true){
	 				if (jcomp8.getText() == "X"){
	 			       JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 			    }else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 			    }
	 				
	 			}else{
	 				if (jcomp8.getText() == "X"){
	 				    JOptionPane.showMessageDialog(null, "Player 2 venceu!");
	 				}else{ 
	 				   JOptionPane.showMessageDialog(null, "Player 1 venceu!");
	 				}   
	 				
	 				
	 			}
	 		}else if(jcomp2.getText() != "" && jcomp3.getText() != "" && jcomp4.getText() != "" && jcomp5.getText() != 
				    "" && jcomp6.getText() != "" && jcomp7.getText() != "" &&  jcomp8.getText() != "" && jcomp9.getText() != 
				    "" && jcomp10.getText() != ""  ){
	 			JOptionPane.showMessageDialog(null, "Não houve vencedor");
	 		}
	    	
	    	  
	    	
	    	
	    	
	    	
	    }
	 public void EnabledOn (){
		 
	  jcomp2.setEnabled(false);
	  jcomp3.setEnabled(false);
	  jcomp4.setEnabled(false);
	  jcomp5.setEnabled(false);
	  jcomp6.setEnabled(false);
	  jcomp7.setEnabled(false);
	  jcomp8.setEnabled(false);
	  jcomp9.setEnabled(false);
	  jcomp10.setEnabled(false);
	  
	  
		
	 }

	     
}
		
