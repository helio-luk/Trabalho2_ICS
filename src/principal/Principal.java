/*	Pacote ao qual pertence */
package principal;

import sintese.BancoDeInstrumentos;

/*	Importando Classes necessárias */

import sintese.Curva;
import sintese.Dispositivo;
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
	
	public static Curva funcao1 = null;
	public static Curva funcaoFrequencia = null;
	public static Curva funcaoFrequenciaRuido = null;
	
	public static void main (String args[]){
		System.out.println ("testando som rodrigo!!\n");
		new Principal();		
		System.gc();
	}
	
	public Principal (){		
		constroiFuncao1();
		constroiFuncao2();
		constroiFuncao3();
		tocaFrozen ();
	}

	
	private void tocaFrozen (){
		IN2 inst;
		inst = new IN2(0.00000001f);
		
		//Instrumento2 inst;
		//inst  = new Instrumento2 (1);			//---instrumento atonal
		//inst  = new Instrumento3 (0.2f);     	//---quase tonal
	    //inst  = new Instrumento2 (0.065f);		//---atonal
	    //inst  = new Instrumento2 (0.001f);		//---atonal ruidoso
	    //inst  = new Instrumento2 (0.0001f);	//---tonal: formante estreita
	    //inst  = new Instrumento2 (0.00000001f);		//---tonal: som puro  
	    
	    inst.setGanho (110);
	    //*/
	    
		/*
	    Dispositivo inst  = BancoDeInstrumentos.trompete01(1f);
	    inst.setGanho (2f); //*/
	    /*
		Dispositivo inst  = BancoDeInstrumentos.marimba_i51 ();
	    inst.setGanho (.125f); //*/
	    /*
	  	Dispositivo inst  = BancoDeInstrumentos.sompuro ();
	  	inst.setGanho (.125f); //*/
	    //*/
	  	/*
		Dispositivo inst  = BancoDeInstrumentos.flauta_nao_harmonica_tonal ();
		inst.setGanho (.125f); //*/
		//*/
	  	   
	  	   
	    Melodia mel = Melodias.granada();
	    
	    
	    mel.setAndamento(.5f);
	    
		Som som = mel.getSom(inst);
	    som.visualiza();

	    try{ System.in.read();
	         System.exit(0);
	    }
	    catch(Exception e){};
	}

	private void constroiFuncao1 () {		
		funcao1 = new Curva (720);
		funcao1.addPonto (0f,	0f);
		funcao1.addPonto (20f,	400f);
		funcao1.addPonto (240f, 300f);
		funcao1.addPonto (720f,	0f);
	}
	
	private void constroiFuncao2(){
		funcaoFrequencia = new Curva(720);
		funcaoFrequencia.addPonto( 0f, 2000f);        
        funcaoFrequencia.addPonto(720f, 0f);
	}
	
	private void constroiFuncao3(){
		/*funcaoFrequenciaRuido = new Curva(720);
		funcaoFrequenciaRuido.addPonto(0f, 200f);        
        funcaoFrequenciaRuido.addPonto(720f, 200f);*/
		
		funcaoFrequenciaRuido = new Curva(720);     
		funcaoFrequenciaRuido.addPonto(0f, 110f);   
		funcaoFrequenciaRuido.addPonto(10f, 300f);
		funcaoFrequenciaRuido.addPonto(140, 200f);
	    funcaoFrequenciaRuido.addPonto(720f, 110f);  
	}
	
	
}