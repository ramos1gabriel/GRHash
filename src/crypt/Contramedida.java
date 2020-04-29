package crypt;

import java.security.MessageDigest;
import java.util.ArrayList;

/**
 * 
 * @author gabrielsousa
 * CONTRAMEDIDAS PARA TENTATIVAS DE QUEBRA DE CRIPTOGRAFIA
 */
public class Contramedida {
	
    /**
     * Verifica possível tentativa de quebra de código por letras repitidas consecutivamente
     * 
     * @param frase informada pelo usuário
     * @return String criptografada em MD5 + sequencia aleatória + código de verificação
     */
	protected static String letraRepitidaConsecutiva(String frase) {
		
		ArrayList<String> listaString = new ArrayList<String>();
		char[] listaChar = frase.toCharArray();
		String fraseFinal = "";
		
        for (int x = 0; x < listaChar.length; x++) {
        	listaString.add(String.valueOf(listaChar[x]));
		}
		
		int count = 0;
		
		for (int i = 0 ; i < listaString.size(); i++) {
            if(listaString.get(i).equals(listaString.get((i+1 >= listaString.size() ? 0 : i+1)))) {
                count++;
            }
        }
		
		if(count > 5){
			//frasaFinal = (md5(listaString.get(0)) + gerarSequenciaAleatoria(listaString.get(0)) + geraCodigoVerificacao(2)) +"\n";
			fraseFinal = "TQC: Sequência de letras repitidas!";
		}
        
        return fraseFinal;
	}
	
	/**
     * Verifica se a frase é menor que três
     * 
     * @param frase informada pelo usuário
     * @return String criptografada em MD5 + sequencia aleatória + código de verificação
     */
	protected static String validaTamanho(String frase) {
		if(frase.length() <= 4) {
			//return gerarSequenciaAleatoria(frase)+""+md5(frase)+""+geraCodigoVerificacao(1);
			return "TQC: Tamanho da frase informada muito curta!";
		} else {
			return "";
		}
	}
	
	/**
     * Criptografa frase utilizando o algoritmo MD5 (irreversível)
     * 
     * @param frase informada pelo usuário
     * @return String criptografada em MD5
     */
	private static String md5(String frase) {
		String senha = "";
		
		try {
			MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
			byte messageDigest[] = algorithm.digest(frase.getBytes("UTF-8"));
			
			StringBuilder hexString = new StringBuilder();
			for (byte b : messageDigest) {
			  hexString.append(String.format("%02X", 0xFF & b));
			}
			
			senha = hexString.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return senha;
	}
	
	/**
     * Gera uma sequência de números aleatórios a partir de uma calculo maluco
     * 
     * @param frase informada pelo usuário
     * @return sequencia de numero do tipo Long
     */
	private static Long gerarSequenciaAleatoria(String frase) {
		int tamanho = frase.length();
		
		double n1 = Math.sqrt(tamanho) * Math.random();
		double n2 = Math.cos(tamanho) % Math.random();
		double n3 = Math.random();
		
		return Math.round((n1*n2)+n3/2);
	}
	
	/**
     * Gera código de verificação para contramedidas de quebra de criptografia
     * 
     * @param número do tipo de validação
     * @return String com o código de verificação
     */
	private static String geraCodigoVerificacao(int tipo) {
		
		if(tipo == 1){
			return "T21";
		} else if(tipo == 2){
			return "R38";
		} else {
			return "N/A";
		}
	}
	
	/**
     * Verifica código de verificação para identificar mensagem de crítica
     * 
     * @param listaCriptografada exata do código
     * @return String da mensagem de crítica
     */
	protected static String verificaCodigo(char[] listaCriptografada) {
		
		if(String.valueOf(listaCriptografada).contains("T21")){
			return "TQC: Tamanho da frase informada muito curta!";
		} else if(String.valueOf(listaCriptografada).contains("R38")){
			return "TQC: Sequência de letras repitidas!";
		} else {
			return "";
		}
	}
	
	protected static String verificaDescriptografia(String frase){
		String lista[] = Tabela.listaHash;
		boolean valida = false;
		
		for (int x = 0; x < lista.length; x++) {
        	if(frase.contains(lista[x])){
        		valida = true;
        	}
		}
		
		if(valida == true){
			return "Tentativa de quebra de criptografia";
		} else {
			return "";
		}
		
	}
}
