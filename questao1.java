/*1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;
enquanto K < INDICE faça
{
K = K + 1;
SOMA = SOMA + K;
}
imprimir(SOMA);
Ao final do processamento, qual será o valor da variável SOMA?
 */

public class questao1 {
  public static void main(String args[]) {
      int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
          K = K + 1;
          SOMA = SOMA + K;
      }

      // Imprimindo o valor da variável SOMA ao final do processamento
      System.out.println(SOMA);
  }
}

//RESPOSTA: Ao final do processamento, o valor da variável SOMA será 91
