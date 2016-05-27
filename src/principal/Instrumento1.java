/*	Pacote ao qual pertence */
package principal;

/*	Importando Classes necessárias */
import sintese.Alea;
import sintese.Envoltoria;
import sintese.Oscilador;

/** 
 * Constroi o primeiro instrumento especificado na 
 * <a href="http://cic.unb.br/~lcmm/cic-icsonica-2016-1/ics/trabalhos/t2/3instrumentosmusicv.png">imagem</a>,<br>
 * alem de possibilitar a execucao de melodias ou efeitos com tais intrumentos.
 * @author	Helio Santana
 * @author	Rodrigo Guimaraes
 * @version	1.0
 * @since	26/05/2016
 */

public class Instrumento1 {
	Envoltoria envoltoria1;
	Alea ruido1;
	Oscilador oscilador1;
	
	/**
	 *	Construcao do instrumento de maneira default
	 */
	public Instrumento1(){
		/*	Configurando a curva da envoltória como sendo a
		 *	recém-criada */
		envoltoria1.setCURVA(Principal.funcao1);
		
		ruido1 = new Alea(envoltoria1);
		
		oscilador1 = new Oscilador(ruido1);		
	}
}
