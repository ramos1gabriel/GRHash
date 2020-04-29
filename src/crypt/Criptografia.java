package crypt;

import java.util.ArrayList;

public class Criptografia {
	
	private static ArrayList<String> listaString = new ArrayList<String>();
	private static char[] lista;
	private static String fraseCriptografada = "";
	private static String letraHash;
	
	private static ArrayList<String> listaStringCriptografada = new ArrayList<String>();
	private static char[] listaCriptografada;
	private static String fraseDescriptografada = "";
	private static String letraNormal;
	
	//public static void main(String[] args) {}
	
	public static String criptografar(String frase) {
		limpeza();
		//Transforma a frase em um array de letras
        lista = frase.toCharArray();
        
        /*String medida1 = Contramedida.letraRepitidaConsecutiva(frase);
        if(!medida1.isEmpty()){
        	return medida1;
        }*/
        
        String medida2 = Contramedida.validaTamanho(frase);
        if(!medida2.isEmpty()){
        	return medida2;
        }
        
        //Letra por letra vai criptografando e adicionando na nova lista do tipo String
        for (int x = 0; x < lista.length; x++) {
        	letraHash = geraGRHash(String.valueOf(lista[x]));
        	listaString.add(letraHash);
		}
        
        //Pega letra por letra e coloca em uma linha
        for (int i = 0; i < listaString.size(); i++) {
        	fraseCriptografada += listaString.get(i);
		}
        
        return fraseCriptografada.toUpperCase();
	}
	
	public static String descriptografar(String frase) {
		
		String medida1 = Contramedida.letraRepitidaConsecutiva(frase);
        if(!medida1.isEmpty()){
        	return medida1;
        }
		
		String medida2 = Contramedida.validaTamanho(frase);
        if(!medida2.isEmpty()){
        	return medida2;
        }
		
		limpeza();
		//Transforma a frase em um array de letras
		listaCriptografada = frase.toCharArray();
		
		/*String medida1 = Contramedida.verificaCodigo(listaCriptografada);
		if(!medida1.isEmpty()){
			return medida1;
		} else {}*/
		
		if(listaCriptografada.length % 2 == 0) {
			
	        for (int a = 0; a < listaCriptografada.length; a = a+2){
	        	letraNormal = desfazGRHash(listaCriptografada[a]+""+listaCriptografada[a+1]);
	        	listaStringCriptografada.add(letraNormal);
	        }
	        
	        for (int i = 0; i < listaStringCriptografada.size(); i++) {
	        	fraseDescriptografada += listaStringCriptografada.get(i);
			}
		} else {
			return "Não é uma mensagem criptografada usando o algoritmo GRHA-2!";
		}
        
        return fraseDescriptografada;
	}
	
