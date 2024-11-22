import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Moto minhaMoto = new Moto();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a marca do carro? ");
        meuCarro.marca = scanner.nextLine();
        System.out.println("Qual o ano do carro? ");
        meuCarro.ano = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Carro");
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Ano: " + meuCarro.ano);
        meuCarro.acelerar();

        System.out.println("----------------------------------------------");

        System.out.println("Qual a marca da moto? ");
        minhaMoto.marca = scanner.nextLine();
        System.out.println("Qual o ano da moto? ");
        minhaMoto.ano = scanner.nextInt();

        System.out.println("Moto");
        System.out.println("Marca: " + minhaMoto.marca);
        System.out.println("Ano: " + minhaMoto. ano);
        minhaMoto.acelerar();
    }
}