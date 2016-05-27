import sintese.Oscilador;
import sintese.Som;

/** 
 * Constroi as condicoes basicas para a execucao do programa:<br>
 * que visa implementar os instrumentos especificados na 
 * <a href="http://cic.unb.br/~lcmm/cic-icsonica-2016-1/ics/trabalhos/t2/3instrumentosmusicv.png">imagem</a>,<br>
 * alem de possibilitar a execucao de melodias ou efeitos com tais intrumentos.
 * @author	Helio Santana
 * @author	Rodrigo Guimaraes
 * @version	1.0
 * @since	26/05/2016
 */

class Principal{   
   Oscilador o1;
      
   public Principal()
   { 
     o1 = new Oscilador(10, 180, 90);

     Som som = new Som(o1, 0.5f, "simples.wav");
     som.salvawave();
     som.tocawave();
   }
      
   public static void main(String args[]){
	   System.out.println("testando som!!\n");
	   new Principal();
	   
   }   
}