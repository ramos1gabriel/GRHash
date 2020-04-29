#!/usr/bin/perl

# DON'T use warnings; rsrs
use strict;
use Config;

# Algoritmo para criptografia de dados (caracteres e números)
#=============================================================================================
# Como funciona?

# Informando valores através de texto e números, dividimos o valor da variável
# pegando cada inteiro ou caractere, depois fazemos uma condição, "convertendo"
# esse dado em um conjunto de dois caracteres e/ou números inteiros que são definidos
# no próprio código, (dobrando o numero de bytes do dado informado).
# é extremamente importante que nunca se divulgue as informações equivalentes as conversões.
# NÃO CONSIDEREI TODOS OS CARACTERES NEM ACENTUAÇÃO... ISSO É APENAS UMA NOÇÃO BÁSICA



# Algorithm for encryption of data (characters and numbers)
#=============================================================================================
# How it works?

# Entering values through text and numbers, we divide the value of the variable
# catching each integer or character, then we make a condition, "converting"
# this data into a set of two cracteres and / or integer numbers that are defined
# in the code itself (by doubling the number of bytes of information reported).
# is extremely important to never disclose information equivalent conversions.
# Not consider ALL CHARACTERS OR ACCENT... THAT'S JUST A BASIC CONCEPT
#=============================================================================================

# By @Kouback_TR_
# koubacktr@gmail.com
# http://www.koubacktr.wordpress.com/
# http://www.twitter.com/Kouback_Tr_
# IRC:
# 	irc.anonnet.org
# 	6667
# 	#loc

my $os=$Config{osname};

if($os=="Linux"){
	system('clear');
}else{
	system('cls');
}

print"
============[ K2 - Cryptographic Hash ]=============
     00000
    00   00
    00   00                     11111111
 0000000000000   111111111111111111   11
 000000-000000   1111           11111111
 00000| |00000
 000000-000000
 0000000000000

\t\t\t\thttp://www.koubacktr.wordpress.com/
==================[by KoubackTr]====================
\n";

print "[!] Enter text to encrypt: \n";
print "[!] Informe um texto para criptografar: \n";
print "#~> ";
my $input = <STDIN>;


