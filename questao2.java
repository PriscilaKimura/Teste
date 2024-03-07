/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
IMPORTANTE:
Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código; */

public static int fibonacci(int seriesLength) {
    if (seriesLength == 1 || seriesLength == 2) {
        return 1;
    } else {
        return fibonacci(seriesLength - 1) + fibonacci(seriesLength - 2);
    }
}

public static void main(String args[]) {
    int number = 4101;
    int i = 1;
    while (i > 0) {
        int fibnumber = fibonacci(i);
        if (fibnumber != number) {
            if (fibnumber > number) {
                System.out.println("Não pertence a Sequência de Fibonacci");
                break;
            } else {
                i++;
            }
        } else {
            System.out.println("Número é Fibonacci");
            break;
        }

    }
}

//Resposta: Não pertence a Sequência de Fibonacci

