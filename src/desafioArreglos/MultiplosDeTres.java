package desafioArreglos;

import java.util.ArrayList;

public class MultiplosDeTres {

	   public static void main(String[] pasos) {
	        System.out.println("Cantidad de argumentos: " + pasos.length);
	        
	        ArrayList<String> pasosList = new ArrayList<>();

	        for (String paso : pasos) {
	            pasosList.add(paso);
	        }
	        
	        //valido los parametros recibidos 
	        boolean estado = true;
	        for (int i = 0; i < pasosList.size(); i++) {
	        	System.out.println("Argumento " + (i + 1) + ": " + pasosList.get(i));
	        	ValidaEntrada validaEntrada = new ValidaEntrada(pasosList.get(i));
		        estado = validaEntrada.revisacadena();
		        if (!estado) {
		        	System.out.println("Los parametros solo deben ser números");
		        	break;
		        }
		        
	        }
	        if (estado) {
	        	System.out.println("\n Realizando la sumatoria y promedio para los multiplos de 3 \n "); 
	        	//llamo al metodo suma
		        double totalSuma = suma(pasosList);
		        
	        	//llamo al metodo promedio
		        double totalPromedio = promedio(pasosList);
		        //Despliego la suma
		        System.out.println("Total sumatoria de multiplos de 3: "+totalSuma);
		        //Despliego el promedio
		        System.out.println("el pomedio de multiplos de 3: "+totalPromedio);			        
	        }

	    }
    static double suma(ArrayList<String> recibo) {
     
  	  int sumatoria = 0;
  	  for (int i=0;i<=recibo.size()-1;i++) {
   		  if (Integer.parseInt(recibo.get(i))%3==0) {
   	  		  sumatoria += Integer.parseInt(recibo.get(i));
  	   		  System.out.println("Número considerado en sumatoria y promedio: "+recibo.get(i));    	  			  
  		  }
  	  }
	 
  	  return (double) sumatoria;
    }
    static double promedio(ArrayList<String> recibo) {
     	  int sumatoria = 0,cantidad=0;
     	  for (int i=0;i<=recibo.size()-1;i++) {
     		 
     		  if (Integer.parseInt(recibo.get(i))%3==0) {
      	  		  sumatoria += Integer.parseInt(recibo.get(i));
      	  		  cantidad++;
     		  }
     	  }
   	 
     	  return (double) sumatoria/cantidad;
       }
}
