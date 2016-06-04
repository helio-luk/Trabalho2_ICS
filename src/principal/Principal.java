/**	Pacote ao qual pertence */
package principal;

import sintese.BancoDeInstrumentos;
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
	 * Garante a execucao do programa
	 * @param args Argumentos recebidos via linha de comando
	 */
	public static void main (String args[]){
		//new Principal();
		new InterfaceGrafica();
		//teste ();
		System.gc();
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


	
	private static void teste(){
		
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