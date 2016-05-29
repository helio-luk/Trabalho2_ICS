/*	Pacote ao qual pertence */
package principal;

/*	Importando Classes necessárias */
import sintese.Dispositivo;
import sintese.Envoltoria;
import sintese.Oscilador;
import sintese.Ruido;

/** 
 * Constroi o primeiro instrumento especificado na 
 * <a href="http://cic.unb.br/~lcmm/cic-icsonica-2016-1/ics/trabalhos/t2/3instrumentosmusicv.png">imagem</a>,<br>
 * alem de possibilitar a execucao de melodias ou efeitos com tais intrumentos.
 * @author	Helio Santana
 * @author	Rodrigo Guimaraes
 * @version	1.0
 * @since	26/05/2016
 */

public class Instrumento1 extends Dispositivo{
	/**
	 * Possibilita o manuseio da envoltoria para a amplitude
	 */
	Envoltoria envoltoria = null;
	/**	
	 * Possibilita o manuseio do ruido associado a amplitude
	 */
	Ruido ruido = null;
	/**	
	 * Possibilita o manuseio do instrumento formado
	 */
	Oscilador oscilador = null;
	/**
	 * Controle do canal estereofonico que recebera as amostras
	 */
    private boolean    canal;
    /**
     * Controle da estereofonia da saida do instrumento, para o 
     * lado esquerdo
     */
    private float      lambda;
    /**
     * Controle da estereofonia da saida do instrumento, para o 
     * lado direito
     */
    private float      lambdaComplementar;
    /**
     * Controle do angulo da fase do instrumento
     */
    private float      fase;
    /**
     * Controle da multiplicação sobre a amplitude do sinal
     * do instrumento
     */
    private float      ganho = 1;
    /**
     * Controle da largura da banda de frequência do ruído
     */
    private float      fatorCorte;
	
    /**
	 *	Construcao do instrumento de maneira default
	 */
	public Instrumento1 (){
		/*	Criação da envoltória como vazia */
		this.envoltoria = new Envoltoria();
		
		/*	Criação do ruído como vazio */
		this.ruido = new Ruido ();
		
		/*	Criação do oscilador como vazio */
		this.oscilador = new Oscilador ();
		
		/*	Inicializa o oscilador na primeira batida do relógio */
		this.setRelogio (0);
		
		/*	Configuração do fator de corte default */
		this.fatorCorte = 1;
		
		/*	Configuração do lambda default */
		this.setLambda (0.5f);
		
		/*	Configuração da fase default */
		this.setFase (0f);
	}

	/**
	 *	Construcao do instrumento conhecendo o fator de corte
	 *	@param fc Fator de corte para a banda especificada
	 */
	public Instrumento1 (float fc){
		/*	Construção como vazio */
		this();
		
		/*	Atribuição do fator de corte */
		this.fatorCorte = fc;
	}
	
	/**
	 *	Construcao do instrumento conhecendo o ruido, sua envoltoria
	 *	e o fator de corte 
	 *	@param ruido Ruido caracteristico a ser considerado pelo instrumento
	 *	@param envoltoria Envoltoria caracteristica do ruido
	 *	@param fc Fator de corte para a banda especificada
	 */
	public Instrumento1 (Ruido ruido, Envoltoria envoltoria, float fc){
		/*	Constroi com o fator de corte */
		this(fc);
		
		/*	Atribuição do ruido */
		this.ruido = ruido;
		
		/*	Atribuição da envoltoria */
		this.envoltoria = envoltoria;
	}


	/**
	 * Aciona o relogio de modo a atualizar a saida do dispositivo.
	 */
	public void relogio (){
		this.oscilador.relogio ();
	}
	
	/**
	 *	Configuracao do relogio interno, de modo que a saida correspondera
	 *	a n-esima chamada do relogio().
	 *	@param n N-esima posicao do relogio a ser considerada
	 */
	public void setRelogio (long n){
		/*	Configurando o relógio da envoltória */
		this.envoltoria.setRelogio (n);
		
		/*	Configurando o relogio do ruído */
		this.ruido.setRelogio (n);
		
		/*	Configurando o relógio do oscilador */
		this.oscilador.setRelogio (n);
		
		/*	Configurando a saida */
		this.saida = this.oscilador.getSaida()*((this.canal) ? this.lambdaComplementar : this.lambda);
		
		/*	Revertendo troca de canal */
		this.canal = !this.canal;
		
	    this.reset();
	}

