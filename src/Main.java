import sintese.*;
public class Main {
	
	Oscilador o1;
	
	public Main(){
		o1 = new Oscilador(10, 180, 90);
		
		Som som = new Som(o1, 0.5f, "simples.wav");
		som.salvawave();
		som.tocawave();
	}
	
	public static void main (String args[]){
		
		new Main();
		

	}

}
