//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//C = 5 * ((F-32) / 9).
import java.util.Scanner; //Pacote importa (Habilita) o teclado
public class Exercicio9 {
    public static void main (String args[]) {
        Scanner enterScanner = new Scanner(System.in); // Atribui o nome "enterScanner" à entrada do teclado
        double x; // Aloca na memoria um espaço para a variável x 
        System.out.println("Digite a temperatura em Fahrenheit: "); // Imprime na tela a mensagem
        x = enterScanner.nextInt(); //Grava o valor digitado na variável x
        enterScanner.close(); //Encerra as entradas do teclado
        double c; // Aloca na memoria um espaço para a variável c
        c = 5 * ((x-32) / 9); //Realiza a conversão para Celsius
        System.out.println("A temperatura equivalente em celsius: " + c); // Imprime na tela a mensagem + o resultado da conversão
}
}