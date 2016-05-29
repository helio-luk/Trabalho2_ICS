/*	Pacote ao qual pertence */
package principal;


/** 
 * Constroi os intervalos musicais basicos, para ser implementados na
 * construcao de melodias
 * @author	Helio Santana
 * @author	Rodrigo Guimaraes
 * @version	1.0
 * @since	28/05/2016
 */
public class IntervalosMusicais {
	/**
	 * Nota DO central, referencia para a localizacao
	 */
	static final float C3 = 261.6f;
	
	/**
	 * Constroi o intervalo musical correspondente a segunda menor
	 * @param tom Representa o tom da escala em que a segunda sera
	 * aplicada
	 * @return Segunda-menor em relacao ao tom
	 */
	public static float segundaMenor (float tom){
		return (float)(tom * Math.pow(2, 1/12));
	}
	
	/**
	 * Constroi o intervalo musical correspondente a segunda maior
	 * @param tom Representa o tom da escala em que a segunda sera
	 * aplicada
	 * @return Segunda-maior em relacao ao tom
	 */
	public static float segundaMaior (float tom){
		return (float)(tom * Math.pow(2, 2/12));
	}
	
	/**
	 * Constroi o intervalo musical correspondente a terca menor
	 * @param tom Representa o tom da escala em que a terca sera
	 * aplicada
	 * @return Terca-menor em relacao ao tom
	 */
	public static float tercaMenor (float tom){
		return (float)(tom * Math.pow(2, 3/12));
	}
	
	/**
	 * Constroi o intervalo musical correspondente a terca maior
	 * @param tom Representa o tom da escala em que a terca sera
	 * aplicada
	 * @return Terca-maior em relacao ao tom
	 */
	public static float tercaMaior (float tom){
		return (float)(tom * Math.pow(2, 4/12));
	}
	
	/**
	 * Constroi o intervalo musical correspondente a quarta justa
	 * @param tom Representa o tom da escala em que a quarta sera
	 * aplicada
	 * @return Quarta-justa em relacao ao tom
	 */
	public static float quartaJusta (float tom){
		return (float)(tom * Math.pow(2, 5/12));
	}
	
	/**
	 * Constroi o intervalo musical correspondente a quarta aumentada
	 * @param tom Representa o tom da escala em que a quarta sera
	 * aplicada
	 * @return Quarta-aumentada em relacao ao tom
	 */
	public static float quartaAumentada (float tom){
		return (float)(tom * Math.pow(2, 6/12));
	}

	/**
	 * Constroi o intervalo musical correspondente a quinta justa
	 * @param tom Representa o tom da escala em que a quinta sera
	 * aplicada
	 * @return Quinta-justa em relacao ao tom
	 */
	public static float quintaJusta (float tom){
		return (float)(tom * Math.pow(2, 7/12));
	}
	
	/**
	 * Constroi o intervalo musical correspondente a sexta menor
	 * @param tom Representa o tom da escala em que a sexta sera
	 * aplicada
	 * @return Sexta-menor em relacao ao tom
	 */
	public static float sextaMenor (float tom){
		return (float)(tom * Math.pow(2, 8/12));
	}
	
	/**
	 * Constroi o intervalo musical correspondente a sexta maior
	 * @param tom Representa o tom da escala em que a sexta sera
	 * aplicada
	 * @return Sexta-maior em relacao ao tom
	 */
	public static float sextaMaior (float tom){
		return (float)(tom * Math.pow(2, 9/12));
	}
	
	/**
	 * Constroi o intervalo musical correspondente a setima menor
	 * @param tom Representa o tom da escala em que a setima sera
	 * aplicada
	 * @return Setima-menor em relacao ao tom
	 */
	public static float setimaMenor (float tom){
		return (float)(tom * Math.pow(2, 10/12));
	}
	
	/**
	 * Constroi o intervalo musical correspondente a setima maior
	 * @param tom Representa o tom da escala em que a setima sera
	 * aplicada
	 * @return Setima-maior em relacao ao tom
	 */
	public static float setimaMaior (float tom){
		return (float)(tom * Math.pow(2, 11/12));
	}
	
	/**
	 * Constroi o intervalo musical correspondente a oitava ascendente
	 * @param tom Representa o tom da escala em que a oitava sera
	 * aplicada
	 * @return Oitava ascendente em relacao ao tom
	 */
	public static float oitavaAcima (float tom){
		return (float)(tom * 2);
	}
	
	/**
	 * Constroi o intervalo musical correspondente a oitava descendente
	 * @param tom Representa o tom da escala em que a oitava sera
	 * aplicada
	 * @return Oitava descendente em relacao ao tom
	 */
	public static float oitavaAbaixo (float tom){
		return (float)(tom * .5f);
	}

	/**
	 * Constroi a duracao da semibreve proporcional em relacao a
	 * seminima ja definida 
	 * @param seminima Valor da seminima pre-determinado na melodia
	 * @return Valor da semibreve ajustado
	 */
	public static float semibreve (int seminima){
		return seminima * 4f;
	}
	
	/**
	 * Constroi a duracao da minima proporcional em relacao a
	 * seminima ja definida
	 * @param seminima Valor da seminima pre-determinado na melodia
	 * @return Valor da minima ajustado
	 */
	public static float minima (int seminima){
		return seminima * 2f;
	}
	
	/**
	 * Constroi a duracao da colcheia proporcional em relacao a
	 * seminima ja definida
	 * @param seminima Valor da seminima pre-determinado na melodia
	 * @return Valor da colcheia ajustado
	 */
	public static float colcheia (int seminima){
		return seminima * .5f;
	}
	
	/**
	 * Constroi a duracao da semicolcheia proporcional em relacao a
	 * seminima ja definida
	 * @param seminima Valor da seminima pre-determinado na melodia
	 * @return Valor da semicolcheia ajustado
	 */
	public static float semicolcheia (int seminima){
		return seminima * .25f;
	}
	
	/**
	 * Constroi a duracao da fusa proporcional em relacao a
	 * seminima ja definida
	 * @param seminima Valor da seminima pre-determinado na melodia
	 * @return Valor da fusa ajustado
	 */
	public static float fusa (int seminima){
		return seminima * .125f;
	}
	
	/**
	 * Constroi a duracao da semifusa proporcional em relacao a
	 * seminima ja definida
	 * @param seminima Valor da seminima pre-determinado na melodia
	 * @return Valor da semifusa ajustado
	 */
	public static float semifusa (int seminima){
		return seminima * .0625f;
	}
}
