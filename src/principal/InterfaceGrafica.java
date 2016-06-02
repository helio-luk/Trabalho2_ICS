/*	Pacote ao qual pertence */
package principal;

import java.awt.Color;

/*	Importando Classes necessárias */

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Hashtable;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


/** 
 * Gerencia a interface grafica da aplicacao, gerenciando todas as classes necessarias
 * @author	Helio Santana
 * @author	Rodrigo Guimaraes
 * @version	1.3
 * @since	02/06/2016
 */
public class InterfaceGrafica implements	ActionListener, ChangeListener, ItemListener,
											DocumentListener, MouseListener {
	/**
	 * Janela que sera abrigada a GUI criada, nas dimensões definidas
	 */
	static JFrame janelaPrincipal = null;
	static final int comprimentoMaximo = 260;
	static final int alturaMaxima = 840;
	/**
	 * Paineis de Controle e Organizacionais
	 */
	private JPanel painelPrincipal = null;
	private JPanel painelAbrir = null;
	private JPanel painelConfiguracoes = null;
	private JPanel painelSons = null;
	/**
	 * Opcoes do painel "Abrir"
	 */
	static JComboBox escolherMelodias = null;
	static JComboBox escolherInstrumentos = null;
	/**
	 * Opcoes do painel "Configurar/Melodias"
	 */
	static JSlider controleAndamento = null;
	static JButton valorAndamento = null;
	static JSlider controleTransposicao = null;
	static JButton valorTransposicao = null;
	static JCheckBox controleInverterMel = null;
	static JTextField valorGanhoMel = null;
	/**
	 * Opcoes do painel "Configurar/Instrumentos"
	 */
	static JSlider controleFatordeCorte = null;
	static JButton valorFatordeCorte = null;
	static JSlider controleFase = null;
	static JButton valorFase = null;
	static JSlider controleLambda = null;
	static JButton valorLambda = null;
	static JCheckBox controleInverterInst = null;
	static JTextField valorGanhoInst = null;
	
	/**
	 * Opcoes do painel "Som"
	 */
	static JCheckBox controleSalvar = null;
	static JTextField nomeWave = null;
	static JButton salvar = null;
	static JButton visualizar = null;
	
	private JPanel painelAvulso;
	private JButton botaoAvulso;
	private Dimension padrao;

	int aSelecionar = 2;

	/**
	 * Criacao da interface grafica
	 */
	public InterfaceGrafica (){
		new FormatacaoPadrao();
		
		janelaPrincipal = new JFrame("Trabalho 2 - H\u0026R");
		
		janelaPrincipal.setContentPane (this.getPainelPrincipal());
		
		janelaPrincipal.setSize (new Dimension (comprimentoMaximo, alturaMaxima));
		
		janelaPrincipal.setResizable (false);
		
		janelaPrincipal.setVisible (true);
		
		janelaPrincipal.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);		
	}

	/**
	 * Configuracao da area grafica
	 * @return Area grafica ja criada
	 */
	private JPanel getPainelPrincipal () {
		prepararPainelPrincipal ();
		
		addAbrir ();
		
		addEspacoVazioVertical (painelPrincipal, 10);
		
		addConfiguracoes ();
		
		addEspacoVazioVertical (painelPrincipal, 10);
		
		addSons ();
		
		return painelPrincipal;
	}

	/**
	 * Configuracao inicial do painel para receber os recursos
	 */
	private void prepararPainelPrincipal (){
		painelPrincipal = new JPanel ();
		
		painelPrincipal.setLayout (new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        
		painelPrincipal.setOpaque (true);
        
        Border caixaPrincipal = BorderFactory.createEmptyBorder (10, 10, 10, 10);
        painelPrincipal.setBorder (caixaPrincipal);
	}
	
	/**
	 * Configuracao inicial do painel "Abrir"
	 */
	private void prepararPainelAbrir (){
		padrao = new Dimension (comprimentoMaximo + 50, 105);
		
		painelAbrir = new JPanel ();
		
		painelAbrir.setLayout (new GridLayout(2, 1, 1, 2));
		
		painelAbrir.setBorder (BorderFactory.createTitledBorder("Abrir: "));
		
		painelAbrir.setMaximumSize (padrao);
		painelAbrir.setMinimumSize (padrao);
		painelAbrir.setPreferredSize (padrao);
		
		painelPrincipal.add (painelAbrir);
	}
	
	/**
	 * Configuracao inicial do painel "Configurar"
	 */
	private void prepararPainelConfigurar (){
		padrao = new Dimension (comprimentoMaximo + 50, 550);
		
		painelConfiguracoes = new JPanel ();
		
		painelConfiguracoes.setLayout (new GridLayout (2, 1, 1, 1));
		
		painelConfiguracoes.setBorder (BorderFactory.createTitledBorder ("Configurar: "));
		
		painelConfiguracoes.setMaximumSize (padrao);
		painelConfiguracoes.setMinimumSize (padrao);
		painelConfiguracoes.setPreferredSize (padrao);
		
		painelPrincipal.add (painelConfiguracoes);
	}
	
	/**
	 * Configuracao inicial do painel "Som"
	 */
	private void prepararPainelSons (){
		painelSons = new JPanel ();
		
		painelSons.setLayout (new GridLayout (4, 1, 1, 1));
		
		painelSons.setBorder (BorderFactory.createTitledBorder ("Som: "));
		
		painelPrincipal.add (painelSons);
	}
	
	/**
	 * Construcao do ambiente "Abrir"	
	 */
	private void addAbrir () {
		prepararPainelAbrir ();
		
		addAbMelodias();
		
		addAbIntrumentos();
	}
	
	/**
	 * Construcao do ambiente "Abrir"	
	 */
	private void addConfiguracoes () {
		prepararPainelConfigurar ();
		
		addConfMelodias ();
						
		addConfInstrumentos ();
	}
	
	/**
	 * Construcao do ambiente "Abrir"	
	 */
	private void addSons () {
		prepararPainelSons ();
		
		painelAvulso = new JPanel ();
		painelAvulso.setLayout(new BoxLayout(painelAvulso, BoxLayout.X_AXIS));
		
		botaoAvulso = criarIdentificacao("Salvar:", true);
		controleSalvar = criarCheckBox();
		controleSalvar.setToolTipText("Salvar do áudio gerado, no diretório atual");
		botaoAvulso.setToolTipText("Salvar do áudio gerado, no diretório atual");
		painelAvulso.add (botaoAvulso);
		painelAvulso.add (controleSalvar);
		
		painelSons.add(painelAvulso);
		
		nomeWave = criarTextField ("nomeWave", "nome do arquivo", false);
		nomeWave.setForeground(new Color (128, 128, 128));
		nomeWave.getDocument().putProperty("owner", nomeWave);
		nomeWave.setVisible(false);
		painelSons.add(nomeWave);
		
		salvar = criarBotao("salvar", "Salvar");
		salvar.setToolTipText("Efetuar registro do áudio em HD");
		painelSons.add(salvar);
		
		visualizar = criarBotao("visualizar", "Visualizar");
		visualizar.setToolTipText("Visualizar espectro formado");
		painelSons.add(visualizar);
		
	}
	
	/**
	 * Construcao das opcoes de melodias, no painel "Abrir"
	 */
	private void addAbMelodias (){
			painelAvulso = new JPanel ();
			painelAvulso.setLayout(new GridLayout(2, 1));
						
			botaoAvulso = criarIdentificacao("Melodias:", false);
			botaoAvulso.setToolTipText("Melodias disponíveis");
			painelAvulso.add(botaoAvulso);
			
			String melodias[] = {"","Frozen", "Game of Thrones", "The Rains of Castamere",
								"Melodia Sexta1", "Sonata de Scarlatti", "Drawing Quintet Flauta",
								"BWV 775, Invenção no. 14 dir.", "BWV 775, Invenção no. 4 esq.",
								"BWV 988, variação goldberg_v03", "Duda no Frevo"};
			
			escolherMelodias = new JComboBox(melodias);
			escolherMelodias.setToolTipText("Melodias disponíveis");
			
			escolherMelodias.setActionCommand("escolheMel");
			escolherMelodias.addActionListener(this);
			
			painelAvulso.add(escolherMelodias);
			painelAbrir.add(painelAvulso);
	}
	
	/**
	 * Construcao das opcoes de instrumentos, no painel "Abrir"
	 */
	private void addAbIntrumentos (){
		painelAvulso = new JPanel ();
		painelAvulso.setLayout(new GridLayout(2, 1));
		
		botaoAvulso= criarIdentificacao("Instrumentos:", false);
		botaoAvulso.setToolTipText("Intrumentos disponíveis");
		painelAvulso.add(botaoAvulso);
		
		String instrumentos[] = {"", "H&R 1", "H&R 2", "H&R 3",
								"Flauta não Harmonica", "Gongo Arcela 1994",
								"Marimba_i51", "Som puro", "Timbre quase Tonal",
								"Timbre Ortogonal", "Trombone não Harmonico", "Trompete"};
		
		escolherInstrumentos = new JComboBox(instrumentos);
		escolherInstrumentos.setToolTipText("Intrumentos disponíveis");
		
		escolherInstrumentos.setActionCommand("escolheInst");
		escolherInstrumentos.addActionListener(this);
		
		painelAvulso.add(escolherInstrumentos);
		painelAbrir.add(painelAvulso);
	}
	
	/**
	 * Construcao das opcoes de melodias, no painel "Configurar"
	 */
	private void addConfMelodias () {
		padrao = new Dimension(comprimentoMaximo - 20,  50);
		
		
		JPanel painelMelodias = new JPanel (new GridLayout(6, 1));
			
		painelMelodias.setSize(new Dimension (comprimentoMaximo - 30, 80));
		painelMelodias.setBorder(BorderFactory.createTitledBorder("  Melodias: "));

		controleAndamento = criarSlider("Andamento", 0, 200, 200, true); 
		valorAndamento = criarValorSlider (controleAndamento);
		valorAndamento.setToolTipText("O quão rápido a música deve ir, em relação ao default da melodia");
		controleAndamento.setToolTipText("O quão rápido a música deve ir, em relação ao default da melodia");
		painelMelodias.add(valorAndamento);
		painelMelodias.add(controleAndamento);
		
		controleTransposicao = criarSlider("Transposição", 0, 200, 100, true); 
		valorTransposicao = criarValorSlider (controleTransposicao);
		valorTransposicao.setToolTipText("Controle do tom da melodia, de oitava abaixo a uma oitava acima");
		controleTransposicao.setToolTipText("Controle do tom da melodia, de oitava abaixo a uma oitava acima");
		painelMelodias.add(valorTransposicao);
		painelMelodias.add(controleTransposicao);
		
		painelAvulso = new JPanel ();
		painelAvulso.setLayout(new BoxLayout(painelAvulso, BoxLayout.X_AXIS));
		botaoAvulso = criarIdentificacao("Inverter:", true);
		controleInverterMel = criarCheckBox();
		controleInverterMel.setToolTipText("Inversão melódica");
		botaoAvulso.setToolTipText("Inversão melódica");
		painelAvulso.add (botaoAvulso);
		painelAvulso.add (controleInverterMel);
		painelMelodias.add(painelAvulso);
		
		painelAvulso = new JPanel ();
		painelAvulso.setLayout(new BoxLayout(painelAvulso, BoxLayout.X_AXIS));
		botaoAvulso=criarIdentificacao("Ganho:", true);
		valorGanhoMel = criarTextField ("ganhoMelodia", "1", true);
		valorGanhoMel.getDocument().putProperty("owner", valorGanhoMel);
		valorGanhoMel.setToolTipText("Controle grosso do volume, quanto maior o valor maior o volume");
		botaoAvulso.setToolTipText("Controle grosso do volume, quanto maior o valor maior o volume");
		painelAvulso.add (botaoAvulso);
		painelAvulso.add(valorGanhoMel);
		painelMelodias.add(painelAvulso);
				
		painelConfiguracoes.add(painelMelodias);
	}
	
	/**
	 * Construcao das opcoes de instrumentos, no painel "Configurar"
	 */
	private void addConfInstrumentos () {
		JPanel painelInstrumentos = new JPanel (new GridLayout(7, 1));
		
		painelInstrumentos.setSize(new Dimension (comprimentoMaximo - 30, 80));
		painelInstrumentos.setBorder(BorderFactory.createTitledBorder("  Instrumentos: "));

		controleFatordeCorte = criarSlider("Fator de Corte", 0, 10000, 10000, true);
		valorFatordeCorte = criarValorSlider (controleFatordeCorte);
		valorFatordeCorte.setToolTipText("Largura de banda do filtro passa-baixa");
		controleFatordeCorte.setToolTipText("Largura de banda do filtro passa-baixa");
		painelInstrumentos.add(valorFatordeCorte);
		painelInstrumentos.add(controleFatordeCorte);
		
		controleFase = criarSlider("Fase", 0, 360, 0, false);
		valorFase = criarValorSlider (controleFase);
		valorFase.setToolTipText("Ângulo de fase");
		controleFase.setToolTipText("Ângulo de fase");
		painelInstrumentos.add(valorFase);
		painelInstrumentos.add(controleFase);
		
		controleLambda = criarSlider("Esteriofonia", 0, 100, 50, true);
		valorLambda = criarValorSlider (controleLambda);
		valorLambda.setToolTipText("Medida da saida de áudio nos canais esquerdo-direito");
		controleLambda.setToolTipText("Medida da saida de áudio nos canais esquerdo-direito");
		painelInstrumentos.add(valorLambda);
		painelInstrumentos.add(controleLambda);
		
		painelAvulso = new JPanel ();
		painelAvulso.setLayout(new BoxLayout(painelAvulso, BoxLayout.X_AXIS));
		botaoAvulso = criarIdentificacao("Ganho:", true);
		valorGanhoInst = criarTextField ("ganhoInstrumento", "1",true);
		valorGanhoInst.getDocument().putProperty("owner", valorGanhoInst);
		valorGanhoInst.setToolTipText("Controle grosso do volume, quanto maior o valor maior o volume");
		botaoAvulso.setToolTipText("Controle grosso do volume, quanto maior o valor maior o volume");
		painelAvulso.add (botaoAvulso);
		painelAvulso.add(valorGanhoInst);
		painelInstrumentos.add(painelAvulso);
		
		painelConfiguracoes.add(painelInstrumentos);
	}
	
	/**
	 * Criacao de um botao padrao
	 * @param descricao Identificacao do botao no tratamento de acoes
	 * @param texto		Texto a ser posto como inicial
	 * @return			Botao ja criado
	 */
	private JButton criarBotao (String descricao, String texto){
		JButton novo = new JButton();
		
		novo.setText(texto);
		
		novo.setEnabled(false);
		
		novo.setActionCommand(descricao);
		novo.addActionListener(this);
		
		
		return novo;
	}
	
	/**
	 * Criacao botoes especiais para a identificacao dos demais componentes
	 * @param descricao	Texto a ser posto como inicial 
	 * @param checkBox	Sinaliza se e um botao de identificacao de checkBox
	 * @return 			O botao criado, respeitando os parametros
	 */
	private JButton criarIdentificacao (String descricao, boolean checkBox){
		JButton novo = new JButton();
		Dimension padrao;
		if (!checkBox)
			padrao = new Dimension(85, 30);
		else
			padrao = new Dimension(100, 30);
		
		novo.setText(descricao);
		novo.setHorizontalAlignment(JButton.CENTER);
				
		novo.setBorderPainted(false);
		novo.setContentAreaFilled(false);
		
		novo.setMaximumSize (padrao);
		novo.setMinimumSize (padrao);
		novo.setPreferredSize (padrao);
		
		return novo;
	}

	/**
	 * Criacao de um slider padrao
	 * @param nome		Nome a ser atribuido ao slider
	 * @param minimo	Valor minimo da escala
	 * @param maximo	Valor maximo da escala
	 * @param inicio	Valor inicial
	 * @param transforma Sinaliza se o valor deve sofrer alteracao para exibicao
	 * @return			O slider ja construido
	 */
	private JSlider criarSlider (String nome, int minimo, int maximo, int inicio, boolean transforma){
		JSlider novo = new JSlider(JSlider.HORIZONTAL, minimo, maximo, inicio);
	
		novo.setSize(new Dimension(100, 45));
		
		novo.setPaintLabels(true);
		
		int razao = Character.getNumericValue(Float.toString(maximo).charAt(0));
		float valor;
		Integer inteiro;
		JLabel legenda;
		
		Hashtable labelTable = new Hashtable();
		for (int vezes = 0; vezes < 5; vezes++){
			valor = (maximo * (float)vezes / 4);
			inteiro = new Integer((int)valor);
			
			if (transforma){
				valor /= (maximo - minimo);
				valor *= razao;
				legenda = new JLabel(Float.toString(valor));
			}else{
				legenda = new JLabel(Integer.toString((int)valor));
			}				
			
			labelTable.put(inteiro, legenda);
		}
		
		novo.setLabelTable( labelTable );
		
		novo.setName(nome);
		
		novo.addChangeListener(this);
		
		return novo;
	}
	
	/**
	 * Criacao de um botao especial para exibicao do valor de um slider mestre
	 * @param mestre	Slider que tera o valor exibido
	 * @return			Botao construido
	 */
	private JButton criarValorSlider (JSlider mestre){
		padrao = new Dimension(100, 20);
		JButton novo = new JButton();
		float razao;
		
		razao = (float) Character.getNumericValue(Float.toString(mestre.getMaximum()).charAt(0));
		razao *= ((float)mestre.getValue() / mestre.getMaximum());
		
		novo.setText(mestre.getName() + ": " + razao);
		novo.setBorderPainted(false);
		novo.setContentAreaFilled(false);
		novo.setHorizontalAlignment(JButton.CENTER);
		novo.setVerticalAlignment(JButton.BOTTOM);
		novo.setBorder (null);
		
		novo.setMaximumSize		(padrao);
		novo.setMinimumSize		(padrao);
		novo.setPreferredSize	(padrao);
		
		return novo;
	}
	
	/**
	 * Criacao de uma caixa de marcacao padrao
	 * @return	Caixa construida
	 */
	private JCheckBox criarCheckBox (){
		JCheckBox novo = new JCheckBox ();
		
		novo.setSelected(false);
		
		novo.addItemListener(this);
		
		return novo;
	}
	
	/**
	 * Criacao de uma area de texto padrao
	 * @param nome			Nome a ser atribuido a area de texto
	 * @param textoInicial	Texto iniciado de maneira defautl
	 * @param executavel	Sinaliza se sera construido uma area de texto executavel ou
	 * nao
	 * @return				Area de texto construida
	 */
	private JTextField criarTextField (String nome, String textoInicial, boolean executavel){
		padrao = new Dimension (80, 20);
		JTextField novo = new JTextField();
		
		novo.setText (textoInicial);
		novo.setName (nome);

		if (executavel)
			novo.getDocument().addDocumentListener(this);
		else{
			
			novo.addMouseListener(this);
		}
		
		novo.setMinimumSize (padrao);
		novo.setMaximumSize (padrao);
		novo.setPreferredSize (padrao);
				
		return novo;
	}
	
	/**
	 * Adiciona um bloco vazio, na vertical, respeitando a largura informada
	 * @param componente	Componente grafico que recebera o bloco
	 * @param largura		Dimensao vertical do bloco
	 */
	private void addEspacoVazioVertical (JPanel componente, int altura) {
		componente.add(Box.createRigidArea(new Dimension (comprimentoMaximo, altura)));
	}

	
	
	/**
	 * Controle das acoes dos ambientes graficos
	 * @param evento Qual o componente que foi ativado
	 */
	public void actionPerformed(ActionEvent evento) {
		if ("escolheMel".equals(evento.getActionCommand())){
			System.out.println("Escolheu Melodia -> " + InterfaceGrafica.escolherMelodias.getSelectedIndex());
			if(InterfaceGrafica.escolherMelodias.getSelectedIndex() != 0)
				aSelecionar--;
			else
				aSelecionar++;
			
			if (aSelecionar == 0)
				visualizar.setEnabled(true);
			else
				visualizar.setEnabled(false);
		
		}else if ("escolheInst".equals(evento.getActionCommand())){
			System.out.println("Escolheu Instrumento -> " + + InterfaceGrafica.escolherInstrumentos.getSelectedIndex());
			
			if(InterfaceGrafica.escolherInstrumentos.getSelectedIndex() != 0)
				aSelecionar--;
			else
				aSelecionar++;
			
			if (aSelecionar == 0)
				visualizar.setEnabled(true);
			else
				visualizar.setEnabled(false);
		
		}else if ("salvar".equals(evento.getActionCommand())){
			System.out.println("Salvando");
		
		}else if ("visualizar".equals(evento.getActionCommand())){
			System.out.println("Visualizando");
		
		}
	}
	
	
	/**
	 * Controle da acao a ser tomada, com o deslize do slider
	 * @param fonte Fonte da acao
	 */
	public void stateChanged(ChangeEvent fonte) {
		Object origem = fonte.getSource(); 
		float razao;
		
		if (origem.equals(controleAndamento)){
			razao = (float) Character.getNumericValue(Float.toString(controleAndamento.getMaximum()).charAt(0));
			razao *= ((float)controleAndamento.getValue() / controleAndamento.getMaximum());
			valorAndamento.setText(controleAndamento.getName() + ": " + razao );
		
		}else if (origem.equals(controleTransposicao)){
			razao = (float) Character.getNumericValue(Float.toString(controleTransposicao.getMaximum()).charAt(0));
			razao *= ((float)controleTransposicao.getValue() / controleTransposicao.getMaximum());
			valorTransposicao.setText(controleTransposicao.getName() + ": " + razao );
		
		}else if (origem.equals(controleFatordeCorte)){
			razao = (float) Character.getNumericValue(Float.toString(controleFatordeCorte.getMaximum()).charAt(0));
			razao *= ((float)controleFatordeCorte.getValue() / controleFatordeCorte.getMaximum());
			valorFatordeCorte.setText(controleFatordeCorte.getName() + ": " + razao );
		
		}else if (origem.equals(controleFase)){
			valorFase.setText(controleFase.getName() + ": " + controleFase.getValue());
		
		}else if (origem.equals(controleLambda)){
			razao = (float) Character.getNumericValue(Float.toString(controleLambda.getMaximum()).charAt(0));
			razao *= ((float)controleLambda.getValue() / controleLambda.getMaximum());
			valorLambda.setText(controleLambda.getName() + ": " + razao );
		}
	}

	
	/**
	 * Controle da acao a ser tomada ao se alterar uma caixa de selecao
	 * @param fonte	Fonte da acao
	 */
	public void itemStateChanged(ItemEvent fonte) {
		Object origem = fonte.getItemSelectable();
		int acao = (fonte.getStateChange() - 1);
				
		if (origem.equals(controleInverterMel)){
			System.out.println("" + acao);
			
		}else if (origem.equals(controleSalvar)){
			if (acao == 0){
				salvar.setEnabled(true);
				nomeWave.setText("nome do arquivo");
				nomeWave.setForeground(new Color (128, 128, 128));
				nomeWave.setVisible(true);
			}else{
				salvar.setEnabled(false);
				nomeWave.setVisible(false);
			}
		}
	}

	
	/**
	 * Controle de acoes ao se inserir um caractere num
	 * campo de texto
	 * @param evento Evento registrado
	 */
	public void insertUpdate(DocumentEvent evento) {
		atualizacaoTexto (evento);
	}

	
	/**
	 * Controle de acoes ao remover um caractere num
	 * campo de texto
	 * @param evento Evento registrado
	 */
	public void removeUpdate(DocumentEvent evento) {
		atualizacaoTexto (evento);
	}

	/**
	 * Dispensável para este trabalho, mas obrigatório de declarar
	 */
	public void changedUpdate(DocumentEvent e) {
		
	}
	
	/**
	 * Tratando da area de texto alterada
	 * @param event Ocorrido com a area de texto
	 */
	private void atualizacaoTexto (DocumentEvent evento){
		System.out.println("atualizou -> ");
		Object fonte = evento.getDocument().getProperty("owner");
		
		
		if (fonte.equals(valorGanhoMel)){
			System.out.println("Ganho Mel -> " + valorGanhoMel.getText());
			
		
		}else if (fonte.equals(valorGanhoInst)){
			System.out.println("Ganho Inst -> " + valorGanhoInst.getText());
			
		}
	}

	/**
	 * Controle de acao ao se clicar na area de texto do nome
	 * do arquivo
	 * @param evento	Ocorrido com a area de texto
	 */
	public void mouseClicked(MouseEvent evento) {
		if ("nome do arquivo".equals(nomeWave.getText())){
			nomeWave.setText("");
			nomeWave.setForeground(new Color (0, 0, 0));
		}		
	}

	/**
	 * Dispensável para este trabalho, mas obrigatório de declarar
	 */
	public void mousePressed(MouseEvent e) {
	}

	/**
	 * Dispensável para este trabalho, mas obrigatório de declarar
	 */
	public void mouseReleased(MouseEvent e) {
	}

	/**
	 * Dispensável para este trabalho, mas obrigatório de declarar
	 */
	public void mouseEntered(MouseEvent e) {
	}

	/**
	 * Dispensável para este trabalho, mas obrigatório de declarar
	 */
	public void mouseExited(MouseEvent e) {
	}

}