	/**
	 * Retorna a saida corrente deste instrumento
	 * @return Valor da saida corrigida pelo ganho
	 */
	public float getSaida (){         
		/*	Configurando a saída */
		this.saida = this.oscilador.getSaida()*((this.canal) ? this.lambdaComplementar : this.lambda);

		/* Troca do canal */
		this.canal = !this.canal;

		return (this.ganho * this.saida);
    }

	/**
	 * Reseta o instrumento, garantindo a sua estrutura
	 */
    public void reset (){    	
    	this.envoltoria.setCURVA(Principal.funcao1);
        /*	Igualando a duração da envoltória com a do instrumento */
    	this.envoltoria.setDuracao (this.duracao);
    	/*	Resetando a envoltória */
        this.envoltoria.reset();

        /*	Configurando a envoltória de amplitude do ruido*/ 
        this.ruido.setDispositivoAmplitude (this.envoltoria);
        /*	Configurando a frequência do ruido */
        this.ruido.setFrequencia ((float) this.frequencia * this.fatorCorte);
        /*	Configurando a fase do ruido */
        this.ruido.setFase (this.fase);
        /*	Igualando a duração do ruido com a do instrumento */
        this.ruido.setDuracao (this.duracao);
        /*	Resetando o ruido */
        this.ruido.reset();
                
        /*	Configurando a envoltoria de amplitude do oscilador */
        this.oscilador.setDispositivoAmplitude (this.ruido);
        /*	Configurando a frequência do oscilador */
        this.oscilador.setFrequencia ((float) this.frequencia);
        /*	Configurando a fase do oscilador */
        this.oscilador.setFase (this.fase);
        /*	Igualando a duração do oscilador com a do instrumento */
        this.oscilador.setDuracao (this.duracao);
        /*	Resetando o oscilador */
        this.oscilador.reset();                
    }

    /**
     * Atribui valor ao ganho
     * @param ganho	Valor a ser atribuido ao ganho
     */
    public void setGanho (float ganho){
    	/*	Atribuição em si */
    	this.ganho = ganho;
    }
    
    /**
     * Atribui valor a duracao, em segundos
     * @param duracao Valor a ser atribuido a duracao
     */
    public void setDuracao (float duracao){
    	/*	Configurando a duração do instrumento */
    	this.duracao = duracao;
    	
    	/*	Resetando todo o instrumento, considerando esta nova
    	 *	duração */
    	this.reset();    	
    }
    
    /**
     * Atribui valor a frequencia, em hertz
     * @param frequencia Valor a ser atribuido a frequencia
     */
    public void setFrequencia(float frequencia){
    	/*	Configurando a frequencia do instrumento */
    	this.frequencia = frequencia;
    	
    	/*	Resetando todo o instrumento, considerando esta nova
    	 *	frequencia */
    	this.reset();
    }
    
    /**
     * Atribui um valor de estereofonia para a saida do instrumento
     * @param lambda Porcentagem da saida esquerda (entre 0 e 1)
     */
    public void setLambda(double lambda){
    	/*	Configurando o lambda, lado esquerdo */
    	this.lambda = (float) lambda;
    	
    	/*	Configurando o lado direito */
    	this.lambdaComplementar = 1 - this.lambda;
      
    	/*	Resetando todo o instrumento, considerando este novo
    	 *	lambda */
    	this.reset();
    }
    
    /**
     * Atribui um valor ao gerador de envoltoria do instrumento
     * @param envoltoria Gerador de envoltória do instrumento
     */
    public void setEnvoltoria (Envoltoria envoltoria){
    	/*	Configuração da envoltória */
    	this.envoltoria = envoltoria;
    	
    	/*	Resetando todo o instrumento, considerando esta nova
    	 *	envoltoria */
    	this.reset();
    }
    
    /**
     * Atribui um valor ao angulo de fase do instrumento
     * @param fase Valor a ser atribuido a fase
     */
    public void setFase(float fase){
    	/*	Configuração da fase */
    	this.fase = fase;
    	
    	/*	Resetando todo o instrumento, considerando esta nova
    	 *	fase */
    	this.reset();
    }
}
