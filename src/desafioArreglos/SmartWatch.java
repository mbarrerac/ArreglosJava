package desafioArreglos;
import java.util.ArrayList;

public class SmartWatch {

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
	        	//llamo al metodo promedio y remuevo los que no cumplen
		        double totalPromedio = clearSteps(pasosList);
		        //Despliego el promedio
		        System.out.println("El promedio es: "+totalPromedio);	        	
	        }

	    }
     static double clearSteps(ArrayList<String> recibo) {
      System.out.println("\n Removiendo registros y cualculando promedio \n "); 
   	  int sumatoria = 0;
   	  for (int i=0;i<=recibo.size()-1;i++) {
   		  int cantidadPasos = Integer.parseInt(recibo.get(i));
   		  if (cantidadPasos < 200 || cantidadPasos >100000) {
   			  //remuevo
   			  recibo.remove(i);
   			  i--;
   		  }else {
   	  		  sumatoria += cantidadPasos;
   	   		  System.out.println("Pasos considerado en sumatoria: "+recibo.get(i));    	  			  
   		  }
   	  }
   	  System.out.println("Total sumatoria de pasos: "+sumatoria);
   	  System.out.println("Cantidad de días: " + recibo.size());
   	  return (double) sumatoria/recibo.size();
     }
}