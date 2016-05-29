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
	 */
	static Melodia melodiaPrincipal;
	/**
	 * 	Nota a ser manipulada, a fim de construção da melodia
	 */
	static Nota nota;
	/**
	 * Frequencia a ser atribuída à nota durante a melodia
	 */
	static float frequencia;
	/**
	 * Amplitude padrao a ser utilizado pelas notas
	 */
	static final int amplitudePadrao = 15;
	
	/**
	 * Construcao da melodia de maneira default
	 */
	public Melodias (){
		/*	Construção de uma melodia como vazia */
		melodiaPrincipal = new Melodia ();
		
		/*	Configuração do valor da seminima */
		melodiaPrincipal.setSeminima (1);
		
		/*	Configuração do andamento */
		melodiaPrincipal.setAndamento (60);
	}
	
	/**
	 * Construcao do refrao da musica "Let it Go",
	 * do filme Frozen - da Disney
	 * @return A melodia correspondente a estes compassos
	 */
	public static Melodia frozen (){
		/*	Construção default da melodia */
		new Melodias();
		
		/* Refrão */
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
		
		
		
		frequencia = IntervalosMusicais.D (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C3);
		nota = new Nota (melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.A (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.minima() + melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C3);
		nota = new Nota (melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C3);
		nota = new Nota (melodiaPrincipal.getSeminima(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.D (IntervalosMusicais.C4);
		nota = new Nota (melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C3);
		nota = new Nota (melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.A (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.minima() * 2, frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.Fsust (IntervalosMusicais.C3);
		nota = new Nota (melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.D (IntervalosMusicais.C3);
		nota = new Nota (melodiaPrincipal.getSeminima() + IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.D (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.minima() * 2, frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), 0, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (melodiaPrincipal.getSeminima(), IntervalosMusicais.C4, amplitudePadrao);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), IntervalosMusicais.C4, amplitudePadrao - 1);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao - 2);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), IntervalosMusicais.C4, amplitudePadrao - 3);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao - 4);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), IntervalosMusicais.C4, amplitudePadrao - 5);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.colcheia(), IntervalosMusicais.C4, amplitudePadrao - 6);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.B (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao - 7);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.G (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(), frequencia, amplitudePadrao - 8);
		melodiaPrincipal.addNota (nota);
		
		return melodiaPrincipal;
	}
	
	
}
