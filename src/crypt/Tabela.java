package crypt;

import java.util.ArrayList;

public class Tabela {
	
	//----------------------------------------NORMAL
	
	//NUMEROS (0123456789)
	protected static String NUMERO_0 = "0";
	protected static String NUMERO_1 = "1";
	protected static String NUMERO_2 = "2";
	protected static String NUMERO_3 = "3";
	protected static String NUMERO_4 = "4";
	protected static String NUMERO_5 = "5";
	protected static String NUMERO_6 = "6";
	protected static String NUMERO_7 = "7";
	protected static String NUMERO_8 = "8";
	protected static String NUMERO_9 = "9";

	//CARACTERES ESPECIAIS E OPERADORES... (!@//$%&*_+-/=\:.,""<>()){}| and space)
	protected static String SIMBOLO_EXCLAMACAO  = "!";
	protected static String SIMBOLO_ARROBA  = "@";
	protected static String SIMBOLO_HASHTAG  = "#";
	protected static String SIMBOLO_CIFRAO  = "$";
	protected static String SIMBOLO_PORCENTAGEM  = "%";
	protected static String SIMBOLO_ECOMERCIAL  = "&";
	protected static String SIMBOLO_ASTERISCO  = "*";
	protected static String SIMBOLO_UNDERSCORE  = "_";
	protected static String SIMBOLO_SOMA  = "+";
	protected static String SIMBOLO_SUBTRACAO  = "-";
	protected static String SIMBOLO_BARRA  = "/";
	protected static String SIMBOLO_IGUAL  = "=";
	protected static String SIMBOLO_PONTO  = ".";
	protected static String SIMBOLO_VIRGULA  = ",";
	protected static String SIMBOLO_DOIS_PONTOS  = ":";
	protected static String SIMBOLO_MENOR_QUE  = "<";
	protected static String SIMBOLO_MAIOR_QUE  = ">";
	protected static String SIMBOLO_ASPAS  = "\"";
	protected static String SIMBOLO_PLICA  = "'";
	protected static String SIMBOLO_CONTRABARRA  = "\\";
	protected static String SIMBOLO_BARRA_VERTICAL  = "|";
	protected static String SIMBOLO_ABRE_PARENTESES  = "(";
	protected static String SIMBOLO_FECHA_PARENTESES  = ")";
	protected static String SIMBOLO_FECHA_CHAVES  = "}";
	protected static String SIMBOLO_ABRE_CHAVES  = "{";
	protected static String SIMBOLO_ESPACO  = " ";

	//ALFABETO (abcdefghijklmnopqrstuvwxyz)
	protected static String LETRA_A  = "a";
	protected static String LETRA_B  = "b";
	protected static String LETRA_C  = "c";
	protected static String LETRA_D  = "d";
	protected static String LETRA_E  = "e";
	protected static String LETRA_F  = "f";
	protected static String LETRA_G  = "g";
	protected static String LETRA_H  = "h";
	protected static String LETRA_I  = "i";
	protected static String LETRA_J  = "j";
	protected static String LETRA_K  = "k";
	protected static String LETRA_L  = "l";
	protected static String LETRA_M  = "m";
	protected static String LETRA_N  = "n";
	protected static String LETRA_O  = "o";
	protected static String LETRA_P  = "p";
	protected static String LETRA_Q  = "q";
	protected static String LETRA_R  = "r";
	protected static String LETRA_S  = "s";
	protected static String LETRA_T  = "t";
	protected static String LETRA_U  = "u";
	protected static String LETRA_V  = "v";
	protected static String LETRA_W  = "w";
	protected static String LETRA_X  = "x";
	protected static String LETRA_Y  = "y";
	protected static String LETRA_Z  = "z";
	
	//----------------------------------------HASH
	
	//NUMEROS (0123456789)
	protected static String HASH_NUMERO_0 = "Ea";
	protected static String HASH_NUMERO_1 = "a9";
	protected static String HASH_NUMERO_2 = "z1";
	protected static String HASH_NUMERO_3 = "p0";
	protected static String HASH_NUMERO_4 = "H8";
	protected static String HASH_NUMERO_5 = "f3";
	protected static String HASH_NUMERO_6 = "0e";
	protected static String HASH_NUMERO_7 = "6j";
	protected static String HASH_NUMERO_8 = "l4";
	protected static String HASH_NUMERO_9 = "K5";
	
