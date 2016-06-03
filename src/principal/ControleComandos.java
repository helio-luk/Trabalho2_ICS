/*	Pacote ao qual pertence */
package principal;

import java.awt.Color;

import sintese.BancoDeInstrumentos;
import sintese.Dispositivo;
import sintese.Melodia;
import sintese.Som;
import sintese.Tema;

/** 
 * Constroi a aplicacao das acoes ocorridas na area grafica
 * garantindo a finalidade do programa
 * @author	Helio Santana
 * @author	Rodrigo Guimaraes
 * @version	1.0
 * @since	02/06/2016
 */
public class ControleComandos {
	/**
	 * Componentes requisitados para o desenvolvimento
	 */
	static Melodia melodiaEscolhida = null;
	static Dispositivo instrumentoEscolhido = null;
	static Som somFormado = null;
	/**
	 * Controles internos
	 */
	private static int aSelecionar = 2;
	private static boolean invertida = false;
	private static boolean editando = false;
	private static boolean deslizando = false;
	/**
	 * Itens descartáveis, mas utilizados por muitos
	 */
	private static float razao;
	private static int indiceEscolhido;
	private static int valorMaximo;
	private static int valorCorrente;
	private static String nome;

	
	
	/**
	 * Configuracao das acoes a serem tomadas ao se manipular
	 * o controle de selecao de melodias
	 */
	public static void escolherMelodias (){
		indiceEscolhido = InterfaceGrafica.escolherMelodias.getSelectedIndex();
				
		melodiaEscolhida = null;
		
		switch (indiceEscolhido){
			case 0:
				System.gc();
				break;
			case 1:
				melodiaEscolhida = Melodias.frozen();
				break;
			case 2:
				melodiaEscolhida = Melodias.gameOfThrones();
				break;
			case 3:
				melodiaEscolhida = Melodias.rainsOfCastamere();
				break;
			case 4:
				melodiaEscolhida = Tema.melodiasexta1();
				break;
			case 5:
				melodiaEscolhida = Tema.sonata_scarlatti();
				break;
			case 6:
				melodiaEscolhida = Tema.tema_aa_drawing_quintet_flauta();
				break;
			case 7:
				melodiaEscolhida = Tema.tema_aa_fuga1();
				break;
			case 8:
				melodiaEscolhida = Tema.tema_bwv775_invencao14_direita();
				break;
			case 9:
				melodiaEscolhida = Tema.tema_bwv775_invencao4_esquerda();
				break;
			case 10:
				melodiaEscolhida = Tema.tema_bwv988goldberg_v03_eq();
				break;
			case 11:
				melodiaEscolhida = Tema.tema_duda_no_frevo_eqYYY();
		}
		
		configurarInfosMelodias ();
		
		analisarVisualizar (indiceEscolhido);
	}
	
	/**
	 * Configuracao das acoes a serem tomadas ao se manipular
	 * o controle de selecao de melodias
	 */
	public static void escolherInstrumentos (){
		indiceEscolhido = InterfaceGrafica.escolherInstrumentos.getSelectedIndex();
		
		instrumentoEscolhido = null;
		
		switch (indiceEscolhido){
			case 0:
				System.gc();
			case 1:
				instrumentoEscolhido = new Instrumento1 ();
				break;
			case 2:
				instrumentoEscolhido = new Instrumento2 ();
				break;
			case 3:
				instrumentoEscolhido = new Instrumento3 ();
				break;
			case 4:
				instrumentoEscolhido = BancoDeInstrumentos.flauta_nao_harmonica_tonal();
				break;
			case 5:
				instrumentoEscolhido = BancoDeInstrumentos.gongo_aa_1994();
				break;
			case 6:
				instrumentoEscolhido = BancoDeInstrumentos.marimba_i51();
				break;
			case 7:
				instrumentoEscolhido = BancoDeInstrumentos.sompuro();
				break;
			case 8:
				instrumentoEscolhido = BancoDeInstrumentos.timbre_quasetonal();
				break;
			case 9:
				instrumentoEscolhido = BancoDeInstrumentos.timbreortogonal3();
				break;
			case 10:
				instrumentoEscolhido = BancoDeInstrumentos.trombone_naoharmonico();
				break;
			case 11:
				instrumentoEscolhido = BancoDeInstrumentos.trompete01();
		}
		
		configurarInfosInstrumento ();
		
		analisarVisualizar (indiceEscolhido);
	}

	/**
	 * Salvar o som formado, com o nome
	 */
	public static void salvarSom (){
		nome = InterfaceGrafica.nomeWave.getText();
		
		if (nome.equals("nome do arquivo"))
			nome = "";
		
		formarSom();
		somFormado.setNome (nome);
		somFormado.salvawave ();
	}