	//GERA HASH
	protected static String geraGRHash(String letra){
		
		//NUMEROS
		if(Tabela.NUMERO_0.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_NUMERO_0;
		}
		if(Tabela.NUMERO_1.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_NUMERO_1;
		}
		if(Tabela.NUMERO_2.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_NUMERO_2;
		}
		if(Tabela.NUMERO_3.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_NUMERO_3;
		}
		if(Tabela.NUMERO_4.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_NUMERO_4;
		}
		if(Tabela.NUMERO_5.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_NUMERO_5;
		}
		if(Tabela.NUMERO_6.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_NUMERO_6;
		}
		if(Tabela.NUMERO_7.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_NUMERO_7;
		}
		if(Tabela.NUMERO_8.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_NUMERO_8;
		}
		if(Tabela.NUMERO_9.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_NUMERO_9;
		}
		
		//CARACTERES ESPECIAIS E OPERADORES
		if(Tabela.SIMBOLO_EXCLAMACAO.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_EXCLAMACAO;
		}
		if(Tabela.SIMBOLO_ARROBA.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_ARROBA;
		}
		if(Tabela.SIMBOLO_HASHTAG.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_HASHTAG;
		}
		if(Tabela.SIMBOLO_CIFRAO.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_CIFRAO;
		}
		if(Tabela.SIMBOLO_PORCENTAGEM.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_PORCENTAGEM;
		}
		if(Tabela.SIMBOLO_ECOMERCIAL.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_ECOMERCIAL;
		}
		if(Tabela.SIMBOLO_ASTERISCO.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_ASTERISCO;
		}
		if(Tabela.SIMBOLO_UNDERSCORE.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_UNDERSCORE;
		}
		if(Tabela.SIMBOLO_SOMA.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_SOMA;
		}
		if(Tabela.SIMBOLO_SUBTRACAO.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_SUBTRACAO;
		}
		if(Tabela.SIMBOLO_BARRA.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_BARRA;
		}
		if(Tabela.SIMBOLO_IGUAL.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_IGUAL;
		}
		if(Tabela.SIMBOLO_PONTO.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_PONTO;
		}
		if(Tabela.SIMBOLO_VIRGULA.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_VIRGULA;
		}
		if(Tabela.SIMBOLO_DOIS_PONTOS.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_DOIS_PONTOS;
		}
		if(Tabela.SIMBOLO_MENOR_QUE.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_MENOR_QUE;
		}
		if(Tabela.SIMBOLO_MAIOR_QUE.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_MAIOR_QUE;
		}
		if(Tabela.SIMBOLO_ASPAS.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_ASPAS;
		}
		if(Tabela.SIMBOLO_PLICA.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_PLICA;
		}
		if(Tabela.SIMBOLO_CONTRABARRA.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_CONTRABARRA;
		}
		if(Tabela.SIMBOLO_BARRA_VERTICAL.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_BARRA_VERTICAL;
		}
		if(Tabela.SIMBOLO_ABRE_PARENTESES.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_ABRE_PARENTESES;
		}
		if(Tabela.SIMBOLO_FECHA_PARENTESES.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_FECHA_PARENTESES;
		}
		if(Tabela.SIMBOLO_FECHA_CHAVES.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_FECHA_CHAVES;
		}
		if(Tabela.SIMBOLO_ABRE_CHAVES.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_ABRE_CHAVES;
		}
		if(Tabela.SIMBOLO_ESPACO.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_SIMBOLO_ESPACO;
		}
		
		//ALFABETO
		if(Tabela.LETRA_A.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_A;
		}
		if(Tabela.LETRA_B.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_B;
		}
		if(Tabela.LETRA_C.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_C;
		}
		if(Tabela.LETRA_D.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_D;
		}
		if(Tabela.LETRA_E.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_E;
		}
		if(Tabela.LETRA_F.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_F;
		}
		if(Tabela.LETRA_G.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_G;
		}
		if(Tabela.LETRA_H.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_H;
		}
		if(Tabela.LETRA_I.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_I;
		}
		if(Tabela.LETRA_J.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_J;
		}
		if(Tabela.LETRA_K.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_K;
		}
		if(Tabela.LETRA_L.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_L;
		}
		if(Tabela.LETRA_M.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_M;
		}
		if(Tabela.LETRA_N.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_N;
		}
		if(Tabela.LETRA_O.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_O;
		}
		if(Tabela.LETRA_P.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_P;
		}
		if(Tabela.LETRA_Q.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_Q;
		}
		if(Tabela.LETRA_R.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_R;
		}
		if(Tabela.LETRA_S.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_S;
		}
		if(Tabela.LETRA_T.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_T;
		}
		if(Tabela.LETRA_U.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_U;
		}
		if(Tabela.LETRA_V.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_V;
		}
		if(Tabela.LETRA_W.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_W;
		}
		if(Tabela.LETRA_X.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_X;
		}
		if(Tabela.LETRA_Y.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_Y;
		}
		if(Tabela.LETRA_Z.equalsIgnoreCase(letra)){
			letra = Tabela.HASH_LETRA_Z;
		}
		
		return letra;
	}
	