	//CARACTERES ESPECIAIS E OPERADORES... (!@//$%&*_+-/=\:.,""<>()){}| and space)
	protected static String HASH_SIMBOLO_EXCLAMACAO  = "5w";
	protected static String HASH_SIMBOLO_ARROBA  = "ep";
	protected static String HASH_SIMBOLO_HASHTAG  = "tU";
	protected static String HASH_SIMBOLO_CIFRAO  = "4Y";
	protected static String HASH_SIMBOLO_PORCENTAGEM  = "d8";
	protected static String HASH_SIMBOLO_ECOMERCIAL  = "eK";
	protected static String HASH_SIMBOLO_ASTERISCO  = "aG";
	protected static String HASH_SIMBOLO_UNDERSCORE  = "x7";
	protected static String HASH_SIMBOLO_SOMA  = "eA";
	protected static String HASH_SIMBOLO_SUBTRACAO  = "6R";
	protected static String HASH_SIMBOLO_BARRA  = "Pt";
	protected static String HASH_SIMBOLO_IGUAL  = "wX";
	protected static String HASH_SIMBOLO_PONTO  = "55";
	protected static String HASH_SIMBOLO_VIRGULA  = "eE";
	protected static String HASH_SIMBOLO_DOIS_PONTOS  = "Z3";
	protected static String HASH_SIMBOLO_MENOR_QUE  = "22";
	protected static String HASH_SIMBOLO_MAIOR_QUE  = "67";
	protected static String HASH_SIMBOLO_ASPAS  = "Wa";
	protected static String HASH_SIMBOLO_PLICA  = "yF";
	protected static String HASH_SIMBOLO_CONTRABARRA  = "wQ";
	protected static String HASH_SIMBOLO_BARRA_VERTICAL  = "eK";
	protected static String HASH_SIMBOLO_ABRE_PARENTESES  = "vC";
	protected static String HASH_SIMBOLO_FECHA_PARENTESES  = "wQ";
	protected static String HASH_SIMBOLO_FECHA_CHAVES  = "pR";
	protected static String HASH_SIMBOLO_ABRE_CHAVES  = "Rg";
	protected static String HASH_SIMBOLO_ESPACO  = "Ih";
	
