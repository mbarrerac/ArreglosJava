package desafioArreglos;

public class Viistas {

	   public static void main(String[] visitas) {
	        System.out.println("Cantidad de argumentos: " + visitas.length);
	        boolean estado = true;
	        for (int i = 0; i < visitas.length; i++) {
	        	System.out.println("Argumento " + (i + 1) + ": " + visitas[i]);
	        	ValidaEntrada validaEntrada = new ValidaEntrada(visitas[i]);
		        estado = validaEntrada.revisacadena();
		        if (!estado) {
		        	System.out.println("Los parametros solo deben ser números");
		        	break;
		        }
	            
	        }
	        if (estado) {
		        double totalPromedio = promedios(visitas);
		        System.out.println("El promedio es: "+totalPromedio);	        	
	        }

	    }
      static double promedios(String[] recibo) {
    	  int sumatoria = 0;
    	  for (int i=0;i<=recibo.length-1;i++) {
    		  sumatoria += Integer.parseInt(recibo[i]);
    		  System.out.println("el arreglo es: "+recibo[i]);    		  
    	  }
    	  System.out.println("Total sumatoria de visitas: "+sumatoria);
    	  System.out.println("Cantidad de días: " + recibo.length);
    	  return (double) sumatoria/recibo.length;
      }
}
