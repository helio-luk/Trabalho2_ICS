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
	static Melodia melodiaPrincipal = new Melodia ();
	
	/**
	 * Construcao de alguns compassos da musica "Let it Go"
	 * do filme Frozen, da Disney
	 * @return A melodia correspondente a estes compassos
	 */
	public static Melodia frozen (){
		Nota nota;
		int seminima;
		float C4 = IntervalosMusicais.oitavaAcima(IntervalosMusicais.C3);
		float frequencia;
		
		melodiaPrincipal.setSeminima (1);
		seminima = melodiaPrincipal.getSeminima ();
		
		/*	Primeiro compasso */
		frequencia = IntervalosMusicais.quartaAumentada (C4);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quintaJusta (C4);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.setimaMaior (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quartaAumentada (C4);
		nota = new Nota (seminima, frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quintaJusta (C4);
		nota = new Nota (seminima + IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		/*	Segundo compasso */
		frequencia = IntervalosMusicais.quartaAumentada (C4);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quintaJusta (C4);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.setimaMaior (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quintaJusta (C4);
		nota = new Nota (seminima, frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quartaAumentada (C4);
		nota = new Nota (seminima, frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.sextaMaior (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		/*	Terceiro compasso */
		frequencia = IntervalosMusicais.tercaMaior (C4);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quartaAumentada (C4);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.sextaMaior (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.tercaMaior (C4);
		nota = new Nota (seminima, frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quartaAumentada (C4);
		nota = new Nota (seminima, frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.sextaMaior (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		/*	Quarto Compasso */
		frequencia = IntervalosMusicais.segundaMaior (C4);
		nota = new Nota (IntervalosMusicais.minima(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		nota = new Nota (IntervalosMusicais.minima(seminima), C4, 15);
		melodiaPrincipal.addNota (nota);
		
		/*	Quinto compasso */
		frequencia = IntervalosMusicais.quartaAumentada (C4);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quintaJusta (C4);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.setimaMaior (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quartaAumentada (C4);
		nota = new Nota (seminima, frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quintaJusta (C4);
		nota = new Nota (seminima + IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		/*	Sexto compasso */
		frequencia = IntervalosMusicais.quartaAumentada (C4);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quintaJusta (C4);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.setimaMaior (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quintaJusta (C4);
		nota = new Nota (seminima, frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quartaAumentada (C4);
		nota = new Nota (seminima, frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.sextaMaior (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		/*	Sétimo compasso */
		frequencia = IntervalosMusicais.tercaMaior (C4);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quartaAumentada (C4);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.sextaMaior (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.tercaMaior (C4);
		nota = new Nota (seminima, frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.quartaAumentada (C4);
		nota = new Nota (seminima, frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.sextaMaior (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		/*	Oitavo compasso */
		frequencia = IntervalosMusicais.segundaMaior (C4);
		nota = new Nota (IntervalosMusicais.minima(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.segundaMenor (C4);
		nota = new Nota (seminima + IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		frequencia = IntervalosMusicais.tercaMaior (IntervalosMusicais.C3);
		nota = new Nota (IntervalosMusicais.colcheia(seminima), frequencia, 15);
		melodiaPrincipal.addNota (nota);
		
		return melodiaPrincipal;
	}
	
}