	/**
	 * Tocar o som formado
	 */
	public static void tocarSom (){
		formarSom();
		somFormado.tocawave();
	}

	/**
	 * Visualizar o espectro do som formado, sob a interface ja
	 * fornecida, e possibilitar a acao de tocar o som formado
	 */
	public static void visualizarSom (){
		somFormado.visualiza();
	}

	/**
	 * Configuracoes relacionadas ao andamento da melodia
	 */
	public static void configurarAndamentoViaSlider (){
		deslizando = true;
		valorMaximo = InterfaceGrafica.controleAndamento.getMaximum();
		valorCorrente = InterfaceGrafica.controleAndamento.getValue();
		
		razao = (float) Character.getNumericValue (Float.toString(valorMaximo).charAt(0));
		razao *= ((float)valorCorrente / valorMaximo);
		
		if (!editando)
			InterfaceGrafica.valorAndamento.setText ("" + razao);
		
		if (melodiaEscolhida != null){
			melodiaEscolhida.setAndamento(razao);
		}
		
		deslizando = false;
	}
	
	/**
	 * Configuracoes relacionadas ao andamento da melodia
	 */
	public static void configurarAndamentoViaTexto (){
		if (!deslizando){
			editando = true;
			razao = Float.parseFloat(InterfaceGrafica.valorAndamento.getText());
			
			InterfaceGrafica.controleAndamento.setValue((int)(razao * 100));
			
			if (melodiaEscolhida != null){
				melodiaEscolhida.setAndamento(razao);
			}
			
			editando = false;
		}
	}

	/**
	 * Configuracoes relacionadas a transposicao da melodia
	 */
	public static void configurarTransposicaoViaSlider (){
		deslizando = true;
		valorMaximo = InterfaceGrafica.controleTransposicao.getMaximum();
		valorCorrente = InterfaceGrafica.controleTransposicao.getValue();
		
		razao = (float) Character.getNumericValue (Float.toString(valorMaximo).charAt(0));
		razao *= ((float)valorCorrente / valorMaximo);
		
		if (!editando)
			InterfaceGrafica.valorTransposicao.setText ("" + razao);
		
		if (melodiaEscolhida != null){
			melodiaEscolhida.transposicao(razao);
		}
		
		deslizando = false;
	}
	
	/**
	 * Configuracoes relacionadas a transposicao da melodia
	 */
	public static void configurarTransposicaoViaTexto (){
		if (!deslizando){
			editando = true;
			razao = Float.parseFloat(InterfaceGrafica.valorTransposicao.getText());
			
			InterfaceGrafica.controleTransposicao.setValue((int)(razao * 100));
			
			if (melodiaEscolhida != null){
				melodiaEscolhida.transposicao (razao);
			}
			
			editando = false;
		}
	}

	/**
	 * Configuracoes relacionadas ao fator de corte do instrumento
	 */
	public static void configurarFatordeCorteViaSlider (){
		deslizando = true;
		valorMaximo = InterfaceGrafica.controleFatordeCorte.getMaximum();
		valorCorrente = InterfaceGrafica.controleFatordeCorte.getValue();
		
		razao = (float) Character.getNumericValue (Float.toString(valorMaximo).charAt(0));
		razao *= ((float)valorCorrente / valorMaximo);
		
		
		if (!editando)
			InterfaceGrafica.valorFatordeCorte.setText ("" + razao);
		
		switch(verificaInstrumento()){
			case 1:
				((Instrumento1) instrumentoEscolhido).setFatorCorte (razao);
				break;
			/*
			case 2:
				((Instrumento2) instrumentoEscolhido).setFatorCorte (razao);
				break;
			case 3:
				((Instrumento3) instrumentoEscolhido).setFatorCorte (razao);
				break;
			//*/
		}
		
		deslizando = false;
	}
	
	/**
	 * Configuracoes relacionadas a transposicao da melodia
	 */
	public static void configurarFatordeCorteViaTexto (){
		if (!deslizando){
			editando = true;
			razao = Float.parseFloat(InterfaceGrafica.valorFatordeCorte.getText());
			
			InterfaceGrafica.controleFatordeCorte.setValue((int)(razao * 10000));
			
			switch(verificaInstrumento()){
				case 1:
					((Instrumento1) instrumentoEscolhido).setFatorCorte (razao);
					break;
				/*
				case 2:
					((Instrumento2) instrumentoEscolhido).setFatorCorte (razao);
					break;
				case 3:
					((Instrumento3) instrumentoEscolhido).setFatorCorte (razao);
					break;
				//*/
			}
			
			editando = false;
		}
	}
	
