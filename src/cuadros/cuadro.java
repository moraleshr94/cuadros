package cuadros;

import java.math.BigDecimal;

public class cuadro {
	int intNumber;
	int decNumber;
	
	public void separeteDecimal(Double number)
	{
	    BigDecimal bd = new BigDecimal(String.valueOf(number));
	    BigDecimal iPart = new BigDecimal(bd.toBigInteger());
	    BigDecimal fPart = bd.remainder( BigDecimal.ONE );
	    
	    int en = Integer.valueOf(iPart.intValue());
	    double d = fPart.doubleValue();
	    double aux = d*100;
	    intNumber= en;
	    decNumber =(int)aux;
	    
	    //System.out.print("Int "+ intNumber); 
	    //System.out.print("Dec"+ decNumber); 
	    
	}
	
	public void drawSquares()
	{
		int items =0;
		int auxfrac=0;
		int restfrac=100-decNumber;
		System.out.print(" ");
		
		for(int i=0; i<11; i++){
			int aux=0;
			while(aux < intNumber){
				if(aux == 0 && i >= 1) {
						System.out.print("|"); //si es el primer cuadrado, entonces imprime la parte vertical derecha
						auxfrac=auxfrac+10;
					}
					
				for(int j=0; j<10; j++){
						if(i== 0 || i == 10 ) {
							System.out.print("__"); //Si es el primer o ultimo ciclo, entonces es la base o arriba, por lo tanto imprime guion bajo
							if(i== 10) items++; //Si es el ultimo ciclo, contar las unidades
							}
						else{
							System.out.print("  "); //Si no es el primer o ultimo ciclo, entonces es parte del centro, por lo tanto imprime espacio
							items++; //Contar unidades del centro
						}		
					}
				if(i==0){
					System.out.print(" "); //Si es el primer ciclo, es la parte de arriba, solo deja espacio
				}
				else{
					System.out.print("|"); //Imprime la parte vertical izquierda del cuadrado
				}
					aux++; //pasa al siguente cuadrado
				
			}
			if(auxfrac<restfrac){
				System.out.print("\n");
			}
			//Fraccion de cuadrado
			if(decNumber > 0)
				{
				if(auxfrac >= restfrac ){
					for(int l=0; l <10 ; l++ ){
						if(auxfrac == restfrac || auxfrac == 100){
							System.out.print("__");  	
							if(auxfrac == restfrac) items--; //Descuenta items de linea superior
						}
						else{
							System.out.print("  "); 		
						}
						items++;
					}
				if(auxfrac == restfrac){
					System.out.println(" ");
				}
				else{
					System.out.println("|");
				}
				}
			}
		}
		
	System.out.println("\nItems: " + items);
	}
}