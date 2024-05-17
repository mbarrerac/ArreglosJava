package desafioArreglos;

public class ValidaEntrada {
     String cadena;
     boolean estadoDevuelto = true;
	 ValidaEntrada(String llegaCadena) {
		this.cadena = llegaCadena;
	     
	}
     boolean revisacadena() {
 	    for (int j = 0; j < cadena.length(); j++) 
 	    {
  	    	if (cadena.charAt(j) != '-') {
 		         if (cadena.charAt(j) < '0' || cadena.charAt(j) > '9') {
 		        	estadoDevuelto = false; 
 		            break; 
 		        }	    		
 	    	}
	    }
	    return estadoDevuelto; 
     }

}
