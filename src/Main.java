import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Valor aleatório da máquina :)
        Scanner sc = new Scanner(System.in);
        String[] Maquina = {"Pedra", "Papel", "Tesoura"};
        Random rand = new Random();
        int indice = rand.nextInt(Maquina.length);
        String maquina = Maquina[indice];
        System.out.println(maquina);
        //valor escolhido pelo player
        System.out.println("Escolha um desses");
        System.out.println("Pedra - Papel - Tesoura");
        String escolha = sc.nextLine();
        //verificação
        if (maquina.equals(escolha)){
            System.out.printf("A máquina escolheu %s", maquina);
            System.out.println("\nEmpate");
        }
        if (maquina.equals("Pedra") && escolha.toLowerCase().equals("tesoura")) {
            System.out.printf("A máquina escolheu %s", maquina);
            System.out.println("Vitória da máquina");
        } else if (maquina.equals("Papel") && escolha.toLowerCase().equals("pedra")) {
            System.out.printf("A máquina escolheu %s", maquina);
            System.out.println("Vitória da máquina");
        }else if (maquina.equals("Tesoura") && escolha.toLowerCase().equals("papel")) {
            System.out.printf("A máquina escolheu %s", maquina);
            System.out.println("\nVitória da máquina");
        } else {
            System.out.printf("A máquina escolheu %s", maquina);
            System.out.println("\nVocê Ganhou");
        }
        sc.close();
    }
}