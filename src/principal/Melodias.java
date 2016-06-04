/*	Pacote ao qual pertence */
package principal;

/*	Importando Classes necessárias */
import sintese.Melodia;
import sintese.Nota;

/** 
 * Constroi as melodias personalizadas a serem tocadas pelos instrumentos
 * criados
 * @author	Helio Santana
 * @author	Rodrigo Guimaraes
 * @version	1.0
 * @since	28/05/2016
 */
public class Melodias {
	/**
	 * Melodia a ser modificada, independente do tema criado
	 * Nota a ser manipulada, a fim de construção da melodia
	 * Frequencia a ser atribuída à nota durante a melodia
	 * Amplitude padrao a ser utilizado pelas notas
	 * Construcao da melodia de maneira default
	 */
	
	static Melodia melodiaPrincipal;	
	static Nota nota;	
	static float frequencia;	
	static final int amplitudePadrao = 15;
	
	public Melodias (){
		
		melodiaPrincipal = new Melodia();		
		melodiaPrincipal.setSeminima(1);	
		melodiaPrincipal.setAndamento(60);
	}
	
	/**
	 * Construcao do refrao da musica "Let it Go",
	 * do filme Frozen - da Disney
	 * @return A melodia correspondente a estes compassos
	 */
	public static Melodia granada (){
		
		new Melodias();
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Gsust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		
		nota = new Nota (IntervalosMusicais.semicolcheia(), 0, 0);
		melodiaPrincipal.addNota (nota);
		
		
		
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
				
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
				
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
				
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), 0, 0);
		melodiaPrincipal.addNota (nota);
		
		
		nota = new Nota (IntervalosMusicais.colcheia(), 0, 0);
		melodiaPrincipal.addNota (nota);
		
		
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Gsust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		
		nota = new Nota (IntervalosMusicais.semicolcheia(), 0, 0);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
				
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
				
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
				
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		
		nota = new Nota (IntervalosMusicais.colcheia(), 0, 0);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), 0, 0);
		melodiaPrincipal.addNota (nota);
		
		
		
		
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), 0, 0);
		melodiaPrincipal.addNota (nota);
		nota = new Nota (IntervalosMusicais.colcheia(), 0, 0);
		melodiaPrincipal.addNota (nota);
		
		
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Asust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		
	
		
		
		return melodiaPrincipal;
	}
	
	public static Melodia frozen (){
		
		new Melodias();		
		
		frequencia = IntervalosMusicais.Dsust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Fsust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.minima() + melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Csust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Gsust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.minima() + melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);

		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Fsust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.E (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.E (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.E (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.E (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Fsust (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.minima() + melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		
		
		frequencia = IntervalosMusicais.Dsust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Fsust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.minima() + melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Csust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Gsust (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.minima() + melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.A (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), IntervalosMusicais.C5, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.A (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.A (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.minima() + melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		
		
		frequencia = IntervalosMusicais.D (IntervalosMusicais.C5);
		nota = new Nota (melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.A (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.minima() + melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.D (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.A (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.minima() * 2, frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Fsust (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.D (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.D (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.minima() * 2, frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), 0, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (melodiaPrincipal.getSeminima(), IntervalosMusicais.C5, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), IntervalosMusicais.C5, amplitudePadrao - 1);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao - 2);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), IntervalosMusicais.C5, amplitudePadrao - 3);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao - 4);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), IntervalosMusicais.C5, amplitudePadrao - 5);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), IntervalosMusicais.C5, amplitudePadrao - 6);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao - 7);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C4);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao - 8);
		melodiaPrincipal.addNota (nota);
		
		return melodiaPrincipal;
	}
	
	
}