	/**
	 * Configuracoes relacionadas a fase do instrumento
	 */
	public static void configurarFaseViaSlider (){
		deslizando = true;
		valorCorrente = InterfaceGrafica.controleFase.getValue();
		
		if (!editando)
			InterfaceGrafica.valorFase.setText("" + valorCorrente);
		
		switch(verificaInstrumento()){
			case 1:
				((Instrumento1) instrumentoEscolhido).setFase (valorCorrente);
				break;
			/*
			case 2:
				((Instrumento2) instrumentoEscolhido).setFase (valorCorrente);
				break;
			case 3:
				((Instrumento3) instrumentoEscolhido).setFase (valorCorrente);
				break;
			//*/
		}
		
		deslizando = false;
	}
	
	/**
	 * Configuracoes relacionadas a fase do instrumento
	 */
	public static void configurarFaseViaTexto (){
		if (!deslizando){
			editando = true;
			razao = Float.parseFloat(InterfaceGrafica.valorFase.getText());
			
			InterfaceGrafica.controleFatordeCorte.setValue((int)(razao));
			
			switch(verificaInstrumento()){
				case 1:
					((Instrumento1) instrumentoEscolhido).setFase (razao);
					break;
				/*
				case 2:
					((Instrumento2) instrumentoEscolhido).setFase (razao);
					break;
				case 3:
					((Instrumento3) instrumentoEscolhido).setFase (razao);
					break;
				//*/
			}
			
			editando = false;
		}
	}
	
	/**
	 * Configuracoes relacionadas a estereofonia para a saida do instrumento
	 */
	public static void configurarLambdaViaSlider (){
		deslizando = true;
		valorMaximo = InterfaceGrafica.controleLambda.getMaximum();
		valorCorrente = InterfaceGrafica.controleLambda.getValue();
		
		razao = (float) Character.getNumericValue(Float.toString(valorMaximo).charAt(0));
		razao *= ((float)valorCorrente / valorMaximo);
		
		if (!editando)
			InterfaceGrafica.valorLambda.setText("" + razao );
		
		switch(verificaInstrumento()){
			case 1:
				((Instrumento1) instrumentoEscolhido).setLambda (razao);
				break;
			/*
			case 2:
				((Instrumento2) instrumentoEscolhido).setLambda (razao);
				break;
			case 3:
				((Instrumento3) instrumentoEscolhido).setLambda (razao);
				break;
			//*/
		}
		
		deslizando = false;
	}
	
	/**
	 * Configuracoes relacionadas a fase do instrumento
	 */
	public static void configurarLambdaViaTexto (){
		if (!deslizando){
			editando = true;
			razao = Float.parseFloat(InterfaceGrafica.valorLambda.getText());
			
			InterfaceGrafica.controleLambda.setValue((int)(razao));
			
			switch(verificaInstrumento()){
				case 1:
					((Instrumento1) instrumentoEscolhido).setLambda (razao);
					break;
				/*
				case 2:
					((Instrumento2) instrumentoEscolhido).setLambda (razao);
					break;
				case 3:
					((Instrumento3) instrumentoEscolhido).setLambda (razao);
					break;
				//*/
			}
			
			editando = false;
		}
	}
	
	
	/**
	 * Configuracoes relacionadas a inversao da melodia
	 * @param acao Operacao realizada sobre a caixa de selecao,
	 * marcando positiva ou negativamente
	 */
	public static void configurarInversaoMelodia (int acao){
		if (acao == 0 & !invertida)
			melodiaEscolhida.inversao();
		else if (acao == 1 & invertida)
			melodiaEscolhida.inversao();
	}
	

	/**
	 * Configuracoes relacionadas ao habilitar salvar a melodia
	 * @param acao Operacao realizada sobre a caixa de selecao,
	 * marcando positiva ou negativamente
	 */
	public static void configurarSalvarSom (int acao){
		if (acao == 0){
			InterfaceGrafica.salvarSom.setEnabled(true);
			InterfaceGrafica.nomeWave.setText("nome do arquivo");
			InterfaceGrafica.nomeWave.setForeground(new Color (128, 128, 128));
			InterfaceGrafica.nomeWave.setVisible(true);
			
		}else{
			InterfaceGrafica.salvarSom.setEnabled(false);
			InterfaceGrafica.nomeWave.setVisible(false);
		}
	}
	
	
	/**
	 * Configuracoes relacionadas ao ganho de amplitude no instrumento
	 */
	public static void configurarGanhoInstrumento (){
		if (!editando){
			System.out.println("tam -> " + InterfaceGrafica.valorGanhoInst.getText().length());
			if (InterfaceGrafica.valorGanhoInst.getText().length() != 0)
				razao = Float.parseFloat(InterfaceGrafica.valorGanhoInst.getText());
			else
				razao = 0;
			
			
			//*
			switch(verificaInstrumento()){
				case 1:
					((Instrumento1) instrumentoEscolhido).setGanho (razao);
					break;
				case 2:
					((Instrumento2) instrumentoEscolhido).setGanho (razao);
					break;
				case 3:
					((Instrumento3) instrumentoEscolhido).setGanho (razao);
					break;
				case 4:
					instrumentoEscolhido.setGanho(razao);
			}
		}
		//*/
	}
	

