package principal;

import sintese.Curva;
import sintese.Dispositivo;
import sintese.Envoltoria;
import sintese.Oscilador;
import sintese.Ruido;
import sintese.Somador;

public class Instrumento3 extends Dispositivo{
	
	Envoltoria envoltoria, envoltoriaFreq = null;
	Envoltoria envoltoriaFreqRuido = null;
	Ruido ruido = null;
	Somador somador, somador2 = null;
	Oscilador oscilador1, oscilador2 = null;
	
	private boolean canal;
	private float lambda;
	private float lambdaComplementar;
	private float fase;
	private float ganho = 1;
	private float fatorCorte;
	private Curva funcaoFrequencia = new Curva(720);
	
	public Instrumento3(){
		this.envoltoria = new Envoltoria();
		this.envoltoriaFreq = new Envoltoria();
		this.envoltoriaFreqRuido = new Envoltoria();
		this.ruido = new Ruido();
		this.oscilador1 = new Oscilador();
		this.oscilador2 = new Oscilador();
		
		this.setRelogio(0);
		this.fatorCorte = 1;
		this.setLambda(0.5f);
		this.setFase(0f);
	}
	
	public Instrumento3(float fc){
		this();
		this.fatorCorte = fc;
	}
	
	public Instrumento3(Envoltoria envoltoria, Ruido ruido, float fc){
		this(fc);
		this.envoltoria = envoltoria;
		this.ruido = ruido;		
	}
	
	public void relogio(){
		this.oscilador2.relogio();
	}
	
	public void setRelogio(long n){
		this.envoltoria.setRelogio(n);
		this.ruido.setRelogio(n);
		this.oscilador2.setRelogio(n);
		this.saida = this.oscilador2.getSaida()*((this.canal) ? this.lambdaComplementar : this.lambda);
		this.canal = !this.canal;
		this.reset();		
	}
	
	public float getSaida(){
		this.saida = this.oscilador2.getSaida()*((this.canal) ? this.lambdaComplementar : this.lambda);
		this.canal = !this.canal;
		return (this.ganho * this.saida);
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
	
	public void reset(){
		this.envoltoria.setCURVA(Principal.funcao1);
    	this.envoltoria.setDuracao(this.duracao);    	
        this.envoltoria.reset();
        
        this.funcaoFrequencia.addPonto(0f, this.frequencia);
        this.funcaoFrequencia.addPonto(720f, this.frequencia);
        
        this.envoltoriaFreq.setCURVA(this.funcaoFrequencia);
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
        
        this.oscilador1= new Oscilador(3000, 10, 0);
        this.oscilador1.setFase(this.fase);
        this.oscilador1.setDuracao(this.duracao);
        this.oscilador1.reset();
        
        
        this.somador = new Somador(this.somador, this.oscilador1 );
        this.somador.setDuracao(this.duracao);
        this.somador.reset();
        
        
        this.oscilador2 = new Oscilador(this.envoltoria, this.somador);
        this.oscilador2.setFase(this.fase);
        this.oscilador2.setDuracao(this.duracao);
        this.oscilador2.reset();
	}
	
	

}