my (@geral) = split(//,$input);


print "\n\n\n";
print "\t\t[+]Normal: $input";
print "\t\t[+]Encrypted: ";

my $c_input=@geral;
my $i=0;

while( $i < $c_input){
	my $regra=$geral[$i];
	#print "$regra \n";

#NUMBERS (0123456789)

	if($regra eq 0){ #0 = Ea
	print "Ea";
	}
	if($regra==1){ #1 = a9
	print "a9";
	}
	if($regra==2){ #2 = z1
	print "z1";
	}
	if($regra==3){ #3 = p0
	print "p0";
	}
	if($regra==4){ #4 = H8
	print "H8";
	}
	if($regra==5){ #5 = f3
	print "f3";
	}
	if($regra==6){ #6 = 0e
	print "0e";
	}
	if($regra==7){ #7 = 6j
	print "6j";
	}
	if($regra==8){ #8 = l4
	print "l4";
	}
	if($regra==9){ #9 = K5
	print "K5";
	}
# END NUMBERS

#...

#SPECIAL CHARACTERS AND OPERATORS... (!@#$%&*_+-/=\:.,"'<>(){}| and space)

	if($regra eq '!'){ #! = 5w
	print "5w";
	}
	if($regra eq '@'){ #@ = ep
	print "ep";
	}
	if($regra eq '#'){ # # = tU
	print "tU";
	}
	if($regra eq '$'){ #$ = 4Y
	print "4Y";
	}
	if($regra eq '%'){ #% = d8
	print "d8";
	}
	if($regra eq '&'){ #& = eK
	print "eK";
	}
	if($regra eq '*'){ #* = aG
	print "aG";
	}
	if($regra eq '_'){ #_ = x7
	print "x7";
	}
	if($regra eq '+'){ #+ = eA
	print "eA";
	}
	if($regra eq '-'){ #- = 6R
	print "6R";
	}
	if($regra eq '/'){ # / = Pt
	print "Pt";
	}
	if($regra eq '='){ #= = wX
	print "wX";
	}
	if($regra eq '.'){ #. = 55
	print "55";
	}
	if($regra eq ','){ #, = eE
	print "eE";
	}
	if($regra eq ':'){ #: = Z3
	print "Z3";
	}
	if($regra eq '<'){ #< = 22
	print "22";
	}
	if($regra eq '>'){ #> = 67
	print "67";
	}
	if($regra eq "'"){ #' = wA
	print "Wa";
	}
	if($regra eq '"'){ #" = yF
	print "yF";
	}
	if($regra eq "\\"){ #\ = wQ
	print "wQ";
	}
	if($regra eq '|'){ #| = eK
	print "eK";
	}
	if($regra eq '('){ #( = vC
	print "vC";
	}
	if($regra eq ')'){ #) = Cv
	print "Cv";
	}
	if($regra eq '}'){ #} = pR
	print "pR";
	}
	if($regra eq '{'){ #{ = Rg
	print "Rg";
	}
	if($regra eq ' '){ #{ = Ih # SPACE "CHAR"
	print "Ih";
	}
# END SPECIAL CHARACTERS AND OPERATORS...

#...

# NORMAL CHARACTERS  (abcdefghijklmnopqrstuvwyxzç)
#                    (qwertyuiopasdfghjklçzxcvbnm)


	if($regra eq 'a' or $regra eq  'A'){ #a = Xc
	print "Xc";
	}
	if($regra eq 'b' or $regra eq  'B' ){ #b = eW
	print "eW";
	}
	if($regra eq 'c' or $regra eq  'C' ){ #c = 18
	print "18";
	}
	if($regra eq 'd' or $regra eq  'D'){ #d = qZ
	print "qZ";
	}
	if($regra eq 'e' or $regra eq  'E'){ #e = g7
	print "g7";
	}
	if($regra eq 'f' or $regra eq  'F'){ #f = GG
	print "GG";
	}
	if($regra eq 'g' or $regra eq  'G'){ #g = 0L
	print "0L";
	}
	if($regra eq 'h' or $regra eq  'H'){ #h = pO
	print "p0";
	}
	if($regra eq 'i' or $regra eq  'I'){ #i = Pf
	print "Pf";
	}
	if($regra eq 'j' or $regra eq  'J'){ #j = 0z
	print "0z";
	}
	if($regra eq 'k' or $regra eq  'K'){ #k = oL
	print "oL";
	}
	if($regra eq 'l' or $regra eq  'L'){ #l = Zz
	print "Zz";
	}
	if($regra eq 'm' or $regra eq  'M'){ #m = qE
	print "qE";
	}
	if($regra eq 'n' or $regra eq  'N'){ #n = wJ
	print "wJ";
	}
	if($regra eq 'o' or $regra eq  'O'){ #o = Vg
	print "Vg";
	}
	if($regra eq 'p' or $regra eq  'P'){ #p = DD
	print "DD";
	}
	if($regra eq 'q' or $regra eq  'Q'){ #q = Qp
	print "Qp";
	}
	if($regra eq 'r' or $regra eq  'R'){ #r = QQ
	print "QQ";
	}
	if($regra eq 's' or $regra eq  'S'){ #s = s0
	print "s0";
	}
	if($regra eq 't' or $regra eq  'T'){ #t = 21
	print "21";
	}
	if($regra eq 'u' or $regra eq  'U'){ #u = 07
	print "07";
	}
	if($regra eq 'v' or $regra eq  'V'){ #v = 72
	print "72";
	}
	if($regra eq 'x' or $regra eq  'X'){ #x = bZ
	print "bZ";
	}
	if($regra eq 'w' or $regra eq  'W'){ #w = Kz
	print "Kz";
	}
	if($regra eq 'y' or $regra eq  'Y'){ #y = o0
	print "o0";
	}
	if($regra eq 'z' or $regra eq  'Z'){ #z = gF
	print "gF";
	}
# BUG:	if($regra eq 'ç' or $regra eq  'Ç'){ #ç = 0V
# 	print "0V";
# 	}
	$i++; # +1 for return on while function..

# END NORMAL CHARACTERS...
}
print "\n\n";

__END__

# bye