	//DESFAZ HASH
	private static String desfazGRHash(String letra){
		
		//NUMEROS
		if(Tabela.HASH_NUMERO_0.equalsIgnoreCase(letra)){
			letra = Tabela.NUMERO_0;
		}
		if(Tabela.HASH_NUMERO_1.equalsIgnoreCase(letra)){
			letra = Tabela.NUMERO_1;
		}
		if(Tabela.HASH_NUMERO_2.equalsIgnoreCase(letra)){
			letra = Tabela.NUMERO_2;
		}
		if(Tabela.HASH_NUMERO_3.equalsIgnoreCase(letra)){
			letra = Tabela.NUMERO_3;
		}
		if(Tabela.HASH_NUMERO_4.equalsIgnoreCase(letra)){
			letra = Tabela.NUMERO_4;
		}
		if(Tabela.HASH_NUMERO_5.equalsIgnoreCase(letra)){
			letra = Tabela.NUMERO_5;
		}
		if(Tabela.HASH_NUMERO_6.equalsIgnoreCase(letra)){
			letra = Tabela.NUMERO_6;
		}
		if(Tabela.HASH_NUMERO_7.equalsIgnoreCase(letra)){
			letra = Tabela.NUMERO_7;
		}
		if(Tabela.HASH_NUMERO_8.equalsIgnoreCase(letra)){
			letra = Tabela.NUMERO_8;
		}
		if(Tabela.HASH_NUMERO_9.equalsIgnoreCase(letra)){
			letra = Tabela.NUMERO_9;
		}
		
		//CARACTERES ESPECIAIS E OPERADORES
		if(Tabela.HASH_SIMBOLO_EXCLAMACAO.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_EXCLAMACAO;
		}
		if(Tabela.HASH_SIMBOLO_ARROBA.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_ARROBA;
		}
		if(Tabela.HASH_SIMBOLO_HASHTAG.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_HASHTAG;
		}
		if(Tabela.HASH_SIMBOLO_CIFRAO.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_CIFRAO;
		}
		if(Tabela.HASH_SIMBOLO_PORCENTAGEM.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_PORCENTAGEM;
		}
		if(Tabela.HASH_SIMBOLO_ECOMERCIAL.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_ECOMERCIAL;
		}
		if(Tabela.HASH_SIMBOLO_ASTERISCO.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_ASTERISCO;
		}
		if(Tabela.HASH_SIMBOLO_UNDERSCORE.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_UNDERSCORE;
		}
		if(Tabela.HASH_SIMBOLO_SOMA.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_SOMA;
		}
		if(Tabela.HASH_SIMBOLO_SUBTRACAO.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_SUBTRACAO;
		}
		if(Tabela.HASH_SIMBOLO_BARRA.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_BARRA;
		}
		if(Tabela.HASH_SIMBOLO_IGUAL.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_IGUAL;
		}
		if(Tabela.HASH_SIMBOLO_PONTO.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_PONTO;
		}
		if(Tabela.HASH_SIMBOLO_VIRGULA.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_VIRGULA;
		}
		if(Tabela.HASH_SIMBOLO_DOIS_PONTOS.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_DOIS_PONTOS;
		}
		if(Tabela.HASH_SIMBOLO_MENOR_QUE.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_MENOR_QUE;
		}
		if(Tabela.HASH_SIMBOLO_MAIOR_QUE.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_MAIOR_QUE;
		}
		if(Tabela.HASH_SIMBOLO_ASPAS.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_ASPAS;
		}
		if(Tabela.HASH_SIMBOLO_PLICA.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_PLICA;
		}
		if(Tabela.HASH_SIMBOLO_CONTRABARRA.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_CONTRABARRA;
		}
		if(Tabela.HASH_SIMBOLO_BARRA_VERTICAL.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_BARRA_VERTICAL;
		}
		if(Tabela.HASH_SIMBOLO_ABRE_PARENTESES.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_ABRE_PARENTESES;
		}
		if(Tabela.HASH_SIMBOLO_FECHA_PARENTESES.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_FECHA_PARENTESES;
		}
		if(Tabela.HASH_SIMBOLO_FECHA_CHAVES.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_FECHA_CHAVES;
		}
		if(Tabela.HASH_SIMBOLO_ABRE_CHAVES.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_ABRE_CHAVES;
		}
		if(Tabela.HASH_SIMBOLO_ESPACO.equalsIgnoreCase(letra)){
			letra = Tabela.SIMBOLO_ESPACO;
		}
		
		//ALFABETO
		if(Tabela.HASH_LETRA_A.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_A;
		}
		if(Tabela.HASH_LETRA_B.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_B;
		}
		if(Tabela.HASH_LETRA_C.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_C;
		}
		if(Tabela.HASH_LETRA_D.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_D;
		}
		if(Tabela.HASH_LETRA_E.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_E;
		}
		if(Tabela.HASH_LETRA_F.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_F;
		}
		if(Tabela.HASH_LETRA_G.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_G;
		}
		if(Tabela.HASH_LETRA_H.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_H;
		}
		if(Tabela.HASH_LETRA_I.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_I;
		}
		if(Tabela.HASH_LETRA_J.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_J;
		}
		if(Tabela.HASH_LETRA_K.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_K;
		}
		if(Tabela.HASH_LETRA_L.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_L;
		}
		if(Tabela.HASH_LETRA_M.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_M;
		}
		if(Tabela.HASH_LETRA_N.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_N;
		}
		if(Tabela.HASH_LETRA_O.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_O;
		}
		if(Tabela.HASH_LETRA_P.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_P;
		}
		if(Tabela.HASH_LETRA_Q.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_Q;
		}
		if(Tabela.HASH_LETRA_R.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_R;
		}
		if(Tabela.HASH_LETRA_S.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_S;
		}
		if(Tabela.HASH_LETRA_T.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_T;
		}
		if(Tabela.HASH_LETRA_U.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_U;
		}
		if(Tabela.HASH_LETRA_V.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_V;
		}
		if(Tabela.HASH_LETRA_W.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_W;
		}
		if(Tabela.HASH_LETRA_X.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_X;
		}
		if(Tabela.HASH_LETRA_Y.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_Y;
		}
		if(Tabela.HASH_LETRA_Z.equalsIgnoreCase(letra)){
			letra = Tabela.LETRA_Z;
		}
		
		return letra;
	}	
	
	private String geraHashComplexos(String letra, int vezes) {
		return null;
	}
	
	private static void limpeza() {
		listaString.clear();
		//lista = null;
		fraseCriptografada = "";
		letraHash = "";
		listaStringCriptografada.clear();
		//listaCriptografada = null;
		fraseDescriptografada = "";
		letraNormal= "";
	}
}