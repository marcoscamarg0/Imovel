import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("digite o nome do vendedor: ");
        String nome = sc.nextLine();

        System.out.print("digite o valor do imóvel: R$ ");
        double valorImovel = sc.nextDouble();

        double comissao;


        if (valorImovel >= 50000) {
            comissao = valorImovel * 0.20;
        } else if (valorImovel >= 30000) {
            comissao = valorImovel * 0.15;
        } else {
            comissao = valorImovel * 0.10;
        }

        System.out.println("vendedor: " + nome);
        System.out.printf("valor do imóvel: R$ %.2f", valorImovel);
        System.out.printf("comissão: R$ %.2f", comissao);

        sc.close();
    }
}
