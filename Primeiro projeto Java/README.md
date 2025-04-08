# Dio Java
                            --VARIAVEIS--
- Variavies do tipo Float (fracionado) e Long (Longo) devem receber suas iniciais no final do seu valor 

- Para colocat uma variavel maior dentro de uma menor, deve ser colocado dessa forma. Ex:
 short numeroMenor = 1;
 int numeroMaior = numeroMenor;
 short numeroMenor2 = (short) numeroMaior;

-o valor pra uma variavel do tipo char dever ser declarado com aspas simples '';

- SEMPRE USAR DOUBLE PARA NUMEROS FRACIONADOS E INT PARA NUMEROS INTEIROS (a não ser que seja um long) - Sintaxe de uuma constante "final-tipo-nome"
 
                            -- OPERADORES --
- O operador "%" se chama modulo e serve pra verificar se um numero pode ser dividido fechado redondinho;
- O operador "+" serve para concatenar strings;
- Se numa variavel de valor numerico, for necessário torna la negativa, colacasse apenas o operador "-" na frente, mas para tornala positiva deve mutiplicar o valor da variavel por -1;
- Operador "++" é igual a +1 (incrementar), e "--" igual a -1 
- Operadores ternários "?:" são como um IF(?) - ESLSE(:), em operações simples de uma linha; EX:
  a=5
  b=6
  String resultado = ?(a==b) "verdadeiro" : "falso";