	/**
	 * Configuracoes relacionadas ao click do mouse sobre a caixa do
	 * nome do arquivo
	 */
	public static void configurarClickSalvar (){
		nome = InterfaceGrafica.nomeWave.getText();
		
		if ("nome do arquivo".equals(nome)){
			InterfaceGrafica.nomeWave.setText("");
			InterfaceGrafica.nomeWave.setForeground(new Color (0, 0, 0));
		}
	}
	
	
	
	
	
	/**
	 * Controle o status do "Visualizar", ativando quando se tem 
	 * melodia e instrumento escolhidos
	 * @param indiceEscolhido	Melodia ou Instrumento escolhido
	 */
	public static void analisarVisualizar (int indiceEscolhido) {
		if(indiceEscolhido != 0)
			aSelecionar--;
		else
			aSelecionar++;
		
		if (aSelecionar == 0){
			InterfaceGrafica.visualizarSom.setEnabled(true);
			InterfaceGrafica.tocarSom.setEnabled(true);
			InterfaceGrafica.controleSalvar.setEnabled(true);
			
		}else{
			InterfaceGrafica.visualizarSom.setEnabled(false);
			InterfaceGrafica.tocarSom.setEnabled(false);
			InterfaceGrafica.controleSalvar.setEnabled(false);
		}
	}


	/**
	 * Configuracao do som formado com as manipulacoes
	 */
	private static void formarSom (){
		somFormado = melodiaEscolhida.getSom(instrumentoEscolhido);
		System.out.println("");
	}


	/**
	 * Configuracao dos parametros da interface em relacao a melodia escolhida
	 */
	private static void configurarInfosMelodias () {
		if (melodiaEscolhida != null){
			razao = melodiaEscolhida.getAndamento();
			
			InterfaceGrafica.controleAndamento.setValue((int)(razao * 100));
			
			InterfaceGrafica.controleInverterMel.setEnabled(true);
			
			configurarAndamentoViaSlider ();
		
		}else
			InterfaceGrafica.controleInverterMel.setEnabled(false);
	}
	
	/**
	 * Configuracao dos parametros da interface em relacao ao instrumento escolhido
	 */
	private static void configurarInfosInstrumento () {
		if (instrumentoEscolhido != null){
			switch(verificaInstrumento()){
				case 1:
					valorMaximo = InterfaceGrafica.controleFatordeCorte.getMaximum();
					razao = ((Instrumento1) instrumentoEscolhido).getFatorCorte ();
					InterfaceGrafica.controleFatordeCorte.setValue((int)(razao * valorMaximo));
					
					valorMaximo = InterfaceGrafica.controleFase.getMaximum();
					razao = ((Instrumento1) instrumentoEscolhido).getFase();
					InterfaceGrafica.controleFase.setValue((int)(razao * valorMaximo));
					
					valorMaximo = InterfaceGrafica.controleLambda.getMaximum();
					razao = (float) ((Instrumento1) instrumentoEscolhido).getLambda();
					InterfaceGrafica.controleLambda.setValue((int)(razao * valorMaximo));
					
					editando = true;
					razao = (float) ((Instrumento1) instrumentoEscolhido).getGanho();
					InterfaceGrafica.valorGanhoInst.setText("" + razao);
					editando = false;
					break;
				/*
				case 2:
					valorMaximo = InterfaceGrafica.controleFatordeCorte.getMaximum();
					razao = ((Instrumento2) instrumentoEscolhido).getFatorCorte ();
					InterfaceGrafica.controleFatordeCorte.setValue((int)(razao * valorMaximo));
					break;
				case 3:
					valorMaximo = InterfaceGrafica.controleFatordeCorte.getMaximum();
					razao = ((Instrumento2) instrumentoEscolhido).getFatorCorte ();
					InterfaceGrafica.controleFatordeCorte.setValue((int)(razao * valorMaximo));
					break;
				//*/
			}
			
			configurarFatordeCorteViaSlider();
			configurarFaseViaSlider ();
			configurarLambdaViaSlider();
		}
	}
	
	/**
	 * Verificacao do tipo efetivo do instrumento a ser manipulado
	 */
	private static int verificaInstrumento (){
		if (instrumentoEscolhido != null){
			if (instrumentoEscolhido.getClass().equals(Instrumento1.class))
				return 1;
			else if (instrumentoEscolhido.getClass().equals(Instrumento2.class))
				return 2;
			else if (instrumentoEscolhido.getClass().equals(Instrumento3.class))
				return 3;
			else
				return 4;
		}
		return 0;
	}
}
