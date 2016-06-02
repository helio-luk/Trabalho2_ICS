package principal;

import sintese.Curva;
import sintese.Dispositivo;
import sintese.Envoltoria;
import sintese.Oscilador;
import sintese.Ruido;
import sintese.Somador;

public class Instrumento2 extends Dispositivo {

	Envoltoria envoltoria = null;
	Envoltoria envoltoriaFreq = null;
	Envoltoria envoltoriaFreqRuido = null;
	Ruido ruido = null;
	Oscilador oscilador = null;
	Somador somador = null;
	
	private boolean canal;
	private float lambda;
	private float lambdaComplementar;
	private float fase;
	private float ganho = 1;
	private float fatorCorte;
	
	
	
	public Instrumento2(){
		this.envoltoria = new Envoltoria();
		this.envoltoriaFreq = new Envoltoria();
		this.envoltoriaFreqRuido = new Envoltoria();
		this.ruido = new Ruido();
		this.oscilador = new Oscilador();
		
		
		this.setRelogio(0);
		this.fatorCorte = 1;
		this.setLambda(0.5f);
		this.setFase(0f);
	}
	
	public Instrumento2(float fc){
		this();
		this.fatorCorte = fc;
	}
	
	public Instrumento2(Envoltoria envoltoria, Ruido ruido, float fc){
		this(fc);
		this.envoltoria = envoltoria;
		this.ruido = ruido;		
	}
	
	public void relogio(){
		this.oscilador.relogio();
	}
	
	public void setRelogio(long n){
		this.envoltoria.setRelogio(n);
		this.ruido.setRelogio(n);
		this.oscilador.setRelogio(n);
		this.saida = this.oscilador.getSaida()*((this.canal) ? this.lambdaComplementar : this.lambda);
		this.canal = !this.canal;
		this.reset();
		
	}
	
	public float getSaida(){
		this.saida = this.oscilador.getSaida()*((this.canal) ? this.lambdaComplementar : this.lambda);
		this.canal = !this.canal;
		return (this.ganho * this.saida);
	}
	
	public void reset(){
		
		
		this.envoltoria.setCURVA(Principal.funcao1);
    	this.envoltoria.setDuracao(this.duracao);    	
        this.envoltoria.reset();        
        
        this.envoltoriaFreq.setCURVA(Principal.funcaoFrequencia);
        this.envoltoriaFreq.setDuracao(this.duracao);
        this.envoltoriaFreq.reset();
        
        this.envoltoriaFreqRuido.setCURVA(Principal.funcaoFrequenciaRuido);
        this.envoltoriaFreqRuido.setDuracao(this.duracao);
        this.envoltoriaFreqRuido.reset();        
        
        
        this.ruido = new Ruido(envoltoriaFreqRuido);   
        this.ruido.setFrequencia ((float) this.frequencia * this.fatorCorte);        
        this.ruido.setFase (this.fase); 
        this.ruido.setDuracao (this.duracao);        
        this.ruido.reset();
        
        this.somador = new Somador(this.ruido, this.envoltoriaFreq );
        this.somador.setDuracao(this.duracao);
        this.somador.reset();
        
        this.oscilador = new Oscilador(this.envoltoria, this.somador);
        this.oscilador.setFase(this.fase);
        this.oscilador.setDuracao(this.duracao);
        this.oscilador.reset();
        
        
        
		    
	}
	
	public void setGanho(float ganho){
		this.ganho = ganho;		
	}
	
	public void setDuracao (float duracao){    	
    	this.duracao = duracao;    
    	this.reset();    	
    }

	private void setFase(float f) {
		this.fase = f;		
	}

	public void setFrequencia(float frequencia){    	
    	this.frequencia = frequencia;   	
    	this.reset();
    }
	
	private void setLambda(float l) {
		this.lambda = l;		
	}
	
	public void setEnvoltoria (Envoltoria envoltoria){   	
    	this.envoltoria = envoltoria;   	
    	this.reset();
    }
	
	
	
	
}

