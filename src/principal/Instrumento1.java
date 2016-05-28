/*	Pacote ao qual pertence */
package principal;

/*	Importando Classes necessárias */
import sintese.Envoltoria;
import sintese.Oscilador;
import sintese.Ruido;
import sintese.Som;

/** 
 * Constroi o primeiro instrumento especificado na 
 * <a href="http://cic.unb.br/~lcmm/cic-icsonica-2016-1/ics/trabalhos/t2/3instrumentosmusicv.png">imagem</a>,<br>
 * alem de possibilitar a execucao de melodias ou efeitos com tais intrumentos.
 * @author	Helio Santana
 * @author	Rodrigo Guimaraes
 * @version	1.0
 * @since	26/05/2016
 */

public class Instrumento1{
	/**
	 * Possibilita o manuseio da envoltoria para a amplitude
	 */
	Envoltoria envoltoria1 = null;
	/**
	 * Possibilita o manuseio do ruido associado a amplitude
	 */
	Ruido ruido1 = null;
	/**
	 * Possibilita o manuseio do instrumento formado
	 */
	Oscilador oscilador1 = null;
	
	/**
	 *	Construcao do instrumento de maneira default
	 */
	public Instrumento1(){
		envoltoria1 = new Envoltoria();
		
		/*	Configurando a curva da envoltória como sendo a
		 *	recém-criada */
		envoltoria1.setCURVA (Principal.funcao1);
		
		envoltoria1.setGanho(80f);
		
		ruido1 = new Ruido (envoltoria1);
		ruido1.setFrequencia(440f);
		
		oscilador1 = new Oscilador (ruido1);
		
		Som teste = new Som (oscilador1, 2f);
		teste.visualiza();
		
	}
}
