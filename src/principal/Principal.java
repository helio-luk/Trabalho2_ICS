/*	Pacote ao qual pertence */
package principal;

/*	Importando Classes necessárias */
import sintese.Curva;

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

public class Principal{
	static Curva funcao1 = null;
	
   /**
    * Inicia a execucao de todo o programa
    * @param args Parametros passados via linha de comando
    */
	public static void main(String args[]){
		System.out.println("testando som rodrigo!!\n");
		new Principal();	   
	}

	public Principal() {
		/*	Criando curva com resolução de 720 pontos,
		 *	que servirá para todos os instrumentos */
		funcao1 = new Curva (720);
		funcao1.addPonto (0f,	0f);
		funcao1.addPonto (20f,	300f);
		funcao1.addPonto (680f,	300f);
		funcao1.addPonto (720f,	0f);
   }
}