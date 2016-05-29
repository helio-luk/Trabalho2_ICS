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
	 * Possibilita o manuseio do ruido associado a amplitude
	 * Possibilita o manuseio do instrumento formado
	 * Controle do canal estereofonico que recebera as amostras
	 * Controle da estereofonia da saida do instrumento, para o  lado esquerdo
	 * Controle da estereofonia da saida do instrumento, para o lado direito
	 * Controle do angulo da fase do instrumento
	 * Controle da multiplicação sobre a amplitude do sinal do instrumento
	 * Controle da largura da banda de frequência do ruído
	 * Construcao do instrumento de maneira default
	 */
	Envoltoria envoltoria = null;	
	Ruido ruido = null;	
	Oscilador oscilador = null;	
	
    private boolean canal;   
    private float lambda;   
    private float lambdaComplementar;    
    private float fase;    
    private float ganho = 1;    
    private float fatorCorte;
	
    
	public Instrumento1 (){
		this.envoltoria = new Envoltoria();		
		this.ruido = new Ruido();	
		this.oscilador = new Oscilador();		
		this.setRelogio(0);	
		this.fatorCorte = 1;		
		this.setLambda (0.5f);		
		this.setFase (0f);
	}

	/**
	 *	Construcao do instrumento conhecendo o fator de corte
	 *	@param fc Fator de corte para a banda especificada
	 */
	public Instrumento1 (float fc){
		this();
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
		this(fc);		
		this.ruido = ruido;	
		this.envoltoria = envoltoria;
	}

	/**
	 * Aciona o relogio de modo a atualizar a saida do dispositivo.
	 */
	public void relogio(){
		this.oscilador.relogio();
	}
	
	/**
	 *	Configuracao do relogio interno, de modo que a saida correspondera
	 *	a n-esima chamada do relogio().
	 *	@param n N-esima posicao do relogio a ser considerada
	 */
	public void setRelogio (long n){		
		this.envoltoria.setRelogio(n);		
		this.ruido.setRelogio (n);		
		this.oscilador.setRelogio (n);		
		this.saida = this.oscilador.getSaida()*((this.canal) ? this.lambdaComplementar : this.lambda);		
		this.canal = !this.canal;	
	    this.reset();
	}

	/**
	 * Retorna a saida corrente deste instrumento
	 * @return Valor da saida corrigida pelo ganho
	 */
	public float getSaida (){		
		this.saida = this.oscilador.getSaida()*((this.canal) ? this.lambdaComplementar : this.lambda);		
		this.canal = !this.canal;
		return (this.ganho * this.saida);
    }

	/**
	 * Reseta o instrumento, garantindo a sua estrutura
	 */
    public void reset (){    	
    	this.envoltoria.setCURVA(Principal.funcao1);
    	this.envoltoria.setDuracao (this.duracao);    	
        this.envoltoria.reset();
        
        this.ruido.setDispositivoAmplitude (this.envoltoria);        
        this.ruido.setFrequencia ((float) this.frequencia * this.fatorCorte);        
        this.ruido.setFase (this.fase);        
        this.ruido.setDuracao (this.duracao);        
        this.ruido.reset();
        
        this.oscilador.setDispositivoAmplitude (this.ruido);        
        this.oscilador.setFrequencia ((float) this.frequencia);        
        this.oscilador.setFase (this.fase);        
        this.oscilador.setDuracao (this.duracao);        
        this.oscilador.reset();                
    }

    /**
     * Atribui valor ao ganho
     * @param ganho	Valor a ser atribuido ao ganho
     */
    public void setGanho (float ganho){    	
    	this.ganho = ganho;
    }
    
    /**
     * Atribui valor a duracao, em segundos
     * @param duracao Valor a ser atribuido a duracao
     */
    public void setDuracao (float duracao){    	
    	this.duracao = duracao;    
    	this.reset();    	
    }
    
    /**
     * Atribui valor a frequencia, em hertz
     * @param frequencia Valor a ser atribuido a frequencia
     */
    public void setFrequencia(float frequencia){    	
    	this.frequencia = frequencia;   	
    	this.reset();
    }
    
    /**
     * Atribui um valor de estereofonia para a saida do instrumento
     * @param lambda Porcentagem da saida esquerda (entre 0 e 1)
     */
    public void setLambda(double lambda){    	
    	this.lambda = (float) lambda;    	
    	this.lambdaComplementar = 1 - this.lambda;    	
    	this.reset();
    }
    
    /**
     * Atribui um valor ao gerador de envoltoria do instrumento
     * @param envoltoria Gerador de envoltória do instrumento
     */
    public void setEnvoltoria (Envoltoria envoltoria){   	
    	this.envoltoria = envoltoria;   	
    	this.reset();
    }
    
    /**
     * Atribui um valor ao angulo de fase do instrumento
     * @param fase Valor a ser atribuido a fase
     */
    public void setFase(float fase){
    	this.fase = fase;   
    	this.reset();
    }
}
