/*5) Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;

 */
public class questao5 {

    public static void main(String[] args) {
        String exemplo1 = "Exemplo de string 1";
        String exemplo2 = "Outro exemplo aqui";
        String exemplo3 = "Mais um exemplo para testar";

        System.out.println(reversaString(exemplo1.toCharArray()));
        System.out.println(reversaString(exemplo2.toCharArray()));
        System.out.println(reversaString(exemplo3.toCharArray()));
    }

    public static String reversaString(char[] charArray) {
        if (charArray == null) return "";
        if (charArray.length == 1) return new String(charArray); // cria um novo objeto

        int inicio = 0;
        int fim = charArray.length - 1;

        while (inicio < fim) {
            // Troca os caracteres na posição 'inicio' e 'fim'
            char temp = charArray[inicio];
            charArray[inicio] = charArray[fim];
            charArray[fim] = temp;

            // Move os índices para a próxima iteração
            inicio++;
            fim--;
        }

        // Retorna a string revertida
        return new String(charArray);
    }
}
