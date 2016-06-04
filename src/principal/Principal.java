/**	Pacote ao qual pertence */
package principal;

import sintese.BancoDeInstrumentos;
/**	Importando Classes necessárias */
import sintese.Curva;
import sintese.Dispositivo;
import sintese.Melodia;
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
public class Principal{

	/**
	 * Curva para as envoltorias de amplitude para os
	 * 3 instrumentos criados
	 */
	public static Curva funcao1 = null;
	/**
	 * Curva para as envoltorias de frequencia para o
	 * segundo instrumento criado
	 */
	public static Curva funcaoFrequencia = null;
	/**
	 * Curva para as envoltorias de frequencia, associada
	 * ao ruido, para o segundo e o terceiro instrumento criado
	 */
	public static Curva funcaoFrequenciaRuido = null;
	
	
	
	/**
	 * Garante a execucao do programa
	 * @param args Argumentos recebidos via linha de comando
	 */
	public static void main (String args[]){
		//new Principal();
		new InterfaceGrafica();
		//teste ();
		System.gc();
	}
	
	/**
	 * Construcao de todas as 3 curvas
	 */
	public static void constroiFuncoes (){
		constroiFuncao1();
		constroiFuncao2();
		constroiFuncao3();

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


	/**
	 * Construcao, apenas, da curva para a envoltoria de amplitude
	 */
	private static void constroiFuncao1 () {		

		funcao1 = new Curva (720);
		funcao1.addPonto (0f,	0f);
		funcao1.addPonto (20f,	400f);
		funcao1.addPonto (240f, 300f);
		funcao1.addPonto (720f,	0f);
	}
	

	/**
	 * Construcao, apenas, da curva para a envoltoria de frequencia
	 */
	private static void constroiFuncao2(){

		funcaoFrequencia = new Curva(720);
		funcaoFrequencia.addPonto( 0f, 2000f);        
        funcaoFrequencia.addPonto(720f, 0f);
	}
	

	/**
	 * Construcao, apenas, da curva para a envoltoria de frequencia,
	 * associada ao ruido
	 */
	private static void constroiFuncao3(){
		funcaoFrequenciaRuido = new Curva(720);
		funcaoFrequenciaRuido.addPonto(0f, 200f);        
        funcaoFrequenciaRuido.addPonto(720f, 200f);
	}
	
	private static void teste(){
		constroiFuncoes ();
		//Instrumento1 inst = new Instrumento1();
		Dispositivo inst = BancoDeInstrumentos.sompuro();
		
		/*
		inst.setFatorCorte(1f);
		inst.setFase(0f);
		inst.setLambda(0.5);
		//*/
		inst.setGanho(1.5f);
		
		Melodia mel = Melodias.frozen();
		
		mel.setAndamento(0.5f);
		mel.transposicao(1);
		//mel.inversao();
		
		Som som = mel.getSom(inst);
		
		som.setNome("testando");
		
		som.salvawave();
		//som.tocawave();
		System.out.println("");
			
	}

}