	//ALFABETO (abcdefghijklmnopqrstuvwxyz)
	protected static String HASH_LETRA_A  = "Xc";
	protected static String HASH_LETRA_B  = "eW";
	protected static String HASH_LETRA_C  = "18";
	protected static String HASH_LETRA_D  = "qZ";
	protected static String HASH_LETRA_E  = "g7";
	protected static String HASH_LETRA_F  = "GG";
	protected static String HASH_LETRA_G  = "0L";
	protected static String HASH_LETRA_H  = "pO";
	protected static String HASH_LETRA_I  = "Pf";
	protected static String HASH_LETRA_J  = "0z";
	protected static String HASH_LETRA_K  = "oL";
	protected static String HASH_LETRA_L  = "Zz";
	protected static String HASH_LETRA_M  = "qE";
	protected static String HASH_LETRA_N  = "wJ";
	protected static String HASH_LETRA_O  = "Vg";
	protected static String HASH_LETRA_P  = "DD";
	protected static String HASH_LETRA_Q  = "Qp";
	protected static String HASH_LETRA_R  = "QQ";
	protected static String HASH_LETRA_S  = "s0";
	protected static String HASH_LETRA_T  = "21";
	protected static String HASH_LETRA_U  = "07";
	protected static String HASH_LETRA_V  = "72";
	protected static String HASH_LETRA_W  = "Kz";
	protected static String HASH_LETRA_X  = "bZ";
	protected static String HASH_LETRA_Y  = "o0";
	protected static String HASH_LETRA_Z  = "gF";
	
	
	protected static String[] listaHash = new String[]{
		HASH_NUMERO_0
		,HASH_NUMERO_1
		,HASH_NUMERO_2
		,HASH_NUMERO_3
		,HASH_NUMERO_4
		,HASH_NUMERO_5
		,HASH_NUMERO_6
		,HASH_NUMERO_7
		,HASH_NUMERO_8
		,HASH_NUMERO_9
		,HASH_SIMBOLO_EXCLAMACAO
		,HASH_SIMBOLO_ARROBA
		,HASH_SIMBOLO_HASHTAG
		,HASH_SIMBOLO_CIFRAO
		,HASH_SIMBOLO_PORCENTAGEM
		,HASH_SIMBOLO_ECOMERCIAL
		,HASH_SIMBOLO_ASTERISCO
		,HASH_SIMBOLO_UNDERSCORE
		,HASH_SIMBOLO_SOMA
		,HASH_SIMBOLO_SUBTRACAO
		,HASH_SIMBOLO_BARRA
		,HASH_SIMBOLO_IGUAL
		,HASH_SIMBOLO_PONTO
		,HASH_SIMBOLO_VIRGULA
		,HASH_SIMBOLO_DOIS_PONTOS
		,HASH_SIMBOLO_MENOR_QUE
		,HASH_SIMBOLO_MAIOR_QUE
		,HASH_SIMBOLO_ASPAS
		,HASH_SIMBOLO_PLICA
		,HASH_SIMBOLO_CONTRABARRA
		,HASH_SIMBOLO_BARRA_VERTICAL
		,HASH_SIMBOLO_ABRE_PARENTESES
		,HASH_SIMBOLO_FECHA_PARENTESES
		,HASH_SIMBOLO_FECHA_CHAVES
		,HASH_SIMBOLO_ABRE_CHAVES
		,HASH_SIMBOLO_ESPACO
		,HASH_LETRA_A
		,HASH_LETRA_B
		,HASH_LETRA_C
		,HASH_LETRA_D
		,HASH_LETRA_E
		,HASH_LETRA_F
		,HASH_LETRA_G
		,HASH_LETRA_H
		,HASH_LETRA_I
		,HASH_LETRA_J
		,HASH_LETRA_K
		,HASH_LETRA_L
		,HASH_LETRA_M
		,HASH_LETRA_N
		,HASH_LETRA_O
		,HASH_LETRA_P
		,HASH_LETRA_Q
		,HASH_LETRA_R
		,HASH_LETRA_S
		,HASH_LETRA_T
		,HASH_LETRA_U
		,HASH_LETRA_V
		,HASH_LETRA_W
		,HASH_LETRA_X
		,HASH_LETRA_Y
		,HASH_LETRA_Z};
	
	protected static String[] lista = new String[]{
		NUMERO_0
		,NUMERO_1
		,NUMERO_2
		,NUMERO_3
		,NUMERO_4
		,NUMERO_5
		,NUMERO_6
		,NUMERO_7
		,NUMERO_8
		,NUMERO_9
		,SIMBOLO_EXCLAMACAO
		,SIMBOLO_ARROBA
		,SIMBOLO_HASHTAG
		,SIMBOLO_CIFRAO
		,SIMBOLO_PORCENTAGEM
		,SIMBOLO_ECOMERCIAL
		,SIMBOLO_ASTERISCO
		,SIMBOLO_UNDERSCORE
		,SIMBOLO_SOMA
		,SIMBOLO_SUBTRACAO
		,SIMBOLO_BARRA
		,SIMBOLO_IGUAL
		,SIMBOLO_PONTO
		,SIMBOLO_VIRGULA
		,SIMBOLO_DOIS_PONTOS
		,SIMBOLO_MENOR_QUE
		,SIMBOLO_MAIOR_QUE
		,SIMBOLO_ASPAS
		,SIMBOLO_PLICA
		,SIMBOLO_CONTRABARRA
		,SIMBOLO_BARRA_VERTICAL
		,SIMBOLO_ABRE_PARENTESES
		,SIMBOLO_FECHA_PARENTESES
		,SIMBOLO_FECHA_CHAVES
		,SIMBOLO_ABRE_CHAVES
		,SIMBOLO_ESPACO
		,LETRA_A
		,LETRA_B
		,LETRA_C
		,LETRA_D
		,LETRA_E
		,LETRA_F
		,LETRA_G
		,LETRA_H
		,LETRA_I
		,LETRA_J
		,LETRA_K
		,LETRA_L
		,LETRA_M
		,LETRA_N
		,LETRA_O
		,LETRA_P
		,LETRA_Q
		,LETRA_R
		,LETRA_S
		,LETRA_T
		,LETRA_U
		,LETRA_V
		,LETRA_W
		,LETRA_X
		,LETRA_Y
		,LETRA_Z};
}
