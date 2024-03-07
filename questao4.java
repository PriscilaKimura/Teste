/*4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.
Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?
 */

import java.util.Scanner;

public class questao4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Três interruptores, 1000x são as tentativas de descobrir de qual sala pertencem
        int contagemInterruptor01 = 10;
        int contagemInterruptor02 = 20;
        int contagemInterruptor03 = 30;

        System.out.println("Informe o Interruptor 10, 20, 30");
        int interruptor = entrada.nextInt();

        // Sala 02
        // 2 Variáveis booleanas.
        boolean ida01 = true, ida02 = true; // Porque com certeza irei verificar
        // Ou seja, irei tentar ver de qual interruptor pertence a lâmpada da sala

        if (interruptor == 10) {
            // Só posso ir 2x na sala para tentar identificar o interruptor da lâmpada em questão
            if (ida01 == false) {
                // Faça algo se não consegui identificar o interruptor na primeira tentativa
            }

            if (ida02 == true) {
                // Faça algo se perdi a minha tentativa
            }

            // Você já fez suas 2 tentativas e perdeu a identificação de 1 interruptor
        }

        if (!ida01) {
            System.out.println("Perdi minha Tentativa");
        }

        if (ida02 && contagemInterruptor01 == 10) {
            System.out.println("Interruptor 01 da Sala 2");
        }

        // Sala 01
        if (!ida01) {
            System.out.println("Perdi minha Tentativa");
        }

        if (ida02 && contagemInterruptor02 == 20) {
            System.out.println("Interruptor 02 da Sala 1");
        }

        // Sala 03
        if (!ida01) {
            System.out.println("Perdi minha Tentativa");
        }

        if (ida02 && contagemInterruptor03 == 30) {
            System.out.println("Interruptor 03 da Sala 3");
        }
    }
}

//Resposta: Informe o Interruptor 10, 20, 30