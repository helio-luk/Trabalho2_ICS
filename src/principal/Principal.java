/*	Pacote ao qual pertence */
package principal;

/*	Importando Classes necessárias */

import sintese.Curva;
import sintese.Envoltoria;
import sintese.Melodia;
import sintese.Som;
import sintese.Tema;

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
	/**
	 * Funcao comum a todos os instrumentos, um trapezio
	 */
	public static Curva funcao1 = null;	
	
	/**
     * Inicia a execucao de todo o programa
     * @param args Parametros passados via linha de comando
     */
	public static void main (String args[]){
		System.out.println ("testando som rodrigo!!\n");
		new Principal();
		
		
		System.gc();
	}
	
	public Principal (){
		/*	Construção da F1 */
		constroiFuncao1 ();
		
		//testeInstrumento1();  
		tocaFrozen ();
   }

	private void testeInstrumento1() {
		Instrumento1 inst  = new Instrumento1(1);        //---instrumento atonal
		//inst  = new Instrumento1(0.2f);     	 //---quase tonal
	    //inst  = new Instrumento1(0.065f);   //---atonal
	    //inst  = new Instrumento1(0.001f);   //---atonal ruidoso
	    //inst  = new Instrumento1(0.0001f);  //---tonal: formante estreita
	    //inst  = new Instrumento1(0.00001f); //---tonal: som puro
	    
	    Envoltoria env   = new Envoltoria(); 
	    Curva curva = new Curva(720);     

	    curva.addPonto(  0f,   0f);
	    curva.addPonto( 30f, 400f);
	    curva.addPonto(240f, 300f);
	    curva.addPonto(720f,   0f);

	    env.setCURVA(curva);
	           
	    inst.setEnvoltoria(env);
	    inst.setLambda(0.5f);
	    inst.setFase(0f);
	    inst.setGanho(103);     
	     
	        
	    Melodia m2 = Tema.tema_aa_fuga1();
	    //Melodia m2 = Tema.tema_aa_drawing_quintet_flauta();
	    //Melodia m2 = Tema.tema_duda_no_frevo_eq();
	     
	    m2.getAutor();     
	     
	    //m2.setAndamento(0.45f);
	    m2.setAndamento(0.95f);

	    Som som = m2.getSom(inst);
	    som.visualiza();

	    try{ System.in.read();
	         System.exit(0);
	    }
	    catch(Exception e){};
	}
	
	private void tocaFrozen (){
		Instrumento1 inst;
		
		//inst  = new Instrumento1(1);        //---instrumento atonal
		//inst  = new Instrumento1(0.2f);     	 //---quase tonal
	    //inst  = new Instrumento1(0.065f);   //---atonal
	    //inst  = new Instrumento1(0.001f);   //---atonal ruidoso
	    //inst  = new Instrumento1(0.0001f);  //---tonal: formante estreita
	    inst  = new Instrumento1(0.00001f); //---tonal: som puro
			
		Envoltoria env   = new Envoltoria(); 
	    Curva curva = new Curva(720);     

	    curva.addPonto(  0f,   0f);
	    curva.addPonto( 30f, 400f);
	    curva.addPonto(240f, 300f);
	    curva.addPonto(720f,   0f);

	    env.setCURVA(curva);
	           
	    inst.setEnvoltoria(env);
	    inst.setLambda(0.5f);
	    inst.setFase(0f);
	    inst.setGanho(103);  
		
	    Melodia mel = Melodias.frozen(); 
	    		
	    mel.setAndamento(.5f);
	    
		Som som = mel.getSom(inst);
	    som.visualiza();

	    try{ System.in.read();
	         System.exit(0);
	    }
	    catch(Exception e){};
	}

	private void constroiFuncao1 () {
		/*	Criando curva com resolução de 720 pontos,
		 *	que servirá para todos os instrumentos */
		funcao1 = new Curva (720);
		funcao1.addPonto (0f,	0f);
		funcao1.addPonto (20f,	300f);
		funcao1.addPonto (680f,	300f);
		funcao1.addPonto (720f,	0f);
	}
}